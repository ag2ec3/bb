a = [1, 2, 4, 6, 7]
b = []
for i in a:
    if not i % 2:
        b += [i]
print(b)