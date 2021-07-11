package sdeProblems;
import java.util.*;

public class SetMatrixZeros {
	static void matrix(int[][] mat,int r,int c) {
		 boolean[] zeroRow = new boolean[r];
		    boolean[] zeroColumn = new boolean[c];
		    for (int i = 0 ; i < r ;i++){
		        for(int j = 0 ; j < c ; j++){
		            if(mat[i][j] == 0){
		                zeroRow[i] = true;
		                zeroColumn[j] = true;
		            }
		        }
		    }
		    for (int i = 0 ; i < r ;i++){
		        for(int j = 0 ; j < c ; j++){
		            if(zeroRow[i] || zeroColumn[j]){
		                mat[i][j] =0;
		            }
		        }
		    }     
	}
	
	static void printMatrix(int mat[][],int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int mat[ ][ ] = { {1, 1,1,0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},};
		
		 System.out.println("Matrix Initially");
         
         printMatrix(mat, 3, 4);
      
         matrix(mat, 3, 4);
         System.out.println("Matrix after modification n");
         printMatrix(mat, 3, 4);
	}

}
