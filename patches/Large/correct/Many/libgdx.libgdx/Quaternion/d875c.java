diff --git a/gdx/src/com/badlogic/gdx/math/Quaternion.java b/gdx/src/com/badlogic/gdx/math/Quaternion.java
index 834492a..02a599f 100644
--- a/gdx/src/com/badlogic/gdx/math/Quaternion.java
+++ b/gdx/src/com/badlogic/gdx/math/Quaternion.java
@@ -501,7 +501,7 @@
 			xx *= lx;
 			xy *= lx;
 			xz *= lx;
-			yz *= ly;
+			yx *= ly;
 			yy *= ly;
 			yz *= ly;
 			zx *= lz;
