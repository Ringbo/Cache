diff --git a/src/org/anddev/andengine/entity/shape/RectangularShape.java b/src/org/anddev/andengine/entity/shape/RectangularShape.java
index 2141fef..c63c13e 100644
--- a/src/org/anddev/andengine/entity/shape/RectangularShape.java
+++ b/src/org/anddev/andengine/entity/shape/RectangularShape.java
@@ -105,7 +105,7 @@
 	// ===========================================================
 
 	public void setBaseSize() {
-		if(this.mWidth != this.mBaseWidth && this.mHeight != this.mBaseHeight) {
+		if(this.mWidth != this.mBaseWidth || this.mHeight != this.mBaseHeight) {
 			this.mWidth = this.mBaseWidth;
 			this.mHeight = this.mBaseHeight;
 			this.onPositionChanged();
