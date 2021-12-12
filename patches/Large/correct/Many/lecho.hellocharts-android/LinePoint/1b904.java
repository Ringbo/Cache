diff --git a/hellocharts-library/src/lecho/lib/hellocharts/model/LinePoint.java b/hellocharts-library/src/lecho/lib/hellocharts/model/LinePoint.java
index b32ca6d..fdf3bec 100644
--- a/hellocharts-library/src/lecho/lib/hellocharts/model/LinePoint.java
+++ b/hellocharts-library/src/lecho/lib/hellocharts/model/LinePoint.java
@@ -38,7 +38,7 @@
 	public void setTarget(float targetX, float targetY) {
 		set(x, y);
 		this.diffX = targetX - orginX;
-		this.diffY = targetY - diffY;
+		this.diffY = targetY - orginY;
 	}
 
 	public float getX() {
