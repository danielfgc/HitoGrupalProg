# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

class A():
    def hola(self):
        print("Hola heredado de la clase A")

class B():
    def hola(self):
        print("Hola heredado de la clase B")

class C(B,A):
    pass

c = C()
c.hola()