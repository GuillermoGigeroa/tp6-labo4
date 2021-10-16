class Git():
    def __init__(self):
        import os
        self.comandoIngresado = False
        self.ruta = os.getcwd()

    def completo(self):
        print("\n\nTarea finalizada. Presione enter para continuar.")
        input()

    def push(self):
        import os
        os.system("cd && cd "+ self.ruta +" && git add .")
        os.system("cd && cd "+ self.ruta +" && git commit -m pushConPython")
        os.system("cd && cd "+ self.ruta +" && git push")

    def status(self):
        import os
        os.system("cd "+ self.ruta +" && git status")

    def ejecutarComando(self, comandoRecibido):
        if comandoRecibido.lower() == "push":
            self.comandoIngresado = True
            self.push()
            self.completo()
        if comandoRecibido.lower() == "status" and not self.comandoIngresado:
            self.comandoIngresado = True
            self.status()
            self.completo()
        if not self.comandoIngresado:
            print("Comando no registrado.")

git = Git()
try:
    import sys
    git.ejecutarComando(sys.argv[1])
except:
    print("Comando no valido. Se ejecuta el comando status.")
    git.status()