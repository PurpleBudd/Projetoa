
package Pessoa;

public class Paciente extends Pessoa{
  private int CodPaciente;
  private String senha;

    public int getCodPaciente() {
        return CodPaciente;
    }

    public void setCodPaciente(int CodPaciente) {
        this.CodPaciente = CodPaciente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
  
  
}