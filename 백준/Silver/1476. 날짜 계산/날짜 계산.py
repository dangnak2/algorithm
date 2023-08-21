e, s, m = map(int, input().split())

year = 1

while True:
    if(year - e) % 15 == 0 and (year - s) % 28 == 0 and (year - m) % 19 == 0:
        break
        
    # 정답까지의 모든 경우의 수 탐색 -> 브루트포스
    year += 1

print(year)