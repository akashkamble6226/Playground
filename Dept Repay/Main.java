#include<iostream>
int main()
{
 int princ_amt,rate_int,numb_years;
 float i,a,d,f;
 std::cin>>princ_amt>>rate_int>>numb_years;
  i = (princ_amt * rate_int * numb_years )/100;
  a = princ_amt + i;
  d = (i  * 2) /100 ;
  f = a - d ;
  
  std::cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;
  
  
  
  
}