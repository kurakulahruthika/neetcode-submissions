
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> braces = new HashMap<>();
        braces.put(')','(');
        braces.put(']','[');
        braces.put('}','{');
         
        for(char c : s.toCharArray()){
           if(braces.containsKey(c)){
            if(stack.isEmpty()||braces.get(c)!=stack.pop()){
                return false;
            }
           }
           else{
            stack.push(c);
           }
        }
        return stack.isEmpty();
    }
}
