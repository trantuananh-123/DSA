from math import gcd

m = 10 ** 9 + 7
for _ in range(int(input())):
    a, b, n = map(int, input().split())
    if a == b:
        print((pow(a, n, m) + pow(b, n, m)) % m)
    else:
        print(gcd(a - b, (2 * pow(b, n, a - b)) % (a - b)))
