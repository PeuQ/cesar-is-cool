/*
Link: https://ide.geeksforgeeks.org/pYOWKXfJJp
Crie uma estrutura representando os alunos de um 
determinado curso. A estrutura deve
conter a matr´ıcula do aluno, nome, nota da primeira prova, 
nota da segunda prova e nota da terceira prova.
(a) Permita ao usuario entrar com os dados de 5 alunos. ´
(b) Encontre o aluno com maior nota da primeira prova.
(c) Encontre o aluno com maior media geral. ´
(d) Encontre o aluno com menor media geral ´
(e) Para cada aluno diga se ele foi aprovado ou reprovado, 
considerando o valor 6 para aprovac¸ao.
*/

#include <stdio.h>

typedef struct student{
    int id;
    char name[256];
    int gradeOne, gradeTwo, gradeThree;
} Student;

int main(void){
    Student studentArray[5], maxGrade, maxAverage, minAverage;
    for(int index = 0; index < 5; index++){
        scanf("%d %d %d %d %s", &studentArray[index].gradeOne, &studentArray[index].gradeTwo, &studentArray[index].gradeThree, &studentArray[index].id, studentArray[index].name);
        int studentAverage = (studentArray[index].gradeOne + studentArray[index].gradeTwo + studentArray[index].gradeThree) / 3;
        int max = (maxAverage.gradeOne + maxAverage.gradeTwo + maxAverage.gradeThree) / 3;
        int min = (minAverage.gradeOne + minAverage.gradeTwo + minAverage.gradeThree) / 3; 
        if (index == 0)
            maxGrade = maxAverage = minAverage = studentArray[index];
        if(studentArray[index].gradeOne > maxGrade.gradeOne)
            maxGrade = studentArray[index];
        if (studentAverage > max)
            maxAverage = studentArray[index];
        else if (studentAverage < min)
            minAverage = studentArray[index];
        if (studentAverage >= 6)
            printf("Student: %s * id: %d * Status: Approved\n", studentArray[index].name, studentArray[index].id);
        else
            printf("Student: %s * id: %d * Status: NOT Approved\n", studentArray[index].name, studentArray[index].id);
    }
    printf("*** \nHighest first grade: %s \nHighest Average: %s \nLowest Average: %s", maxGrade.name, maxAverage.name, minAverage.name);
    
    return 0;
}