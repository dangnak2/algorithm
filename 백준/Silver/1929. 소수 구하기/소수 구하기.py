
# 시간초과
# n, m = list(map(int, input().split()))
# a = list()
# for i in range(n, m+1):
#     cnt = 0
#     if(i > 1):
#         for j in range(2, i):
#             if(i % j == 0):
#                 cnt += 1
#                 break
#
#     if(cnt != 1):
#         a.append(i)
#
# for i in range(len(a)):
#     print(a[i])

n, m = list(map(int, input().split()))

def isPrime(num):
    if(num==1):
        return False

    else:
        for i in range(2, int(num**0.5) + 1):
            if(num%i == 0):
                return False
        return True

for i in range(n, m+1):
    if isPrime(i):
        print(i)


