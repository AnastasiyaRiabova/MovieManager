
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void nothingAddedTest() {
        MovieManager manager = new MovieManager(); //  что будет если ничего не добавить
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void addedOneFilmTest() {
        MovieManager manager = new MovieManager(); // добавить 1 фильм

        manager.add("Film I");
        String[] expected = {"Film I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void addedThreeFilmTest() {
        MovieManager manager = new MovieManager(); // добавить 3 фильма

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void findLastTest() {
        MovieManager manager = new MovieManager(); // find last тестим

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }
}
