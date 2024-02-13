import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import com.stem.*;
import com.stem.Nube.TiposDeNubes;

public class NubeTest {

    @Test
    public void unirNube() {
        Nube nube1 = new Nube(TiposDeNubes.NIMBOS, 10, 30);
        Nube nube2 = new Nube(TiposDeNubes.CIRROS, 10, 30);
        Nube nube3 = new Nube(TiposDeNubes.NIMBOS, 20, 45);

        assertEquals(60, nube1.unirNube(nube2));
        assertEquals(-1, nube1.unirNube(nube3));

    }

    @Test
    public void crecer() {
        Nube nube1 = new Nube(TiposDeNubes.NIMBOS, 10, 30);

        assertEquals(45, nube1.crecer());

        nube1.setTamanio(60);
        assertEquals(90, nube1.crecer());
        nube1.setTamanio(123);
        assertEquals(184.5, nube1.crecer());
    }

    @Test
    public void subir() {
        Nube nube1 = new Nube(TiposDeNubes.NIMBOS, 10, 30);

        assertEquals(20, nube1.subir(10));
        // nube1 tine altura 20
        assertEquals(65, nube1.subir(45));
        // nube1 tiene altura 65
        assertEquals(97.7, nube1.subir(32.7));
        assertEquals(97.7, nube1.subir(-65));

    }

}
