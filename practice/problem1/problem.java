import java.util.Arrays;

class Solution {

    public static int [] eaten(int [] [] radha){
        int rows=radha.length;
        int col=radha[0].length;
        int sum=0;
        int [] roote=new int[col];

        for(int i=0;i<col;i++){
            int min=radha[0][i];
            for(int j=0;j<rows;j++){
                if(radha[j][i] <= min){
                    min=radha[j][i];
                    roote[i]=min;
                    }
                 

                
                
            }
            sum=sum+min;
        
        }
        System.out.println(sum);
    return roote;

    }

    public static void main(String[] args) {
        int [] [] pathe = {{2,1,8,9,8,0,6},{4,3,0,4,45,0,98},{7,8,7,3,123,89,78}};
        System.out.println(Arrays.toString(eaten(pathe)));
    }
}
