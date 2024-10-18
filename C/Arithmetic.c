#include<stdio.h>
int add(int a,int b){
    return a+b;
}
int subtract(int a,int b){
    return a-b;
}
int multiply(int a,int b){
    return a*b;
}
int divide(int a,int b){
    return a/b;
}
int main(){
    printf("Addition %d\n",add(5,5));
    printf("Subtract %d\n",subtract(6,5));
    printf("Multiply %2.f\n",multiply(5,5));
    printf("Divide %d\n",divide(10,5));
}