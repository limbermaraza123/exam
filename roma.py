#import math
#F:\romano.py
decimal=[100,90,50,40,10,9,5,4,1]
roma=["C","X C","L","X L","X","I X","V","I V","I"]

print "\n--------------------------DECIMALES--------------------------\n"
for i in range(1,101):
	print i,

print "\n"
print "\n--------------------------ROMANOS----------------------------\n"
for num in range(1,101):
		while True:
				if num ==0:
					break
				g=0
				while num > 0:
					if num >=(decimal[g]):
						print (roma[g]),
						num = num - (decimal[g])
					else:
						g+=1
		print "\t",
print "\n------------------------BASE 8-----------------------------\n"
for i in range(1,101):
	print oct(i),
