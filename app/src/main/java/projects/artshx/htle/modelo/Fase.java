package projects.artshx.htle.modelo;

/**
 * Created by ArtShx, artshx@gmail.com on 21/01/2016.
 */
public class Fase
{
    public long id, acertos, erros;
    public String[] respostasCertas;
    public String fraseSublinhada;
    public String texto;
    public Rating rating;
    public int imagem;

    public Fase()
    {

    }

    public void setID(long id)   { this.id = id; }

    public long getID()  { return id; }

    public int getImagem()
    {
        return imagem;
    }

    public void setImagem(int imagem)
    {
        this.imagem = imagem;
    }

    public long getAcertos()
    {
        return acertos;
    }

    public void setAcertos(long acertos)
    {
        this.acertos = acertos;
    }

    public long getErros()
    {
        return erros;
    }

    public void setErros(long erros)
    {
        this.erros = erros;
    }

    public String[] getRespostasCertas()
    {
        return respostasCertas;
    }

    public void setRespostasCertas(String[] respostasCertas)
    {
        this.respostasCertas = respostasCertas;
    }

    public String getFraseSublinhada()
    {
        return fraseSublinhada;
    }

    public void setFraseSublinhada(String fraseSublinhada)
    {
        this.fraseSublinhada = fraseSublinhada;
    }

    public String getTexto()
    {
        return texto;
    }

    public void setTexto(String texto)
    {
        this.texto = texto;
    }

    public Rating getRating()
    {
        return rating;
    }

    public void setRating(Rating rating)
    {
        this.rating = rating;
    }




}
