import sys

input = sys.stdin.readline()

a, b, c = map(int, input.split())

result = list()
result.append((a+b)%c)
result.append(((a%c) + (b%c))%c)
result.append((a*b)%c)
result.append(((a%c)*(b%c))%c)

for i in range(0, len(result)):
    print(result[i])

