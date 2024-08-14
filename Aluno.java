import java.text.ParseException;
import java.util.Date;

public class Aluno extends Pessoa {

    private String nivel;

    public Aluno(String nome, String nivel, String nascimento, String genero, double altura, double peso) throws ParseException {
        super(nome, nascimento, genero, altura, peso);
        this.nivel = nivel;
    }

    public Aluno(String nome, String nivel, String nascimento) throws ParseException {
        this(nome, nivel, nascimento, "", 0, 0);
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + ", nivel=" + nivel;
    }

}
