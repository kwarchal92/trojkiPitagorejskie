package trojkiPitagorejskie;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class trojkiPitagorejskie{
    public Stream <int[]> Trojki = IntStream.rangeClosed(1,100)
            .boxed()
            .flatMap(a -> IntStream.rangeClosed(a,100))
            .filter(b -> Math.sqrt((a*a + b*b)% 1 == 0)
            .mapToObj(b -> new int[] {a,b, (int)Math.sqrt(a*a+b*b)}));
}
public class Main {
}
