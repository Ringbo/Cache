diff --git a/jme3-core/src/main/java/com/jme3/environment/util/EnvMapUtils.java b/jme3-core/src/main/java/com/jme3/environment/util/EnvMapUtils.java
index 09f5827..9474cb2 100644
--- a/jme3-core/src/main/java/com/jme3/environment/util/EnvMapUtils.java
+++ b/jme3-core/src/main/java/com/jme3/environment/util/EnvMapUtils.java
@@ -608,7 +608,7 @@
         }
 
         for (int i = 0; i < 6; i++) {
-            ByteBuffer buf = BufferUtils.createByteBuffer(targetMapSize * targetMapSize * store.getImage().getFormat().getBitsPerPixel()/8);
+            ByteBuffer buf = BufferUtils.createByteBuffer(targetMapSize * targetMapSize * irrCubeMap.getImage().getFormat().getBitsPerPixel()/8);
             irrCubeMap.getImage().setData(i, buf);
         }
 
