ingles = ["I","am","very","tired","jesus","love","you","you","he",
		"she","it","we","you","they","hello","how","are you","loves you",
		"am","fine","where","child","city","my","love you","love you","you are","to read",
		"so much","beautiful","miss you","meed you","life","man","love","miss","I"]
espanol = ["yo","estoy","muy","cansado","jesus","te","ama","tu","el","ella","este",
		"nosotros","ustedes","ellos","hola","como","estas","ama","estoy","bien",
		"donde","nino","ciudad","mi","amo","quiero","eres","leer",
		"mucho","hermosa","extrano","necesito","vida","hombre","amor","senorita","te"]
dicho = raw_input("Ingrese la frase: ")
		
lista=dicho.split()
traducido=[]
for i in range(len(lista)):
	traducido.append(ingles[espanol.index(lista[i])])		
palabra_traducida =' '.join(traducido)		
ingle = ["I","am","very","tired","jesus","love","","tea","he",
		"she","it","we","you","they","hello","how","are you","loves you",
		"am","fine","where","child","city","my","love you","love you","you are","to read",
		"so much","beautiful","miss you","meed you","life","man","love","miss","I"]
espano = ["yo","estoy","muy","cansado","jesus","","te","tu","el","ella","este",
		"nosotros","ustedes","ellos","hola","como","estas","ama","estoy","bien",
		"donde","nino","ciudad","mi","amo","quiero","eres","leer",
		"mucho","hermosa","extrano","necesito","vida","hombre","amor","senorita","te"]
traducidos=[]
	
for i in range(len(lista)):
	traducidos.append(ingle[espano.index(lista[i])])

palabra_real = ' '.join(traducidos)
print"_____________________________\n"	
print"PALABRA TRADUCIDA: ",palabra_traducida
print"_____________________________\n"
print"PALABRA REAL: ",palabra_real
