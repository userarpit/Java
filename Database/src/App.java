package src;
import static java.lang.Math.min;

import java.io.PrintStream;

public class App {
  private static int min;

    /**
    * @param args
    * @throws Exception
     */
    public static void main(final String[] args) {
        final PrintStream out = System.out;

        final String x = "Hello, World!";
        out.println(x);
        System.out.println("App.main()");
        for (final String arg : args) {
            System.out.println(arg);
        }
        System.out.println("Arpit" + " " + "Khandelwal");
        minimum();
        final var j = 3;
        System.out.println(j);

    }

    /**
     * @minimum
     */
    private static void minimum() {
        final int a=23;
        min = min(a,54);
        System.out.println(min);
    }

    /**
     * @param value
     */
    public void method(final int value) {
        if (value > 5 && value < 15)
        {
            // do something
        }
    }
}

class B extends App {
    String name;

    public B(final String name) {
        this.name = name;
    }

    /**
     * @param index number
     * @return index charat
     */
    public char charAt(final int index) {
        return name.charAt(index);
    }

    @Override
    public String toString() {
        return "B [name=" + name + "]";
    }

    /**
     * @param suffix suffix of name
     * @return boolean
     */
    public boolean endsWith(final String suffix) {
        return name.endsWith(suffix);
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name1 set the name of the object
     */
    public void setName(final String name1) {
        this.name = name1;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        B other = (B) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}