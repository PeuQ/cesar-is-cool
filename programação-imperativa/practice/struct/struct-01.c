/*
Escreva um trecho de codigo para fazer a criacao
dos novos tipos de dados conforme solicitado abaixo:
• Time: composto de hour, minutes e seconds. ´
• Data: composto de day, month e year. ˆ
• Compromisso: composto de uma data, horario e 
texto que descreve o compromisso.
*/

#include <stdio.h>

typedef struct time{
    int hour, minutes, seconds;
} Time;

typedef struct date{
    int day, month, year;
} Date;

typedef struct task{
    Date date;
    Time hour;
    char description[1024];
} Task;

int main(void){


    return 0;
}