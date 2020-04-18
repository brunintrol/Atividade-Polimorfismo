class Main {
  public static void main(String[] args) {
    
    Ave a = new Ave(1,10,12,"vermelho");
    a.Listar();
    a.Locomover();
    a.Alimentar();
    a.Emitirsom();
    

    Canguru c = new Canguru(10,7,32,"Marrom");
    c.Listar();
    c.Locomover();
    c.Alimentar();
    c.Emitirsom();
    

    Mamifero m = new Mamifero(50,11,40,"Branco");
    m.Listar();
    m.Locomover();
    m.Alimentar();
    m.Emitirsom();

    Peixe p = new Peixe(1,1,1,"Cinza");
    p.Listar();
    p.Locomover();
    p.Alimentar();
    p.Emitirsom();

    Reptil r = new Reptil(5,3,20,"Verde");
    r.Listar();
    r.Locomover();
    r.Alimentar();
    r.Emitirsom();


  }
}