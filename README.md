# Language Notes
<table><thead><th>python</th><th>java</th></thead><tbody>
<tr>
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

