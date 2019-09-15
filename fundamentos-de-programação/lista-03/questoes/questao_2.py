def main():
    
    user_in = input('Digite qualquer coisa aqui: ').split()
    frequencies = []

    for char in user_in:
        frequencies.append("{}:{}".format(char,user_in.count(char)))

    print(sorted(set(frequencies)))

if __name__ == '__main__':
    main()
