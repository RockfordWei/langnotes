from functools import reduce
data = [1, 2, 3]
total = reduce(lambda x, y: x + y, data)
print(total, sum(data))