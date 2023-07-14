import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Film {
    private String id;
    private String title;
    private int year;
    private double rating;

    public Film(String id, String title, int year, double rating) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Film [ID: " + id + ", Title: " + title + ", Year: " + year + ", Rating: " + rating + "]";
    }
}

class Main {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();

        // Menambahkan film ke dalam daftar films
        films.add(new Film("tt0111161", "The Shawshank Redemption", 1994, 9.3));
        films.add(new Film("tt0068646", "The Godfather", 1972, 9.2));
        films.add(new Film("tt0468569", "The Dark Knight", 2008, 9.0));
        films.add(new Film("tt1375666", "Inception", 2010, 8.8));
        films.add(new Film("tt0133093", "The Matrix", 1999, 8.7));

        // Menampilkan semua film terlaris
        System.out.println("Daftar Film Terlaris:");
        for (Film film : films) {
            System.out.println(film);
        }

        // Mengurutkan film menggunakan algoritma selection sort
        selectionSort(films);

        // Menampilkan film terlaris setelah diurutkan
        System.out.println("\nDaftar Film Terlaris (Setelah Diurutkan):");
        for (Film film : films) {
            System.out.println(film);
        }
    }

    public static void selectionSort(List<Film> films) {
        int n = films.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (films.get(j).getRating() > films.get(minIndex).getRating()) {
                    minIndex = j;
                }
            }
            Collections.swap(films, i, minIndex);
        }
    }
}



