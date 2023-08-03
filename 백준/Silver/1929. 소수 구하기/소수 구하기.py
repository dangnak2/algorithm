n, m = list(map(int, input().split()))

def isPrime(num):
		# 1은 소수가 아님
    if(num==1):
        return False

	# 2이상 부터 이중 for문으로 2부터 해당 수까지 반복문을 돌려 0으로 나누어떨어지는지 확인
    # 나누어 떨어지면 소수가 아니므로 바로 False 
    else:
        for i in range(2, int(num**0.5) + 1):
            if(num%i == 0):
                return False
				# 이중 for문을 다 돌고 나오면, 0으로 나누어떨어지는 수가 없다는 의미
				# 즉, 소수
        return True

for i in range(n, m+1):
    if isPrime(i):
        print(i)
