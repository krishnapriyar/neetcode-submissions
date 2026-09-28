class Solution {

    fun encode(strs: List<String>): String {

        var encoded = ""
        for(str in strs){
            encoded += "${str.length}#$str"
        }
        return encoded

    }

    fun decode(str: String): List<String> {
        var decoded = mutableListOf<String>()
        var i = 0
        while (i < str.length) {
            val delimiterIndex = str.indexOf('#', i)
            val length = str.substring(i, delimiterIndex).toInt()
            val s = str.substring(delimiterIndex + 1, delimiterIndex + 1 + length)
            decoded.add(s)
            i = delimiterIndex + 1 + length
        }

        return decoded

    }
}
