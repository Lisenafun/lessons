package lesson30;

public class Article {
//    User user;
    int id;
    String name;
    int idUser;

    public Article(int id, String name, int idUser) {
        this.id = id;
        this.name = name;
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", name='" + name + '\'' + ", idUser=" + idUser + '}';
    }
}
