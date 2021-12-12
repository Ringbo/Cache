diff --git a/src/org/anddev/andengine/entity/shape/RectangularShape.java b/src/org/anddev/andengine/entity/shape/RectangularShape.java
index 9f1efea..17aa4e4 100644
--- a/src/org/anddev/andengine/entity/shape/RectangularShape.java
+++ b/src/org/anddev/andengine/entity/shape/RectangularShape.java
@@ -154,7 +154,7 @@
 		if(pOtherShape instanceof RectangularShape) {
 			final RectangularShape pOtherRectangularShape = (RectangularShape) pOtherShape;
 			return RectangularShapeCollisionChecker.checkCollision(this, pOtherRectangularShape);
-		} else if(pOtherShape instanceof RectangularShape) {
+		} else if(pOtherShape instanceof Line) {
 			final Line line = (Line) pOtherShape;
 			return RectangularShapeCollisionChecker.checkCollision(this, line);
 		} else {
