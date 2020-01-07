package com.rc.dp.pattern.create.builder;

/**
 * @ClassName TerrainBuilder
 * @Description TODO
 * @Author liux
 * @Date 19-11-25 上午12:07
 * @Version 1.0
 */
public interface TerrainBuilder {
    TerrainBuilder buildWall();

    TerrainBuilder buildFort();

    TerrainBuilder buildMine();

    Terrain build();

}