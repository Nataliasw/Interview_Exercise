package org.example;

import org.example.block.Block;
import org.example.block.BlockImp;
import org.example.block.CompositeBlockImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Initialising class and list of blocks that is to be added to the Wall class

        Wall wall = new Wall();
        List<Block> listOfBlocks = Arrays.asList(
                new BlockImp("white", "concrete"),
                new BlockImp("black", "concrete"),
                new BlockImp("white", "lime"),
                new BlockImp("black", "lime"),
                new BlockImp("brown", "lime"),
                new CompositeBlockImp(new BlockImp("purple", "concrete"), new BlockImp("black", "resin")),
                new CompositeBlockImp(new BlockImp("black", "lime"), new BlockImp("white", "resin")));

        wall.implementList(listOfBlocks);

        //#########
        //TESTS without JUnit
        //#########

        //Color
        if (wall.findBlockByColor("white").isPresent()) {
            System.out.println(wall.findBlockByColor("white"));
        } else {
            System.out.println("Block with that color not found");
        }

        //Material
        List<Block> foundBlocks = wall.findBlocksByMaterial("lime");
        if (foundBlocks.isEmpty()) {
            System.out.println("No blocks with that material found");
        } else {
            for (Block block : foundBlocks) {
                System.out.println(block);
            }
        }

        //Size
        System.out.println(wall.count());

    }


}