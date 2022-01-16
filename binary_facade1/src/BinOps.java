public class BinOps {
    public String sum(String a, String b) {
        int parseA = Integer.parseInt(a, 2);
        int parseB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(parseA + parseB);
    }

    public String mult(String a, String b) {
        int parseA = Integer.parseInt(a, 2);
        int parseB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(parseA * parseB);
    }
}