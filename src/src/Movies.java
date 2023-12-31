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
        return res + "\nMovies saved: " + size + "\tDatabase size: " + array.length;
    }


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

    public Film removeByName(String title) {
      return removeData(findIndexByName(title));

    }

    public int findIndexByName(String title) {
        for(int i = 0; i<size;i++){
            if(array[i].getTitle().equals(title)){
                return i;
            }

        }
        return -1;
    }

}