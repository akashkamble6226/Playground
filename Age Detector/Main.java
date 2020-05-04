#include<iostream>


using namespace std;

int main()
{
	
	int a,b,a1,b1;
	
	cin>>a>>b;
	
	if(a>b)
	{
		
		a1 = 1900 + a;
		b1 = 2000 + b;
		
		std::cout<<b1-a1;
		
	}
	else
	{
			a1 = 2000 + a;
			b1 = 2000 + b;
		
			cout<<b1-a1;
		
	}
	
	
	return 0;
}