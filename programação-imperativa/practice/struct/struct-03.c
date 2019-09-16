/*
Construa uma estrutura student com nome, numero de matrıcula e curso. 
Leia do usuario a informac¸ao de 5 alunos, armazene em vetor 
dessa estrutura e imprima os dados na tela.
*/

#include <stdio.h>

typedef struct student{
    int id;
    char major[256];
} Student[5];

int main(void){
    Student student;
    for(int index = 0; index < 5; index++){
        scanf("%d %s", &student[index].id, student[index].major);
        printf("%d %s\n", student[index].id, student[index].major);
    }

    return 0;
}