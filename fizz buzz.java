class Solution {
    public List<String> fizzBuzz(int n) {
       List<String> soln = new ArrayList<String>();
         for (int i = 1; i <= n; i++) {
           if (i%3==0 & i%5==0) {  
               soln.add("fizz buzz");
           }
             else if(i%3==0){
                 soln.add("fizz");
             }
             else if(i%5==0){
                 soln.add("buzz");
             }
             else{
                 soln.add(Integer.toString(i));
             }
                          }
                          return soln;
                          }
                          }
