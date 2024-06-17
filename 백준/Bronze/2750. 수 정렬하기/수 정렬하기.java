
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
//		1. Arrays.sort + bufferedReader + StringBuilder
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		for(int a : arr) {
			sb.append(a).append('\n');
		}
		System.out.println(sb);
		
//		2. bubble sort + bufferedReader + StringBuilder
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int N = Integer.parseInt(br.readLine());
//		int[] arr = new int[N];
//		
//		for(int i=0; i<N; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		
////		bubble sort
//		for(int i=0; i<N-1; i++) {
//			for(int j=i+1; j<N; j++) {
//				if(arr[i]>arr[j]) {
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//		
//		for(int val : arr) {
//			sb.append(val).append('\n');
//		}
//		System.out.println(sb);
	}

}
