public class Peixe extends Animal{

  private String Corescama;

  public Peixe(float Peso, int Idade, int Membros, String Corescama){
    this.Peso = Peso;
    this.Idade = Idade;
    this.Membros = Membros;
    this.Corescama = Corescama;
  }

  //Locomover
  @Override
  public void Locomover(){
    System.out.println("\nNadando");
  }

  //Alimentar
  @Override
  public void Alimentar(){
    System.out.println("\nComendo substancias");
  }

  //Emitir-som
  @Override
  public void Emitirsom(){
    System.out.println("\nPeixe não faz som");
  }

  //Soltar-bolha
  public void Soltarbolha(){
    System.out.println("\nSoltou uma bolha");
  }

  //Listar
  public void Listar(){
    System.out.println("\n*******Peixe*******\n\nPeso: " + this.Peso + "\nIdade: " + this.Idade + "\nMembros: " + this.Membros + "\nCor do pelo: " + this.Corescama);
  }

}