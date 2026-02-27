package MethodImpl;
public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // append()
        sb.append(" World");
        System.out.println("Append: " + sb);

        // insert()
        sb.insert(5, " Java");
        System.out.println("Insert: " + sb);

        // replace()
        sb.replace(0, 5, "Hi");
        System.out.println("Replace: " + sb);

        // delete()
        sb.delete(2, 7);
        System.out.println("Delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // length()
        System.out.println("Length: " + sb.length());

        // capacity()
        System.out.println("Capacity: " + sb.capacity());
    }
}
