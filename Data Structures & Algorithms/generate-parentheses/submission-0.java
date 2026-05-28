class Solution {
    List<String> a;

    public void gg(String curr, int l, int r) {
        if (l == 0 && r == 0) {
            a.add(curr);
            return;
        }

        if (l > 0) {
            gg(curr + "(", l - 1, r);
        }

        if (r > l) { // only add ')' when more right brackets are remaining
            gg(curr + ")", l, r - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        a = new ArrayList<>();
        gg("", n, n);
        return a;
    }
}
