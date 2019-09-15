def main():
    
    movimento_out = []
    while True:
        movimento_in = input('Digite os movimentos cima, baixo, esquerda e direita, separadamente: ')
        if movimento_in == '':
            up, down, left, right = (int (x) for x in (movimento_out))
            distancia = ((down - up)**2 + (left - right)**2 )/2
            print(round(distancia))
            break
        else:
            movimento_out.append(movimento_in)

if __name__ == '__main__':
    main()
