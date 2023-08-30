package LibraryTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LibraryTest {

    @Test
    @DisplayName("preCondition Test")
    void preConditionTest() {
        // Test negative size on constructor
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Library(-1));
        
        Library library = new Library(1);
        
        // Test adding more books than library size
        library.add("book 1");
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.add("book 2"));
    }

    @ParameterizedTest
    @DisplayName("Construct Test")
    @ValueSource(ints = {1, 10, 100, 1000})
    void ConstructTest(int size) {
        Library library = new Library(size);

        Assertions.assertEquals(size, library.getLibrarySize());
    }

    @Test
    @DisplayName("Add Test")
    void addTest() {
        Library library = new Library(2);

        library.add("book 1");
        library.add("book 2");

        Assertions.assertThrows(IllegalArgumentException.class, () -> library.add("book 3"));
    }

    @Test
    @DisplayName("Delete Test")
    void deleteTest() {
        Library library = new Library(3);

        library.add("book 1");
        library.add("book 2");
        library.add("book 3");

        library.delete("book 2");

        Assertions.assertThrows(IllegalArgumentException.class, () -> library.delete("book 2"));
    }

    @Test
    @DisplayName("Find Test")
    void findTest() {
        Library library = new Library(3);

        library.add("book 1");
        library.add("book 2");

        library.find("book 1");
        library.find("book 3");
    }

    @Test
    @DisplayName("Find All Test")
    void findAllTest() {
        Library library = new Library(3);

        library.add("book 1");
        library.add("book 2");

        library.findAll();
    }

    // ... Other test methods ...
}

