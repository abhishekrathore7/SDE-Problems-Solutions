package sdeProblems;
import java.util.*;

public class RotateMatrix {
	 public static void rotate(int[][] matrix) {
	        int size=matrix.length;
	        for(int i=0;i<size;i++){
	            for(int j=i;j<size;j++){
	                int temp=matrix[i][j];
	                matrix[i][j]=matrix[j][i];
	                matrix[j][i]=temp;
	            }
	        }
	        for(int i=0;i<size;i++){
	            int left=0,right=size-1;
	            while(left<right){
	                int temp=matrix[i][left];
	                matrix[i][left]=matrix[i][right];
	                matrix[i][right]=temp;
	                left++;right--;
	            }
	        }
	        return ;
	    }

	public static void main(String[] args) {
		int N = 3;
        int mat[][] = {
            { 1, 2, 3},
            { 4,5,6},
            {7,8,9}
        };
        rotate(mat);
        for(int i=0;i<N;i++) {
        	for(int j=0;j<N;j++) {
        		System.out.print(mat[i][j] + " ");
        	}
        	System.out.println();
        }
	}

}
