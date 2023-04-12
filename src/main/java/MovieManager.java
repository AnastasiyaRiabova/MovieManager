public class MovieManager {

    private String[] movies = new String[0]; // изначально фильмы не добавлены
    private int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) { // метод добавления фильмов
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) { // копируем из старого в новый массив
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {// метод нахождения всех фильмов, которые были добавлены

        return movies;
    }

    public String[] findLast() {// метод нахождения  последних добавленных фильмов в обратном от добавления порядке
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }

}