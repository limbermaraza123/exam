import math
Unidad=["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]
Decena=["", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"]
Centena=["", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"]
N=int(input("Ingresa numero entero:"))
u= N % 10
d=int(math.floor(N/10))%10
c=int(math.floor(N/100))
if(N>=100): 
 print"_____________________________\n"
 print"numero entero:",Centena[c]+Decena[d]+Unidad[u]
 print"_____________________________\n"
else:
	if(N>=10):
		print"_____________________________\n"
		print"NUMERO ROMANO: ",Decena[d]+Unidad[u]
		print"_____________________________\n"
	else:
		print"_____________________________\n"
		print"NUMERO ROMANO: ",Unidad[N]
		print"_____________________________\n"

def cambio_base(decimal,base):
	conversion = " "
	while decimal // base != 0:
		conversion = str(decimal%base)+conversion
		decimal=decimal // base
		return str(decimal)+conversion
numero = int(input("introduce el numero a cambiar de base: "))
base = int(input("introduce la base: "))
print(cambio_base(numero,base))
