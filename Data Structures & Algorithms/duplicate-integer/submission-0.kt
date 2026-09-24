class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val numSet = nums.toSet()
        return numSet.size != nums.size
    }
}
