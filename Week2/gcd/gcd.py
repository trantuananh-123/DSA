def gcd(a: int, b: int):
    if a == 0:
        return b
    return gcd(b % a, a)


if __name__ == "__main__":
    a, b = list(map(int, input().split(" ")))
    print(gcd(a, b))
