T = int(input())


def sol(x):
    if x == 1:
        return 1
    elif x == 2:
        return 2
    elif x == 3:
        return 4
    else:
        return sol(x - 1) + sol(x - 2) + sol(x - 3)


for i in range(T):
    n = int(input())
    print(sol(n))
