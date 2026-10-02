class Solution {
    fun maxArea(heights: IntArray): Int {
        var i = 0
        var j = heights.size - 1
        var area = 0

        while(i < heights.size && j > 0){
            var curArea = (j - i) * min(heights[i], heights[j])
            if(curArea > area){
                area = curArea
            }
            if(heights[i] <  heights[j]){
                    i++
                }else{
                    j--
                }
        }

        return area

    }
}
