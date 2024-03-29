class Cliente:
    def __init__(self, nome, idade):
        self.__nome = nome
        self.__idade = idade
        self.__enderecos = []

    @property
    def nome(self):
        return self.__nome

    @nome.setter
    def nome(self, nome):
        self.__nome = nome

    @property
    def idade(self):
        return self.__idade

    @idade.setter
    def idade(self, idade):
        self.__idade = idade

    def insere_endereco(self, endereco):
        self.__enderecos.append(endereco)

    def mostra_enderecos(self):
        if not self.__enderecos:
            print(f"Cliente {self.__nome} não tem endereço cadastrado.")
        else:
            print(f"Endereços de {self.__nome}:")
            for endereco in self.__enderecos:
                print(f"{endereco.cidade} - {endereco.estado}")

    def remove_endereco(self, endereco):
        if endereco in self.__enderecos:
            self.__enderecos.remove(endereco)

class Endereco:
    def __init__(self, cidade, estado):
        self.__cidade = cidade
        self.__estado = estado

    @property
    def cidade(self):
        return self.__cidade

    @cidade.setter
    def cidade(self, cidade):
        self.__cidade = cidade

    @property
    def estado(self):
        return self.__estado

    @estado.setter
    def estado(self, estado):
        self.__estado = estado

if __name__ == "__main__":
    cliente1 = Cliente("Gabriel Lyra", 24)

    cliente1.mostra_enderecos()

    endereco1 = Endereco("Recife", "PE")
    endereco2 = Endereco("Brasilia", "DF")

    cliente1.insere_endereco(endereco1)
    cliente1.insere_endereco(endereco2)

    cliente1.mostra_enderecos()

    cliente1.remove_endereco(endereco1)
    cliente1.mostra_enderecos()