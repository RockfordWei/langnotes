a = [1, 2, 3]
f = lambda x: x % 2
b = list(filter(f, a))
print(b)