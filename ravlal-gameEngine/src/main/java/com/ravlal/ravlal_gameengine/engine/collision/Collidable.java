package com.ravlal.ravlal_gameengine.engine.collision;

import com.ravlal.ravlal_gameengine.engine.collision.hitbox.HitBox;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public interface Collidable {

    HitBox getCollisionHitBox();

    void setCollisionHitBox(HitBox hitBox);

    CollisionType getCollisionType();

    void setCollisionType(CollisionType collisionType);

    void onCollision(Collidable collidable);

}
