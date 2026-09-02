# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rob(self, root: Optional[TreeNode]) -> int:
        def dfs(node):
            if node is None:
                return [0,0]
            left = dfs(node.left)
            right = dfs(node.right)

            # don't rob the current node
            not_rob = max(left) + max(right)

            rob = node.val + left[0] + right[0]

            return [not_rob , rob]
        result = dfs(root)
        return max(result )



        