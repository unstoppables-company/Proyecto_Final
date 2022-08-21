import xmlrpc.client
import getpass


s = xmlrpc.client.ServerProxy('http://localhost:8001')

contador = 0

def solicitud ():
    usuario = input("ingrese su nomnbre de usuario: ")
    clave = getpass.getpass("Ingrese su clave: ")

    return usuario,clave

def proceso():
    simbolo = '*'
    print(simbolo)
    for i in range(5):
        simbolo = simbolo + '*'
        print(simbolo)
    
    espera = input("Como te sientes")


for i in range(4):
    contador += 1
    print("intentos--> " ,contador)

    if contador > 3:
        print("Has exedido el limite de intentos")
        break

    u,c = solicitud()
    confirmacion = str(s.validar_users(u,c)    )

    if confirmacion == "1" and contador < 4:
        print("Usuario erroneo: ")
    if confirmacion == "2" and contador < 4:
        print("La clave ingresada es erronea ")
    if confirmacion == "0" and contador < 4:
        print("\tBIENVENIDO\t\n")
        proceso()
        break



"""
print("la suma es: " + str(s.suma(a,b)))
print("la resta es: " + str(s.resta(a,b)))
print("la multiplicacion es: " + str(s.multi(a,b)))
print("la division es: " + str(s.divi(a,b)))
"""