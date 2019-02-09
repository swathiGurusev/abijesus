#include<bits/stdc++.h> 
using namespace std; 
  
// Function to find sum of series. 
float sumOfAP(float a, float d, int n) 
{ 
    float sum = 0; 
    for (int i=0;i<n;i++) 
    { 
        sum = sum + a; 
        a = a + d; 
    } 
    return sum; 
} 
  
// Driver function 
int main() 
{ 
    int n = 3; 
    float a =2, d = 10; 
    cout<<sumOfAP(a, d, n); 
    return 0; 
} 
