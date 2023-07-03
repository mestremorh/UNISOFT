def listarUsuarios(usuarios):
    print("Usuarios: ")
    contador = 1
    for usu in usuarios:
        datos = "{0}.   id:  {1} | nombres: {2} | documento: {3} | rol: {4}"
        print(datos.format(contador, usu[0], usu[1], usu[2], usu[3]))
        contador = contador + 1
    print("  ")
