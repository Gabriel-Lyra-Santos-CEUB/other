from abc import ABC, abstractmethod

class Pessoa(ABC):
    quantidade_pessoas = 0
    
    def __init__(self, nome):
        self.nome = nome
        Pessoa.quantidade_pessoas += 1

    @abstractmethod
    def trabalhar(self):
        pass

    def apresentar(self):
        return f"Meu nome é {self.nome}."

    @classmethod
    def get_quantidade_pessoas(cls):
        return cls.quantidade_pessoas


class Professor(Pessoa):
    def __init__(self, nome, disciplina):
        super().__init__(nome)
        self.disciplina = disciplina

    def trabalhar(self):
        return f"Eu estou ensinando {self.disciplina}."

    def apresentar(self):
        return super().apresentar() + " " + f"Sou professor da disciplina {self.disciplina}."


class Estudante(Pessoa):
    def __init__(self, nome, curso):
        super().__init__(nome)
        self.curso = curso

    def trabalhar(self):
        return f"Eu estou estudando {self.curso}."

    def apresentar(self):
        return super().apresentar() + " " + f"Eu estou cursando {self.curso}."


# Testes
if __name__ == "__main__":
    prof = Professor("João", "Matemática")
    estudante = Estudante("Maria", "Engenharia")

    print(prof.apresentar())
    print(estudante.apresentar())

    print(prof.trabalhar())
    print(estudante.trabalhar())

    print("Quantidade de pessoas instanciadas: ", Pessoa.get_quantidade_pessoas())
