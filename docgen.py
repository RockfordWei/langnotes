import os
def load(topic, ext="py", markdown="python", markstart=None, markend=None):
    with open("%s.%s" % (topic, ext), "r") as file:
        lines = file.readlines()
    if markstart and markend:
        content = []
        started = None
        for line in lines:
            if started:
                if markend in line:
                    break
                else:
                    content.append(line)
            else:
                if markstart in line:
                    started = True
        lines = content
    lines = list(map(lambda x: x.rstrip(), lines))
    lines.insert(0, "\n```%s\n" % markdown)
    lines.append("\n```\n")
    return "\n".join(lines)
def build(topic=None):
    if topic:
        p = load(topic)
        j = load(topic, ext="java", markdown="java",markstart="main", markend="return")
        return "<tr>\n<td>\n%s\n</td>\n<td>\n%s\n</td>\n</tr>\n" % (p, j)
    else:
        return "<table><thead><th>python</th><th>java</th></thead><tbody>"
topics = list(map(lambda x: x.replace(".java", ""), list(filter(lambda x: x.endswith(".java"), os.listdir()))))
topics.insert(0, None)
table = "\n".join(list(map(build, topics)))
print("# Language Notes")
print(table)