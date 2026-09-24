class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val numSet = nums.toHashSet()
        return numSet.size != nums.size
    }
}
