from functools import reduce
data = [1, 2, 3]
add = lambda x, y: x + y
total = reduce(add, data)
print(total, sum(data))