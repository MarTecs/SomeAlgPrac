#include<stdio.h>
#include<math.h>
#include<time.h>

int main() {
	
	srand((unsigned) time(NULL));
	int find = generate_random(); 
	
	printf("������ɵ�һ������Ϊ%d\n", find);
	
} 

/*
	a[]ΪҪ�ҵ�����
	find ΪҪ�ҵ���
	inpu Ϊ�Լ�������� 
*/
int binary_search(int a[], int find, int inpu) {
	
	printf("%d\n",a);
	
}

/*
	�������һ������(Ҫ�ҵ���)�������� 
*/
int generate_random() {
	return Math.floor(random() % 101);
}
