package pe.joedayz.samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static pe.joedayz.samples.BookCharacterPredicate.isYoung;
import static pe.joedayz.samples.BookCharacterPredicate.useSword;

public class BookCharacterChecker {

    public static void main(String[] args) {
        List<BookCharacter> bookCharacters = Arrays.asList(
                new BookCharacter("Gandalf", Integer.MAX_VALUE, BookCharacter.Weapon.STAFF, false),
                new BookCharacter("Aragorn", 88, BookCharacter.Weapon.SWORD, true),
                new BookCharacter("Gimli", 140, BookCharacter.Weapon.AXE, false),
                new BookCharacter("Legolas", 2931, BookCharacter.Weapon.BOW, false),
                new BookCharacter("Boromir", 41, BookCharacter.Weapon.SWORD, true),
                new BookCharacter("Frodo", 51, BookCharacter.Weapon.RING, false),
                new BookCharacter("Sam", 33, BookCharacter.Weapon.SWORD, false));

        List<BookCharacter> youngsAndSwords =
                bookCharacters.stream()
                        .filter(bChar -> bChar.getAge() < 90 && BookCharacter.Weapon.SWORD.equals(bChar.getMainWeapon()))
                        .collect(Collectors.toList());

        System.out.println(youngsAndSwords);

        List<BookCharacter> youngsAndSwords2 =
                bookCharacters.stream()
                        .filter(BookCharacterPredicate.isYoung())
                        .filter(useSword())
                        .collect(Collectors.toList());

        List<BookCharacter> youngsAndSwords3=
                bookCharacters.stream()
                        .filter(isYoung().and(useSword()))
                        .collect(Collectors.toList());

        BookCharacter gandalf =
                new BookCharacter("Gandalf", Integer.MAX_VALUE, BookCharacter.Weapon.STAFF, false);

        BookCharacterChecker bookCharacterChecker = new BookCharacterChecker();

        bookCharacterChecker.doSomeStuffIfThisAndValid(gandalf, bChar -> bChar.getAge() > 90);

        BiPredicate<Integer, Integer> isCasePack = (x, y) -> {
            boolean res= x%y == 0;
            return res;
        };

        BiPredicate<Integer, Integer> findCharacter = (x, y) -> {
            boolean res= x%y == 0;
            return res;
        };

        boolean result = isCasePack.test(12, 6);
    };



    public void doSomeStuffIfThisAndValid(BookCharacter bChar,
                                          Predicate<BookCharacter> predicate) {
        if (predicate.and(BookCharacterPredicate.isValid()).test(bChar)) {
            // do some stuff
            System.out.println("doing stuff with result true");
        } else {
            // do other stuff
            System.out.println("doing stuff with result false");
        }
    }
}

