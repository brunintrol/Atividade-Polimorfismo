public class Ave extends Animal{

  private String Corpena;

  public Ave(float Peso, int Idade, int Membros, String Corpena){
    this.Peso = Peso;
    this.Idade = Idade;
    this.Membros = Membros;
    this.Corpena = Corpena;
  }

  //Locomover
  @Override
  public void Locomover(){
    System.out.println("\nVoando");
  }

  //Alimentar
  @Override
  public void Alimentar(){
    System.out.println("\nComendo frutas");
  }

  //Emitir-som
  @Override
  public void Emitirsom(){
    System.out.println("\nSom de ave");
  }

  //Fazer-ninho
  public void Fazerninho(){
    System.out.println("\nConstruiu um ninho");
  }
  
  //Listar
  public void Listar(){
    System.out.println("\n*******Ave*******\n\nPeso: " + this.Peso + "\nIdade: " + this.Idade + "\nMembros: " + this.Membros + "\nCor do pelo: " + this.Corpena);
  }

}