class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        def backtrack(i, xor_total):
            if i == len(nums):
                return xor_total
            # take
            take = backtrack(i + 1, xor_total ^ nums[i])

            dont_take = backtrack(i + 1, xor_total)

            return take + dont_take

        return backtrack(0, 0)
