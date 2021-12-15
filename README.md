# Python Vs Java Quick Note
<table><thead><th>topic</th><th>python</th><th>java</th></thead><tbody>
<tr>
<td>reduce</td>
<td>

```python

from functools import reduce
data = [1, 2, 3]
total = reduce(lambda x, y: x + y, data)
print(total, sum(data))

```

</td>
<td>

```java

List<Integer> data = List.of(1, 2, 3);
int total = data.stream().reduce(0, (x, y) -> x + y);
System.out.println(total);

```

</td>
</tr>

<tr>
<td>map</td>
<td>

```python

a = [1, 2, 3]
b = list(map(lambda x: x * 2, a))
print(b)

```

</td>
<td>

```java

List<Integer> a = List.of(1, 2, 3);
List<Integer> b = a.stream().map(x -> x * 2)
.collect(Collectors.toCollection(ArrayList::new));

for(int i = 0; i < b.size(); i++) {
System.out.printf("%d\t", b.get(i));
}

```

</td>
</tr>

<tr>
<td>sort</td>
<td>

```python

lst = [9, 5, 2, 7]
lst.sort()
print(lst)

```

</td>
<td>

```java

ArrayList<Integer> data
= new ArrayList<>(
Arrays.asList(9, 5, 2, 7)
);
Collections.sort(data);
System.out.println(data);

```

</td>
</tr>

<tr>
<td>filter</td>
<td>

```python

a = [1, 2, 3]
b = list(filter(lambda x: x % 2, a))
print(b)

```

</td>
<td>

```java

List<Integer> a = List.of(1, 2, 3);
List<Integer> b = a.stream().filter(x -> x % 2 != 0)
.collect(Collectors.toCollection(ArrayList::new));

for(int i = 0; i < b.size(); i++) {
System.out.printf("%d\t", b.get(i));
}

```

</td>
</tr>

<tr>
<td>dict</td>
<td>

```python

dinner = {
"appetizer": "apple",
"beverage": "beer",
"course": "crawfish",
"desert": "donut"}
print(dinner)

```

</td>
<td>

```java

HashMap<String, String> dinner = new HashMap<>();
dinner.put("appetizer", "apple");
dinner.put("beverage", "beer");
dinner.put("course", "crawfish");
dinner.put("desert", "donut");
for(Iterator i = dinner.entrySet().iterator(); i.hasNext();) {
Map.Entry j = (Map.Entry)i.next();
System.out.printf("%s: %s\t", j.getKey(), j.getValue());
}

```

</td>
</tr>

<tr>
<td>list</td>
<td>

```python

lst = [x + 1 for x in range(10)]
print(lst)

```

</td>
<td>

```java

ArrayList<Integer> lst = new ArrayList<>();
for(int i = 0; i < 10; i++) {
lst.add(i);
lst.set(i, i + 1);
}
for(int i = 0; i < lst.size(); i++) {
System.out.printf("%d\t", lst.get(i));
}

```

</td>
</tr>

<tr>
<td>set</td>
<td>

```python

s = [(-1) ** x for x in range(10)]
s = set(s)
print(s)

```

</td>
<td>

```java

HashSet<Integer> s = new HashSet<>();
for(int x = 0; x < 10; x++) {
int y = (int)Math.pow((double)-1, (double)x);
s.add(y);
}
for(Iterator<Integer> i = s.iterator(); i.hasNext();) {
Integer x = i.next();
System.out.printf("%d\t", x);
}

```

</td>
</tr>

