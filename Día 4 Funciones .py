#Funciones.

def mediaTresNumeros(num1, num2, num3):
    resultado = (num1+num2+num3)/3
    return resultado
#Podemos tener funciones sin return,
#Esto es una excepción, de normal no usamos
#     print() en funciones, solo cuando el objetivo
#     de la funcion sea mostrar algo.
def dibujarLinea(forma):
    print(forma*20)
    #No return
def dibujarLineaPuntos():#Sin parametros entrada, ni return
    print("."*20)
#Para hacerlo sin print():
def crearLinea(forma):
    return(forma*20)
def presentacion(nombre, edad):
    if (edad < 0):
        print ("NO puedes tener edad si no has nacido")
   
    return("Tu nombre es: " + nombre + " y tu edad son " + str(edad) + " años")
    
#--------------------------------------------------------------------
# Código principal - MAIN.
print ("Probando funcion: ")
a = 25
b = 10
c = 15
media = mediaTresNumeros(a,b,c)
dibujarLinea("=")
dibujarLinea("x")
dibujarLinea("-")

dibujarLineaPuntos()
#Print de lo que devuelve la funcion ->
#   Para no hacer print() dentro...
print (crearLinea("*"))

print (crearLinea("o"))
print ("La media de " + str(a) + ", " + str(b) + " y " + str(c) + " es: " + str(media))
print (crearLinea("O"))


#Ejercicio: Nombre funcion -> programarla
nombre = input("Dime tu nombre: ")
edad = int(input("Dime tu edad: "))

print (presentacion(nombre, edad))













