diff --git a/engine/src/core-plugins/com/jme3/scene/plugins/OBJLoader.java b/engine/src/core-plugins/com/jme3/scene/plugins/OBJLoader.java
index b6b66d0..e03c4b2 100644
--- a/engine/src/core-plugins/com/jme3/scene/plugins/OBJLoader.java
+++ b/engine/src/core-plugins/com/jme3/scene/plugins/OBJLoader.java
@@ -408,7 +408,7 @@
             geom.setQueueBucket(Bucket.Opaque);
         
         if (material.getMaterialDef().getName().contains("Lighting")
-          || mesh.getFloatBuffer(Type.Normal) == null){
+          && mesh.getFloatBuffer(Type.Normal) == null){
             logger.log(Level.WARNING, "OBJ mesh {0} doesn't contain normals! "
                                     + "It might not display correctly", geom.getName());
         }
