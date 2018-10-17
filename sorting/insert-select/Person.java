public class Person<T> implements Comparable<T> {
    T key;
    String name;

    public Person(T key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[key : " + key + ", name : " + name + "]\n";
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;

        return this.key == p.key;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;

        if (p.key instanceof Integer) {
            if ((Integer) this.key > (Integer) p.key)
                return 1;
            else if (this.key == p.key)
                return 0;
            else
                return -1;
        }

        else if (p.key instanceof Character) {
            if ((Character) this.key > (Character) p.key)
                return 1;
            else if (this.key == p.key)
                return 0;
            else
                return -1;
        }

        else if (p.key instanceof Long) {
            if ((Long) this.key > (Long) p.key)
                return 1;
            else if (this.key == p.key)
                return 0;
            else
                return -1;
        }

        else if (p.key instanceof Double) {
            if ((Double) this.key > (Double) p.key)
                return 1;
            else if (this.key == p.key)
                return 0;
            else
                return -1;
        }

        else if (p.key instanceof Float) {
            if ((Float) this.key > (Float) p.key)
                return 1;
            else if (this.key == p.key)
                return 0;
            else
                return -1;
        }

        else if (p.key instanceof String) {
            return ((String)this.key).compareTo((String)p.key);
        }

        return 0;
    }
}
