package org.example;

import org.example.block.Block;

import java.util.List;
import java.util.Optional;

interface Structure {
    //Get element with given color
    public Optional<Block> findBlockByColor(String color);

    //Get list of elements with given material
    public List<Block> findBlocksByMaterial(String material);

    //Get size of elements' list
   public  int count();


}