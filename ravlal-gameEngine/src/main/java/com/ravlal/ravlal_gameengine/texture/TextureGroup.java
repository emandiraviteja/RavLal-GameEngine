package com.ravlal.ravlal_gameengine.texture;

import java.util.List;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public interface TextureGroup<T extends Texture> {

    List<T> getTextures();

    int getTextureCount();

    void addTexture(T texture);

    void removeTexture(T texture);

    void addTextures(List<T> textures);

    void removeTextures(List<T> textures);

    void release();

}
