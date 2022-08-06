class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var leftIndex = 0
        var rightIndex = nums.size - 1

        while (leftIndex < nums.size && leftIndex < rightIndex) {
            if (nums[leftIndex] == `val`) {
                while (nums[rightIndex] == `val` && leftIndex < rightIndex)
                    rightIndex--
                swap(nums, leftIndex, rightIndex--)
            }
            leftIndex++
        }

        val index = nums.indexOf(`val`)
        return if (index == -1) nums.size else index
    }

    private fun swap(nums: IntArray, leftIndex: Int, rightIndex: Int) {
        val temp = nums[leftIndex]
        nums[leftIndex] = nums[rightIndex]
        nums[rightIndex] = temp
    }
}