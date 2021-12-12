diff --git a/engine/src/main/java/org/terasology/rendering/headless/HeadlessMaterial.java b/engine/src/main/java/org/terasology/rendering/headless/HeadlessMaterial.java
index 8f984de..1f2cf4f 100644
--- a/engine/src/main/java/org/terasology/rendering/headless/HeadlessMaterial.java
+++ b/engine/src/main/java/org/terasology/rendering/headless/HeadlessMaterial.java
@@ -37,7 +37,7 @@
 
     @Override
     public void reload(MaterialData newData) {
-        this.data = data;
+        this.data = newData;
     }
 
     @Override
