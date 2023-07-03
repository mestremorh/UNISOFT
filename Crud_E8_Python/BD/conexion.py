import mysql.connector
from mysql.connector import Error


class DAO():
    def __init__(self):
        try:
            self.conexion = mysql.connector.connect(
                host='db4free.net',
                port='3306',
                user='g8_agcs_uniminut',
                password='xB9zFWXVFPLfmqSQ',
                db='usuarios_agcs'
            )
        except Error as ex:
            print("Error al intentar la conexion: {0}".format(ex))

            def listarUsuarios(self):
                if self.conexion.is_connected():
                    try:
                        cursor = self.conexion.cursor()
                        cursor.execute("select * from persona")
                        resultados = cursor.fetchall()
                        return resultados
                    except Error as ex:
                        print("Error al intentar la conexión: {0}".format(ex))
