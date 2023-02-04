package org.example.block;

import java.util.ArrayList;
import java.util.List;

//Implementing Composite Block that consist of two blocks. The assumption is to get color value of Composite Block
//from the first block that is passed and material from the second passed block.
public class CompositeBlockImp implements CompositeBlock{

  private final List<Block> blocks;
  String color;
  String material;

    public CompositeBlockImp(Block block1, Block block2) {

        this.blocks = new ArrayList<Block>();
        blocks.add(block1);
        blocks.add(block2);
        this.color = block1.getColor();
        this.material = block2.getMaterial();
    }


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }

    @Override
    public String toString() {
        return "CompositeBlockImp{" +
                "blocks=" + blocks +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

