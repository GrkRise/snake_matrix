package snake_matrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите n:");
		int n = in.nextInt();
		
		in.close();
		
		int nn = 2*n-1;
		int [][] matrix = new int[nn][nn];
		int cv = n - 1;
		int ch = n - 1;
		
		int index = 0;
		
		for(int i = 0; i < nn; i++){
			for(int j = 0; j < nn; j++)
			{
				matrix[i][j] = index;
				index++;
			}
		}
		
		for(int i = 0; i < nn; i++){
			for(int j = 0; j < nn; j++)
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		int iMin, iMax, jMin, jMax;
		iMin = iMax = cv;
		jMin = jMax = ch;
		
		int d = 1;
		for(int a = 1; a < nn * nn; a++){
			System.out.print(matrix[cv][ch] + "\t");
			switch(d){
			case 0:
				cv -= 1;
				if(cv < iMin){
					d = 1;
					iMin = cv;
				}
				break;
			case 1:
				ch -= 1;
				if(ch < jMin){
					d = 2;
					jMin = ch;
				}
				break;
			case 2:
				cv += 1;
				if(cv > iMax){
					d = 3;
					iMax = cv;
				}
				break;
			case 3:
				ch += 1;
				if(ch > jMax){
					d = 0;
					jMax = ch;
				}
				break;
			}
		}

	}

}
