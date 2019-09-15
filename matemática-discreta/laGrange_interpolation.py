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
