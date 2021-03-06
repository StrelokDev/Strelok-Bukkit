package org.bukkit.entity;

import org.bukkit.block.Block;

/**
 * Represents a Primed TNT.
 */
public interface TNTPrimed extends Explosive {
    /**
     * Set the number of ticks until the TNT blows up after being primed.
     *
     * @param fuseTicks The fuse ticks
     */
    public void setFuseTicks(int fuseTicks);

    /**
     * Retrieve the number of ticks until the explosion of this TNTPrimed entity
     *
     * @return the number of ticks until this TNTPrimed explodes
     */
    public int getFuseTicks();
    
    /**
     * Récupère le bloc d'origine (le bloc placé)
     * 
     * @return Bloc de TNT placé
     */
     public Block getOriginalBlock();
}
