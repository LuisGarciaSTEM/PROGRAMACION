#Funciones.
def mediaTresNumeros(num1, num2, num3):
    resultado = (num1+num2+num3)/3
    return resultado #Return devuelve el resultado
def otraMediaTresNumeros(num1, num2, num3):
    suma = (num1+num2+num3)
    return suma/3
def otraOtraMediaTresNumeros(num1, num2, num3):
    return (num1+num2+num3)/3

#--------------------------------------------------------------------
# Código principal - MAIN.
print ("Probando funcion: ")
a = 1
b = 2
c = 3
media = mediaTresNumeros(a,b,c)
print (media)
media = mediaTresNumeros(20,30,40) #El 20, 30, 40 = num1, num2, num3.
print (media) #media es la variable que hemos creado para mostrarla.

print (mediaTresNumeros(1,2,3))
print (otraMediaTresNumeros(1,2,3))
print (otraOtraMediaTresNumeros(1,2,3))
