package com.ravlal.ravlal_gameengine.collision;

import com.ravlal.ravlal_gameengine.collision.shape.ShapeCollidable;

public interface Collidable {

    CollisionType getCollisionType();

    void setCollisionType(CollisionType collisionType);

    ShapeCollidable getCollisionShape();

    void setCollisionShape(ShapeCollidable shapeCollidable);

    void onCollision(Collidable otherObject);

}
