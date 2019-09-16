/*
Implemente um programa que leia o nome, a idade e o enderec¸o 
de uma pessoa e armazene os dados em uma estrutura.
*/

#include <stdio.h>

typedef struct profile{
    char name[256];
    int age;
    char address[256];
} Profile;

int main(void){
    Profile student;
    scanf("%s", student.name);
    scanf("%d", &student.age);
    scanf("%s", student.address);
    printf("Nome: %s \nIdade: %d \nEndereco: %s", student.name, student.age, student.address);

    return 0;
}