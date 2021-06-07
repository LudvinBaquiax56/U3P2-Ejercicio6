Algoritmo Ejercicio6
	Definir contadorMayoresDe25 Como Entero
	Definir contadorMenerosDe25 Como Entero
	Definir totalDeEdadMayores Como Entero
	Definir totalDeEdadMenores Como Entero
	
	Para i<-1 Hasta 100 Con Paso 1 Hacer
		Escribir 'Ingres la edad de la persona No. ' i
		Leer edad
		Si edad < 25  Entonces
			totalDeEdadMenores = totalDeEdadMenores + edad
			contadorMenerosDe25 = contadorMenerosDe25 + 1
		SiNo
			totalDeEdadMayores = totalDeEdadMayores + edad
			contadorMayoresDe25 = contadorMayoresDe25 + 1
		Fin Si
	Fin Para
		
	promedioMenores = totalDeEdadMenores / contadorMenerosDe25
	promedioMayores = totalDeEdadMayores / contadorMayoresDe25
		
	Escribir 'El promedio de edad de las personas menores de 25 años es: ' promedioMenores
	Escribir 'El promedio de edad de las personas mayores de 25 años es: ' promedioMayores
FinAlgoritmo
