#include <stdio.h>


int main(void) {

    printf("Project Euler problem 10 solution = ");
    int j = 2;
    int sum, i = 0;

    for (i = 0; i < 2000000; i++){
        for (j = 2; j < i; j++){
            if (i % j == 0){
                sum = sum;
            }
            else{
                sum = sum + j;
            }
        }
    }
  
    printf("%lu \n", sum);

    return 0;
}