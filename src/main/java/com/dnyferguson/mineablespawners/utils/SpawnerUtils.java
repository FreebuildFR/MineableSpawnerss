package com.dnyferguson.mineablespawners.utils;

import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;

public class SpawnerUtils {
  public static EntityType getSpawnedType(CreatureSpawner spawner) {
      EntityType entity = spawner.getSpawnedType();
      return (entity == null) ? EntityType.PIG : entity;
  }
}
