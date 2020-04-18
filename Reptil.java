public class Reptil extends Animal{

  private String Corescama;

  public Reptil(float Peso, int Idade, int Membros, String Corescama){
    this.Peso = Peso;
    this.Idade = Idade;
    this.Membros = Membros;
    this.Corescama = Corescama;
  }

  //Locomover
  @Override
  public void Locomover(){
    System.out.println("\nRastejando");
  }

  //Alimentar
  @Override
  public void Alimentar(){
    System.out.println("\nComendo Vegetais");
  }

  //Emitir-som
  @Override
  public void Emitirsom(){
    System.out.println("\nSom de Reptil");
  }

  //Listar
  public void Listar(){
    System.out.println("\n*******Reptil*******\n\nPeso: " + this.Peso + "\nIdade: " + this.Idade + "\nMembros: " + this.Membros + "\nCor do pelo: " + this.Corescama);
  }

}