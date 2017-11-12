//DAY 17 OF HACKERRANK 30 DAY CHALLENGE: MORE EXCEPTIONS (C++)

#include <iostream>
#include <exception>
#include <stdexcept>

using namespace std;

class powerexception: public exception {
    const char* what() const throw() {
        return "n and p should be non-negative";
    }
};

class Calculator {
    public:
        Calculator() {
            //Do nothing;
        }
        
        int power (int n, int p) {
            if ((n >= 0) && (p >= 0)) {
                int output = 1;
                for (int x = 0; x < p; x++) {
                    output = output * n;
                }
                return output;
            }
            else {
                powerexception px;
                throw px;
                return -1;
            }
        }
};

int main()
{
    Calculator myCalculator=Calculator();
    int T,n,p;
    cin>>T;
    while(T-->0){
      if(scanf("%d %d",&n,&p)==2){
         try{
               int ans=myCalculator.power(n,p);
               cout<<ans<<endl; 
         }
         catch(exception& e){
             cout<<e.what()<<endl;
         }
      }
    }
    
}