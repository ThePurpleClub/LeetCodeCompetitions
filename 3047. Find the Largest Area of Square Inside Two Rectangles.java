//3047. Find the Largest Area of Square Inside Two Rectangles
//weekly contest 386
class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long maxArea = 0;
        
        for(int i = 0; i<bottomLeft.length; i++){
            for(int j = i + 1; j<bottomLeft.length; j++){
                int[] intersect = findIntersect(bottomLeft[i], topRight[i], bottomLeft[j], topRight[j]);
                if(intersect!=null){
                    long side = Math.min(intersect[1] - intersect[0], intersect[3]-intersect[2]);
                    maxArea = Math.max(maxArea, side*side);
                }
            }
        }
        return maxArea;
    }
    
    public int[] findIntersect(int[] a1, int[] b1, int[] a2, int[] b2){
        int left = Math.max(a1[0], a2[0]);
        int bottom = Math.max(a1[1], a2[1]);
        int right = Math.min(b1[0], b2[0]);
        int top = Math.min(b1[1], b2[1]);
        
        if(left< right && bottom < top)
            return new int[]{left, right, bottom, top};
        
        return null;
    }
}
