package org.example;


import org.example.block.Block;
import org.example.block.CompositeBlock;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private final List<Block> blocks;

    public Wall() {
        this.blocks = new ArrayList<Block>();
    }

    public void implementList(List<Block> blocksToAdd){
        blocks.addAll(blocksToAdd);
    }

    public Optional<Block> findBlockByColor(String color) {

       return Optional.of(blocks.stream().filter(b ->Objects.equals(b.getColor(), color)).findFirst().get());

    }



    public List<Block> findBlocksByMaterial(String material) {
        List<Block> foundBlocks = new ArrayList<Block>();
        for (Block block : blocks) {
            if (block.getMaterial().equals(material)) {
                foundBlocks.add(block);
            }
        }
        return foundBlocks;
    }


    public int count() {
        return blocks.size();
    }



}