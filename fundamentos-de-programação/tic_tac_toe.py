import os
import time
import numpy as np

round_number = 0

def increment_round():
    global round_number
    round_number += 1

def reset_board():
    global round_number
    round_number = 0

    global board_np
    board_np = np.array([[3, 3, 3],
                        [3, 3, 3],
                        [3, 3, 3]])

    global board_pos
    board_pos= np.array([[1, 2, 3],
                         [4, 5, 6],
                         [7, 8, 9]])
    global board_ls
    board_ls = []
    board_flat = board_np.flatten()
    for i in range(0, 9):
            if board_flat[i] == 3:
                board_ls.append(' ')

def print_board():
    os.system('cls') # clear in linux/os x // cls in windows
    print("""
         {} | {} | {}
        ---+---+---
         {} | {} | {}
        ---+---+---
         {} | {} | {}
    """.format(*board_ls))

def check_for_winner(player):
    diag1_win = np.all(np.diag(board_np) == player)
    diag2_win = np.all(np.diag(np.fliplr(board_np)) == player) 
    if diag1_win or diag2_win:
        print("Player {} Won!".format(player))
        reset_board()

    for i in range(0, 3):
        rows_win = np.all(board_np[i, :] == player)
        cols_win = np.all(board_np[:, i] == player)
        if rows_win or cols_win:
            print("Player {} Won!".format(player))
            reset_board()
        elif round_number == 9:
            print("Draw!")
            reset_board()

def place_choice(position, player, char):
    board_ls[position] = char
    index = np.where(board_pos == position +1)
    board_np[index] = player
    print_board()
    check_for_winner(player)

def start_game():
    players = ['O','X']
    player1 = input("Prefere jogar com 'O' ou 'X'?\n").upper()
    players.remove(player1)
    player2 = players[0]
    print_board()
    while True:
        action = int(input("Escolha uma posição para jogar: ")) -1
        if board_ls[action] == ' ':
            if round_number%2 == 0:
                place_choice(action, 1, player1)
                increment_round()
            else:
                place_choice(action, 2, player2)
                increment_round()
        else:
            print("Jogada invalida!")
            time.sleep(2)
reset_board()
start_game()
