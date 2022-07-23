package easy

// https://www.notion.so/TwoSum-28b0bbb0030945e88705094fe3fa5a49

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val solution = IntArray(2)
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            if (map.containsKey(nums[i])) {
                solution[0] = map[nums[i]]!!
                solution[1] = i
                break
            }
            map[target - nums[i]] = i
        }

        return solution
    }
}
