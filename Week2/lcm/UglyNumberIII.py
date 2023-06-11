import math


class Solution:
    def nthUglyNumber(self, n: int, a: int, b: int, c: int) -> int:
        # Condition: Are there at least n ugly numbers smaller than or equal to value?
        def countUglyNumbers(value):
            count = (value // a) + (value // b) + (value // c) + (value // abc)
            count -= ((value // ab) + (value // bc) + (value // ac))
            return count >= n

        ab = math.lcm(a, b)  # LCM of a and b
        bc = math.lcm(b, c)  # LCM of b and c
        ac = math.lcm(a, c)  # LCM of a and c
        abc = math.lcm(ab, c)  # LCM of a, b, and c

        left, right = 1, (2 * 10 ** 9)
        while left < right:
            mid = left + (right - left) // 2
            if countUglyNumbers(mid):
                right = mid
            else:
                left = mid + 1
        return left
