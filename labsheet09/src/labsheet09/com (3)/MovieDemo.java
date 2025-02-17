package labsheet09;
import java.util.*;

public class MovieDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input movie id: ");
        String movieId = scanner.nextLine();

        System.out.print("Input movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Input director name: ");
        String directorName = scanner.nextLine();

        System.out.print("Input director email: ");
        String directorEmail = scanner.nextLine();

        char gender;
        while (true) {
            System.out.print("Input director gender (m/f): ");
            gender = scanner.next().charAt(0);
            if (gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F') {
                break;
            }
            System.out.println("Invalid gender, please input 'm' or 'f'.");
        }

        Director director = new Director(directorName, directorEmail, gender);

        int theaterNo;
        while (true) {
            System.out.print("Input theater no (1-20): ");
            if (scanner.hasNextInt()) {
                theaterNo = scanner.nextInt();
                if (theaterNo >= 1 && theaterNo <= 20) {
                    break;
                }
            } else {
                scanner.next(); 
            }
            System.out.println("Please input a valid theater number (1-15).");
        }

        Movie movie = new Movie(movieId, movieName, director);
        Theater theater = new Theater(movie.getId(), movie.getName(), movie.getDirector(), theaterNo);

        System.out.println(theater);

        scanner.close();
    }
}

