import java.lang.*;
class MultArray
{
	public static void main(String arg[])
	{
		int Arr[][]=new int [4][3];
		Arr[0][0]=7;
		Arr[0][1]=3;
		Arr[0][2]=2;
		Arr[1][0]=5;
		Arr[1][1]=1;
		Arr[1][2]=8;
		Arr[2][0]=6;
		Arr[2][1]=5;
		Arr[2][2]=2;
		Arr[3][0]=7;
		Arr[3][1]=2;
		Arr[3][2]=1;
		
		for(int i=0;i<Arr.length-1;i++)
		{
			int iMult=1;
			for(int j=0;j<Arr.length-1;j++)
			{
				iMult=iMult*Arr[i][j];
			}
			System.out.println("Multiplication is"+iMult);
		}
	}
}