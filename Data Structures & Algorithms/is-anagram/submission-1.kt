class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        var counts = IntArray(26) // to store count of each letter
        if(s.length != t.length) {
            return false
        }
        for(index in s.indices){
            var counterIndex = s[index].code - 97
            counts[counterIndex]++
            counterIndex = t[index].code - 97
            counts[counterIndex]--
        }

        return counts.none{i -> i > 0} 

    }
}
