import os
def load(topic, ext="py", markstart=None, markend=None):
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
    row = "<br>".join(lines)
    return "`%s`" % row
def build(topic=None):
    if topic:
        p = load(topic)
        j = load(topic, ext="java", markstart="main", markend="return")
        return "%s|%s" % (p, j)
    else:
        return "python|java\n---|---"
topics = list(map(lambda x: x.replace(".java", ""), list(filter(lambda x: x.endswith(".java"), os.listdir()))))
topics.insert(0, None)
table = "\n".join(list(map(build, topics)))
print("# Language Notes")
print(table)