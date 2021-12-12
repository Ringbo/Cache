diff --git a/core/src/processing/core/PGraphics3D.java b/core/src/processing/core/PGraphics3D.java
index 8a21f18..9f37f9d 100644
--- a/core/src/processing/core/PGraphics3D.java
+++ b/core/src/processing/core/PGraphics3D.java
@@ -1877,7 +1877,7 @@
                v[DR] * contribution[LIGHT_DIFFUSE_R]);
     v[G] = min(1, v[EG] + v[AG] * contribution[LIGHT_AMBIENT_G] +
                v[DG] * contribution[LIGHT_DIFFUSE_G]);
-    v[B] = min(1, v[EB] + v[AB] * contribution[LIGHT_AMBIENT_R] +
+    v[B] = min(1, v[EB] + v[AB] * contribution[LIGHT_AMBIENT_B] +
                v[DB] * contribution[LIGHT_DIFFUSE_B]);
     v[A] = min(1, v[DA]);
 
