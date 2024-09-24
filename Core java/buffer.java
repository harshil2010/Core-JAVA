public class buffer {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Harshil");
        sb.append(" Kathiriya");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        String str= sb.toString();
        sb.insert(0, "HK ");
        sb.ensureCapacity(100);
        System.out.println(sb);
        System.out.println(str);
    }
}
