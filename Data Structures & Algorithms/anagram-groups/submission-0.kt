class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var anagramGroup = mutableMapOf<List<Int>, MutableList<String>>()

        for(index in strs.indices){
            var counter = getLetterCounts(strs[index]).toList()

            if(anagramGroup.containsKey(counter)){
                anagramGroup[counter]?.add(strs[index])
            }else{
                anagramGroup[counter] = mutableListOf(strs[index])
            }
        }

        return anagramGroup.values.toList();

    }

    fun getLetterCounts(str1: String) : IntArray {
        var counts = IntArray(26)
        for (i in str1.indices){
            counts[str1[i].code - 97]++
        }
        return counts
    }
}
