import org.example.Wall;
import org.example.block.Block;
import org.example.block.BlockImp;
import org.example.block.CompositeBlockImp;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WallTest {

    Wall wall = new Wall();

    //Blocks used for testing and assertion
    Block testBlock = new BlockImp("white", "concrete");
    Block testCompositeBlock1 = new CompositeBlockImp(new BlockImp("purple", "concrete"), new BlockImp("black", "resin"));
    Block testCompositeBlock2 = new CompositeBlockImp(new BlockImp("black", "concrete"), new BlockImp("black", "resin"));

    @Test
    @Before
    public void testImplementList() {
        List<Block> listOfBlocks = Arrays.asList(
                testBlock,
                new BlockImp("black", "concrete"),
                new BlockImp("white", "lime"),
                new BlockImp("black", "lime"),
                new BlockImp("brown", "lime"),
                testCompositeBlock1,
                testCompositeBlock2);

        wall.implementList(listOfBlocks);
    }

    @Test
    public void testFindByColor() {

        Optional<Block> foundBlock = wall.findBlockByColor("white");

        assertEquals(testBlock, foundBlock.get(), String.valueOf(0.0));

    }

    @Test
    public void testFindBlocksByMaterial() {

        List<Block> foundBlocks = wall.findBlocksByMaterial("resin");
        List<Block> assertBlocks = Arrays.asList(testCompositeBlock1, testCompositeBlock2);
        assertEquals(assertBlocks, foundBlocks, String.valueOf(0.0));
    }

    @Test
    public void testCount() {
        int count = wall.count();
        assertEquals(7, count, String.valueOf(0.0));

    }
}
