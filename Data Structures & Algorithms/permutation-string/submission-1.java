class Solution {
    public boolean araysEqual(int array1[] , int array2[]){
        for(int i=0;i<26;i++){
            if(array1[i]!=array2[i])
            return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int array1[]=new int[26];
        int n=s1.length();
        int i=0;
        for(char c:s1.toCharArray()){
            array1[c-'a']++;
        }

        int array2[]=new int[26];
        for(int j=0;j<n;j++){
            array2[s2.charAt(j)-'a']++;
        }

        for(int j=n;j<s2.length();j++){
            if(araysEqual(array1,array2)) return true;

            array2[s2.charAt(j)-'a']++;
            array2[s2.charAt(i++)-'a']--;
        }

        if(araysEqual(array1,array2)) return true;
        return false;


    }
}
