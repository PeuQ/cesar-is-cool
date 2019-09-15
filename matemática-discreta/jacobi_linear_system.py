B1=float(input('B1= '))
B2=float(input('B2= '))
B3=float(input('B3= '))

a11=float(input('A11= '))
a12=float(input('A12= '))
a13=float(input('A13= '))
a21=float(input('A21= '))
a22=float(input('A22= '))
a23=float(input('A23= '))
a31=float(input('A31= '))
a32=float(input('A32= '))
a33=float(input('A33= '))

X1_0=0.00
X2_0=0.00
X3_0=0.00
X1_1=(B1-a12*X2_0-a13*X3_0)/a11
X2_1=(B2-a21*X1_0-a23*X3_0)/a22
X3_1=(B3-a31*X1_0-a32*X2_0)/a33

i=1
while X1_0!=X1_1 and X2_0!=X2_1 and X3_0!=X3_1:
	X1_0=(B1-a12*X2_1-a13*X3_1)/a11
	X2_0=(B2-a21*X1_1-a23*X3_1)/a22
	X3_0=(B3-a31*X1_1-a32*X2_1)/a33
	print('X1=',X1_0,'X2=',X2_0,'X3=',X3_0)
	i=i+1
	if  X1_0==X1_1 and X2_0==X2_1 and X3_0==X3_1:
		break
	X1_1=(B1-a12*X2_0-a13*X3_0)/a11
	X2_1=(B2-a21*X1_0-a23*X3_0)/a22
	X3_1=(B3-a31*X1_0-a32*X2_0)/a33
	print ('X1=',X1_1,'X2=',X2_1,'X3=',X3_1)
	i=i+1
print ('X1= ','{0:.2f}'.format(X1_1),'X2= ','{0:.2f}'.format(X2_1),'X3= ','{0:.2f}'.format(X1_1))
print ('numero de interações = ',i)
