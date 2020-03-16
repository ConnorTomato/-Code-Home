Ⅰ.
class Solution {
      public String compressString(String S) {
        if(S == null || S.length() <= 2)
            return S;
        StringBuilder sb = new StringBuilder().append(S.charAt(0));
        int cnt = 1;
        for(int i = 1; i <S.length(); i++){
            if(S.charAt(i) == S.charAt(i-1)){
                cnt++;
            }else {
                sb.append(cnt).append(S.charAt(i));
                cnt=1;
            }
        }
        return sb.append(cnt).length() < S.length() ? sb.toString() : S;
    }
}
Ⅱ.双指针
class Solution {
    public String compressString(String S) {
     if(S == null || S.length() <= 2)
        return S;
    int N = S.length();
    int i = 0;
    StringBuilder sb = new StringBuilder();
    while (i < N) {
        int j = i;
        while (j < N && S.charAt(j) == S.charAt(i)) {
            j++;
        }
        sb.append(S.charAt(i));
        sb.append(j - i);
        i = j;
    }
        return  sb.length() < S.length() ? sb.toString() : S;
    }
}
