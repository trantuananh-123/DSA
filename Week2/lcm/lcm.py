def gcd(a: int, b: int):
    if a == 0:
        return b
    return gcd(b % a, a)


def lcm(a: int, b: int):
    return a * b // gcd(a, b)


if __name__ == "__main__":
    a, b = list(map(int, input().split(" ")))
    print(lcm(a, b))
