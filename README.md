# Pratica1_OO

# Questão 1 - Concessionária

Uma concessionária que compra e vende veículos seminovos necessita criar um novo
sistema orientado a objetos. Para isso contratou um desenvolver de sistemas que
mapeou inicialmente as seguintes classes: Carro, Cliente e Transação.
a) Implemente a criação dessas classes em um novo projeto Java.
b) Crie os possíveis atributos de cada classe

# Questão 2 - EmpregoFaculdade
Observe a classe abaixo:
Class EmpregadoDaFaculdade{
      private String nome;
      private double salario;
      private int horasAula;
      double getGastos(){
            return this.salario;
}
String getInfo(){
      return "nome:” + this.nome + " com salário “ + this.salario;
}
}

a) Alterar o método getGastos() para somar um bônus de R$ 40 reais por hora/aula.
b) Alterar o método getInfo () para retornar atualizado o valor que o professor irá
receber (salário + bônus).
c) Criar no Void main() um objeto e exibir na tela os resultados dos métodos
getGastos() e getInfo ().

# Questão 3 - NotasAlunos

Criar uma classe Aluno que possui os atributos: nome, matricula, notaAV1, notaAV2,
notaAE, curso, periodo.
a) Criar o construtor desta classe que recebe nome, matricula, notaAV1, notaAV2, curso,
e periodo.
b) Criar um método para alterar cada uma das notas. Exemplo: alteraNotaAV1,
alteraNotaAV2 e alteraNotaAE.
c) Criar um método para avaliarAluno que deverá seguir a regra abaixo:
Se a soma de notaAV1 e notaAV2 for maior ou igual a 60 pontos, o aluno é Aprovado,
caso contrário será Recuperação.
O método deverá imprimir as situações de Aprovado ou Recuperação.
d) Criar um método para avaliarRecuperação que deverá receber como parâmetro o
valor da notaAE. Deverá ser calculado a nota média (notaAV1+ notaAV2 e notaAE). Se o
valor total for superior ou igual a 60 pontos, o aluno é Aprovado, caso contrário
Reprovado.
e) Criar no Void main() um objeto com dados solicitados e testes dos métodos
implementados na classe: Construtor, avaliarAluno, avaliarRecuperação caso seja
necessário. Os demais métodos também podem ser testados.
Solicite os dados pelo teclado
