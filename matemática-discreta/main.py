import sympy as sp
import random
import sys
import os
import time

## OK ##
def newton_raphson():
    os.system('cls')
    print("Zero da função: Método de Newton-Raphson\n")

    x = sp.Symbol('x')
    fx = sp.sympify(input("digite f(x): "))
    x0, erro = [float (x) for x in input("Digite x0 e erro (separados por virgula): ").split(',')]
    dfx = fx.diff(x)

    print(f"\nTa na hora do show!\n - f(x) = {fx}\n - f'(x) = {dfx}\n\n      x1        -        x0        =      |x1 - x0|")
    while True:
        x1 = x0-(fx.subs(x,x0)/dfx.subs(x,x0))
        x0 = x1-(fx.subs(x,x1)/dfx.subs(x,x1))
        print(f"{x1} - {x0} = |{abs(x1-x0)}|")
        if abs(x1-x0) <= erro:
            print(f"\nA aproximação do zero da função está em 'X ={x0}'")
            break
    
def laGrange():
    os.system('cls')
    print("Interpolação: Método de LaGrange\n")

    x = sp.symbols('x')
    xn_fn = [float(x) for x in input("Digite coordenadas dos pontos no formato 'x, fx': ").split(',')]
    xn = xn_fn[0::2]
    fn = xn_fn[1::2]
    coordenadas = list(zip(xn,fn))
    print(f"As coordenadas inseridas (xn,fn) foram: {coordenadas}")

    px = 0
    for k in range(len(xn)):
        ln = 1
        for j in range(len(xn)):
            if j != k:
                ln = ln*(((x-xn[j])/(xn[k]-xn[j])))
        px += (ln*fn[k])
        #ln = sp.expand((ln)*((x-xn[0])/(xn[k]-xn[0])))
        #px = px + (fn[k]*ln)
    print(f"O polinomio de LaGrange é Px = {px}")

def jacobi():
    os.system('cls')
    print("Sistemas Lineares: Método de Jacobi\n")
    x = sp.symbols('x')

    i,j = (int (x) for x in input("Digite as dimensoes da matriz no formato i,j:\n").split(','))
    an = [float(x) for x in input("Digite todos valores de a11 à ann (separados por virgula):\n").split(',')]
    #xn = [float(x) for x in range(i)]

    x1_0=0.00
    x2_0=0.00
    x3_0=0.00
    x1_1=(b1-a12*x2_0-a13*x3_0)/a11
    x2_1=(b2-a21*x1_0-a23*x3_0)/a22
    x3_1=(b3-a31*x1_0-a32*x2_0)/a33

    i=1
    while x1_0!=x1_1 and x2_0!=x2_1 and x3_0!=x3_1:
        x1_0=(b1-a12*x2_1-a13*x3_1)/a11
        x2_0=(b2-a21*x1_1-a23*x3_1)/a22
        x3_0=(b3-a31*x1_1-a32*x2_1)/a33
        print('X1=',x1_0,'X2=',x2_0,'X3=',x3_0)
        i=i+1
        if  x1_0==x1_1 and x2_0==x2_1 and x3_0==x3_1:
            break
        x1_1=(b1-a12*x2_0-a13*x3_0)/a11
        x2_1=(b2-a21*x1_0-a23*x3_0)/a22
        x3_1=(b3-a31*x1_0-a32*x2_0)/a33
        print ('X1=',x1_1,'X2=',x2_1,'X3=',x3_1)
        i=i+1
    print ('X1= ','{0:.2f}'.format(x1_1),'X2= ','{0:.2f}'.format(x2_1),'X3= ','{0:.2f}'.format(x1_1))
    print ('numero de interações = ',i)

def to_menu():
    input("\nAperte qualquer tecla para voltar ao menu inicial.\n")

def main():
    while True:
        os.system('cls')
        user_choice = input("=====================================\n||  Escolha um dos metodos abaixo  ||\n||---------------------------------||\n||        1. Newton-Raphson        ||\n||           2. LaGrange           ||\n||            3. Jacobi            ||\n=====================================\n")
        if user_choice == '1':
            newton_raphson()
            to_menu()
            continue
        if user_choice == '2':
            laGrange()
            to_menu()
            continue
        if user_choice == '3':
            jacobi()
            to_menu()
            continue
        else:
            print("Escolha invalida. Selecione alguma das escolhas disponiveis")
            time.sleep(2)

if __name__ == "__main__":
    main()
