import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDate momento;
    private  String titulo;
    private String conteudo;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post(LocalDate momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public LocalDate getMomento() {
        return momento;
    }

    public void setMomento(LocalDate momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComent(Comment comments) {
        this.comments.add(comments);
    }
    @Override
    public  String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.titulo + "\n");
        sb.append(this.likes);
        sb.append(" Likes - ");
        sb.append(this.momento.format(DateTimeFormatter.ofPattern("dd/MM/yyy")) + "\n");
        sb.append(this.conteudo + "\n");
        sb.append("Comments: \n");
        for (Comment c : comments)  {
            sb.append(c.getText());
        }
        return sb.toString();
    }
}