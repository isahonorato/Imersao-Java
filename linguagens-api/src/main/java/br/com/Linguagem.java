package br.com;

public class Linguagem {
    
    private String title;
    private String image;
    private String ranking;
    
    public Linguagem(String title, String image, String ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }
    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public String getRanking() {
        return ranking;
    }
}
