import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws ParseException {

        // System.out.println("FAÇA SUA TAREFA");

        // Academia academia1 = new Academia("Itibere", "Pirai do Sul", "996329474");

        // // printar o academia1

        // academia1.setNome("Associação Itiberê");
        // academia1.setEndereco("Paranagua");
        // academia1.setTelefone("9925485848");

        // printar o obj1

        // CADASTRE 3 ALUNOS EM CADA ACADEMIA

        Date nascimento = convertStringToDate("13/08/1998");

        Date secondDate = new Date();

        long diffInMillies = Math.abs(secondDate.getTime() - nascimento.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        System.out.println(diff / 365);

        Aluno aluno1 = new Aluno("Maritza", "intermediário", "19/04/1998");
        academia1.alunos.add(aluno1);
        academia1.alunos.add(new Aluno("Maritza Silva", "intermediário",
                "19/04/1998"));

        // aluno1.calcularIdade(nascimento);
        // List<Aluno> lista = academia1.getAlunos();
        // for (Aluno item : lista) {
        // System.out.println(item.toString());
        // }
    }

    // Para conhecimento sobre as conversões
    public static Date convertStringToDate(String nascimento) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.parse(nascimento);
    }

    public static String convertDateToString(Date nascimento) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(nascimento);
    }

}
