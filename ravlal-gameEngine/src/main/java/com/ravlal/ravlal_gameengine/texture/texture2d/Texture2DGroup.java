package com.ravlal.ravlal_gameengine.texture.texture2d;

import com.ravlal.ravlal_gameengine.texture.BaseTextureGroup;

import java.util.List;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class Texture2DGroup extends BaseTextureGroup<Texture2D> {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Texture2DGroup() {
        super();
    }

    public Texture2DGroup(List<Texture2D> textures) {
        super(textures);
    }
    //========================================================

}
