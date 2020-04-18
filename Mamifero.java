public class Mamifero extends Animal{

  protected String Corpelo;

  public Mamifero(float Peso, int Idade, int Membros, String Corpelo){
    this.Peso = Peso;
    this.Idade = Idade;
    this.Membros = Membros;
    this.Corpelo = Corpelo;
  }

  //Locomover
  @Override
  public void Locomover(){
    System.out.println("\nAndando");
  }

  //Alimentar
  @Override
  public void Alimentar(){
    System.out.println("\nMamando");
  }

  //Emitir-som
  @Override
  public void Emitirsom(){
    System.out.println("\nSom de mamimero");
  }

  //Listar
  public void Listar(){
    System.out.println("\n*******Mamifero*******\n\nPeso: " + this.Peso + "\nIdade: " + this.Idade + "\nMembros: " + this.Membros + "\nCor do pelo: " + this.Corpelo);
  }

}