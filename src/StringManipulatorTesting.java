public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator finalstring = new StringManipulator();
        String result = finalstring.trimAndConcat("         hola     ", "   world          ");
        System.out.println(result);

        StringManipulator testindex = new StringManipulator();
        Integer finalvalue = testindex.getIndexOrNull("hola esta es una prueba testesteststste.", 'u');
        System.out.println(finalvalue);

        StringManipulator findSubString = new StringManipulator();
        Integer finalValue = findSubString.getIndexOrNull("hola esta es una prueba testesteststste.", "pru");
        System.out.println(finalValue);

        StringManipulator combineString = new StringManipulator();
        String endResult = combineString.concatSubstring("hola esta es una prueba testesteststste.", 7, 9, "tarjeta");
        System.out.println(endResult);
    }
}