package com.ravlal.ravlal_gameengine.texture;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public abstract class BaseTexture implements Texture {

    private final TextureManager<? extends Texture, ? extends TextureGroup<? extends Texture>> mParent;
    private final TextureFormat mFormat;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected BaseTexture(TextureManager<? extends Texture, ? extends TextureGroup<? extends Texture>> textureManager, TextureFormat format) {
        mParent = textureManager;
        mFormat = format;
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    @Override
    public TextureFormat getFormat() {
        return mFormat;
    }
    //========================================================

    //--------------------------------------------------------
    // Methods
    //--------------------------------------------------------
    protected TextureManager<? extends Texture, ? extends TextureGroup<? extends Texture>> getParent() {
        return mParent;
    }
    //========================================================

}
