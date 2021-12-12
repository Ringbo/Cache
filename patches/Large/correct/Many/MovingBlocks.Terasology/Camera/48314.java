diff --git a/src/main/java/org/terasology/rendering/cameras/Camera.java b/src/main/java/org/terasology/rendering/cameras/Camera.java
index 82ad100..3cb5a83 100644
--- a/src/main/java/org/terasology/rendering/cameras/Camera.java
+++ b/src/main/java/org/terasology/rendering/cameras/Camera.java
@@ -128,7 +128,7 @@
 
     public float getClipHeight() {
         if (_reflected)
-            return 32.0f;
+            return 31.5f;
         return 0;
     }
 }
