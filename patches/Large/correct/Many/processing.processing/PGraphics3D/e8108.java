diff --git a/core/src/processing/core/PGraphics3D.java b/core/src/processing/core/PGraphics3D.java
index b648739..fd249b7 100644
--- a/core/src/processing/core/PGraphics3D.java
+++ b/core/src/processing/core/PGraphics3D.java
@@ -1844,7 +1844,7 @@
       min(1, v[EG] + v[AG] * lightContribution[LIGHT_AMBIENT_G] +
           v[DG] * lightContribution[LIGHT_DIFFUSE_G]);
     triColor[TRI_DIFFUSE_B] =
-      min(1, v[EB] + v[AB] * lightContribution[LIGHT_AMBIENT_R] +
+      min(1, v[EB] + v[AB] * lightContribution[LIGHT_AMBIENT_B] +
           v[DB] * lightContribution[LIGHT_DIFFUSE_B]);
     triColor[TRI_DIFFUSE_A] = min(1, v[DA]);
 
