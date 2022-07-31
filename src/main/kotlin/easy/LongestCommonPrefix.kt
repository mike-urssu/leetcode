package easy

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var commonPrefix = ""

        val shortestString = getShortestString(strs)
        for (index in shortestString.indices) {
            if (isEveryCharacterAtThatIndexSame(strs, index))
                commonPrefix += shortestString[index]
            else
                break
        }
        return commonPrefix
    }

    private fun getShortestString(strs: Array<String>): String {
        var shortestString = ""

        var size = Int.MAX_VALUE
        for (str in strs) {
            if (size > str.length) {
                size = str.length
                shortestString = str
            }
        }

        return shortestString
    }

    private fun isEveryCharacterAtThatIndexSame(strs: Array<String>, index: Int): Boolean {
        var isSame = true

        val character = strs[0][index]
        for (str in strs) {
            if (character != str[index]) {
                isSame = false
                break
            }
        }

        return isSame
    }
}