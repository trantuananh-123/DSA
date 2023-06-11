import math


def gcd(a: int, b: int):
    if a == 0:
        return b
    return gcd(b % a, a)


def lcm(a: int, b: int):
    return a * b // gcd(a, b)


if __name__ == "__main__":
    n, a, b = list(map(int, input().split(" ")))
    lcm = a * b // gcd(a, b)
    l, r = 2, 10 ** 14
    while l <= r:
        mid = (l + r) // 2
        nth = mid // a + mid // b - mid // lcm
        if nth >= n:
            r = mid - 1
        else:
            l = mid + 1
    print(l % (10 ** 9 + 7))
