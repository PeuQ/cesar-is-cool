
def main():

    def password_is_valid(password):

        def len_is_valid(password):
                if len(password) >= 6 and len(password) <= 12:
                    return True
        def numeric_is_valid(password):
            for char in password:
                if char.isnumeric() == True:
                    return True

        def alpha_is_valid(password):
            for char in password:
                if char.isalpha() == True:
                    return True     

        def upper_is_valid(password):
            for char in password:
                if char.isupper() == True:
                    return True

        def lower_is_valid(password):
            for char in password:
                if char.islower() == True:
                    return True

        def special_is_valid(password):
            for char in password:
                if char == '@' or char == '#' or char == '$':
                    return True

        if len_is_valid(password) and numeric_is_valid(password) and alpha_is_valid(password) and upper_is_valid(password) and lower_is_valid(password) and special_is_valid(password): 
            return True

    password_list = input('Digite uma lista de senhas, separado por virgula: ').split(',')
    valid_passwords = []

    for password in password_list:
            password_is_valid(password)
        if password_is_valid(password) == True:
            valid_passwords.append(password)

    print('As senhas validas sao: ', valid_passwords)

if __name__ == '__main__':
    main()
