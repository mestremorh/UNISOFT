from  BD.conexion import DAO
import funciones

def menuPincipal():
    continuar = True
    while (continuar):
        opcionCorrecta=False
        while(not opcionCorrecta):
            print("_-_-_-_-_- MENÚ PRINCIPAL _-_-_-_-_-")
            print("1. Listar personas")
            print("2. Agregar persona")
            print("3. Actualizar persona")
            print("4. Eliminar persona")
            print("5. Salir")
            print("_-_-_-_-_- _-_-_-_-_- _-_-_-_-_-_-_-_-")
            opcion = int(input("Seleccione una opción: "))

            if opcion < 1 or opcion > 5:
                print("Lo sentimos esa no es una opción válida!!, Seleccione una opción: ")
            elif opcion == 5:
                continuar= False
                print("Gracias por usar nuestro sistema E8!!")
                break
            else:
                opcionCorrecta=True
                ejecutarOpcion(opcion)

def ejecutarOpcion(opcion):
    dao = DAO()

    if opcion==1:
        try:
            usuarios=dao.listarUsuarios()
            if len(usuarios) > 0:
                  funciones.listarUsuarios()
            else:
                print("La lista de usuarios está vacia.")
        except:
            print("Ocurrio un error...")
    elif opcion == 2:
        print("Registro")
    elif opcion == 3:
        print("Actualización")
    elif opcion == 4:
        print("Eliminación")
    else:
        print("Opción no válida ...")

menuPincipal()