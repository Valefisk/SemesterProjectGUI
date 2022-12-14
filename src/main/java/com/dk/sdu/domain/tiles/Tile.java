package com.dk.sdu.domain.tiles;

import com.dk.sdu.domain.tiles.forests.AbstractForest;

import java.util.Set;
import java.util.HashMap;


public class Tile
{
    private AbstractForest abstractForest;
    private String description;
    private HashMap<String, Tile> exits;

    public Tile(String description, AbstractForest abstractForest)
    {
        this.description = description;
        this.abstractForest = abstractForest;
        exits = new HashMap<String, Tile>();
    }

    public void setExit(String direction, Tile neighbor)
    {
        exits.put(direction, neighbor);
    }

    public String getShortDescription()
    {
        return description;
    }

    public String getLongDescription(String setDescription)
    {
        return "You are in " + description + setDescription + ".\n" + getExitString();
    }

    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    public AbstractForest getForest() {
        return this.abstractForest;
    }


    public Tile getExit(String direction)
    {
        return exits.get(direction);
    }
}
