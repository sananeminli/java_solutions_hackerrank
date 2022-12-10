        //This function below is the solution for Sherlock and Squares question. This code passed all tests.
        //Problem link: https://www.hackerrank.com/challenges/sherlock-and-squares/problem
        
        
        public static int squares(int a, int b) {
        
        double first  = Math.sqrt(a);
        double last  = Math.sqrt(b);
        double floor_of_first = Math.floor(first);
        double floor_of_last = Math.floor(last);
        
        double result = floor_of_last-floor_of_first;
        
        if(first==floor_of_first){
            result++;
        }
        

        return (int)result;
    }
