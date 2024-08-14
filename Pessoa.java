import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Pessoa {

    protected String nome;
    protected Date nascimento;
    protected String genero;
    protected double altura;
    protected double peso;

    public Pessoa(String nome, String nascimento, String genero, double altura, double peso) throws ParseException  {
        this.nome = nome;
        this.nascimento = convertStringToDate(nascimento);
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public Pessoa(String nome, String nascimento) throws ParseException {
        this(nome, nascimento, "", 0, 0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {

        String nascimento = "";
        try {
            nascimento = convertDateToString(this.nascimento);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return "Pessoa [nome=" + nome +
                ", nascimento=" + nascimento
                + ", genero=" + genero
                + ", altura=" + altura + ", peso=" + peso + "]";
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

    public int calcularIdade(Date nascimento) {

        Date actualDate = new Date();

        long diffInMillies = Math.abs(actualDate.getTime() - nascimento.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return (int) diff / 365;
    }

}
