def main():
    
    list_in = []
    tuple_out =[]
    while True:
        user_data = input('Nome, idade e altura, separados por virgula: ')
        if user_data == '':
            print(sorted(list_in))
            break
        else:
            list_in.append(tuple(item.strip() for item in user_data.split(',')))

if __name__ == '__main__':
    main()
