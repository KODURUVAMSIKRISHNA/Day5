package arrays1Dand2D;
import java.util.Scanner;
public class DiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();

        int A[][]=new int[m][m];

        for(int i=0;i<m;i++)

        {

            for(int j=0;j<m;j++)

            {

                A[i][j]=sc.nextInt();

            }

        }

      int p=0, q=0;

        for(int i=0;i<m;i++)

        {

            for(int j=0;j<m;j++)

            {

                if(i!=j && A[i][j]!=0) 

                {

                    p=1;

                    break;

                }

                if(i==j && A[i][j]==0) 

                {

                    q++;

                }

            }

        }        

        if(p==0 && q<m)

            System.out.println("yes");

        else

            System.out.println("no");
	}

}
