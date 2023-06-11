import math


def gcd(a: int, b: int):
    if a == 0:
        return b
    return gcd(b % a, a)


def solve(num_list: list):
    if len(num_list) == 1:
        return "NO"
    elif math.gcd(*num_list) == 1:
        return "YES"
    else:
        return "NO"


if __name__ == '__main__':
    t = int(input())
    while t > 0:
        n = int(input())
        num_list = list(map(int, input().split(" ")))
        print(solve(num_list))
        t -= 1
