public class Movies {

    private int capacity = 5;
    private Film[] array = new Film[capacity];
    private int size = 0;


    public int size() {
        return size;
    }

    public void addData(Film film) {
        if (size >= array.length) {
            enlarge();
        }
        array[size++] = film;
    }

    public void enlarge() {
        Film[] temp = new Film[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public Film removeData(int index) {
        if (size < 0 || index > size) {
            return null;
        }
        Film temp = array[index];
        for (int i = 0; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[--size] = null;
        return temp;
    }


    public String toString() {
        if (size == 0) {
            return "";
        }
        String res = "";
        for (int i = 0; i < size; i++) {
            res += array[i] + ",\n";
        }
        res = res.length() > 1 ? res.substring(0, res.length() - 2) : "";
        return res + "\nMovies saved: " + size + "\nDatabase size: " + array.length;
    }
//    Film[] toArray() - который возвращает массив всех фильмов
//    Film removeByName(String title) - метод удаляет фильм с заданным названием.
//    Если такого названия нет, метод ничего не делает, возвращает null
//    void set(Film film, index index) - метод, который заменяет фильм с индексом index,
//    фильмом переданным в параметре

    public void setNew(Film film, int index) {
        array[index] = film;
    }

    public Film[] toArray() {
        Film[] temp = new Film[size + 1];
        if (array.length == 0) {
            return null;
        }
        for (int i = 0; i <= size; i++) {
            temp[i] = array[i];
        }
        return temp;
    }
    public void removeByName(String title) {

        if (size < 0 || size > array.length) {
           return;
        }
        for (int i = 0; i < size; i++) {
            if (array[i].getTitle().equals(title)) {
            array[i]=array[i+1];
            }
            array[--size] = null;                     // я не справился
        }
    }
}