class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        String[] str1 = toBinaryMap(arr1, n);
        String[] str2 = toBinaryMap(arr2, n);
        
        for(int i=0; i<n; i++){
            answer[i] = "";
            for(int j=0; j<n; j++){
                if(str1[i].charAt(j) == '1' || str2[i].charAt(j) == '1'){
                    answer[i] += "#";
                }else{
                    answer[i] += " ";
                }
            }
        }

        return answer;
    }
    
    public String[] toBinaryMap(int[] arr, int n){
        String str = "";
        for(int i=0; i<arr.length; i++){
            String binary = Integer.toBinaryString(arr[i]);
            
            if(binary.length() != n){
                String tmp = "";
                for(int j=0; j<n-binary.length(); j++){
                    tmp += "0";
                }
                binary = tmp + binary;
            }
            
            str += binary + '\n';
        }
        return str.split("\n");
    }
}