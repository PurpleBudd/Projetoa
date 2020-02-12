
package Pessoa;
public class Principal {

   
  public static void main(String[] args) {
      Paciente p= new Paciente();
      Funcionario f= new Funcionario();
      Enfermeiro e= new Enfermeiro();
      Medico m= new Medico();
      
      p.setNome("Guaras");
      p.setRg("502-703-517");
      p.setCPF("504.773.618.04");
      p.setIdade(15);
      p.setCodPaciente(12);
      p.setSenha("123");
      
      f.setNome("Lula");
      f.setRg("502-703-547");
      f.setCPF("544.783.718.04");
      f.setIdade(25);
      f.setMatricula(123);
      f.setSenha("2324");
            
      e.setNome("Lulovisqui");
      e.setRg("522-503-447");
      e.setCPF("534.233.458.94");
      e.setIdade(45);
      e.setCoren("234");
      e.setSenha("22324");
      
      m.setNome("Lulardo");
      m.setRg("592-593-947");
      m.setCPF("934.933.958.94");
      m.setIdade(95);
      m.setCRM("128313");
      m.setEspecialidade("ornotologo");
      m.setSenha("92324");
    }
    
}
