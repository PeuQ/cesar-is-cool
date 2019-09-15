import sympy as sp

x = sp.Symbol('x')
fx = sp.sympify(input("digite f(x): "))
x0, erro = [float (x) for x in input("Digite x0 e erro (separados por virgula): ").split(',')]
dfx = fx.diff(x)

print(f"Ta na hora do show!\nf(x) = {fx}\nf'(x) = {dfx}")
while True:
	x1 = x0-(fx.subs(x,x0)/dfx.subs(x,x0))
	x0 = x1-(fx.subs(x,x1)/dfx.subs(x,x1))
	print(f"|{x1} - {x0} = {abs(x1-x0)}|")
	if abs(x1-x0) <= erro:
		print("A aproximação do zero da função está em",x0)
		break
