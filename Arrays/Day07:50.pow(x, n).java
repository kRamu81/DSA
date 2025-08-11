class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;//if x power 0 then is 1
        if(x==0) return 0.0;//0 power something is zero;
        if(x==1) return 1.0;// 1 power something is always 1
        if(x==-1 && n%2==0) return 1.0;// if  x is -1 then power is even then it is 1
        if(x==-1 && n%2!=0) return -1.0;//if x is -1 and power is odd then it is -1;



        long binform = n;// 5 = 101
        //if n is negative
        if(n<0){
            x = 1/x; // then (1/x)-1 right 
            binform = -binform;
        }

        double ans= 1;
        while(binform > 0){ //n>0
            if(binform %2 == 1){ //101 then 1) 3^1 =3,3)3^5 = 243
                ans *= x;
            }
            x *= x; //2)0 then 3^3 = 9,
            binform /=2;//for remainder of 101 to repeat
        }
        return ans;

    }
}
