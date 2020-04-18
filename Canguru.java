public class Canguru extends Mamifero{
  public Canguru(float Peso, int Idade, int Membros, String Corpelo){
    super(Peso,Idade,Membros,Corpelo);
  }

  //Locomover
  @Override
  public void Locomover(){
    System.out.println("\nPulando");
  }

  //Alimentar
  @Override
  public void Alimentar(){
    System.out.println("\nComendo vegetais");
  }

  //Emitir-som
  @Override
  public void Emitirsom(){
    System.out.println("\nSom de Canguru");
  }

  //Listar
  public void Listar(){
    System.out.println("\n*******Canguru*******\n\nPeso: " + this.Peso + "\nIdade: " + this.Idade + "\nMembros: " + this.Membros + "\nCor do pelo: " + this.Corpelo);
  }

}