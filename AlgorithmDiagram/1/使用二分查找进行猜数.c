#include<stdio.h>
#include<math.h>
#include<time.h>

int main() {
	
	srand((unsigned) time(NULL));
	int find = generate_random(); 
	
	printf("随机生成的一个整数为%d\n", find);
	
} 

/*
	a[]为要找的数组
	find 为要找的数
	inpu 为自己输入的数 
*/
int binary_search(int a[], int find, int inpu) {
	
	printf("%d\n",a);
	
}

/*
	随机生成一个整数(要找的数)，并返回 
*/
int generate_random() {
	return Math.floor(random() % 101);
}
