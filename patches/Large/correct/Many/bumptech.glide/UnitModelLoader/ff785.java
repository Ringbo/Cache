diff --git a/library/src/main/java/com/bumptech/glide/load/model/UnitModelLoader.java b/library/src/main/java/com/bumptech/glide/load/model/UnitModelLoader.java
index b3807a2..e93e413 100644
--- a/library/src/main/java/com/bumptech/glide/load/model/UnitModelLoader.java
+++ b/library/src/main/java/com/bumptech/glide/load/model/UnitModelLoader.java
@@ -64,12 +64,13 @@
 
   /**
    * Factory for producing {@link com.bumptech.glide.load.model.UnitModelLoader}s.
+   *
+   * @param <Model> The type of model that will also be returned as decodable data.
    */
-  public static class Factory<ResourceType> implements ModelLoaderFactory<ResourceType,
-      ResourceType> {
+  public static class Factory<Model> implements ModelLoaderFactory<Model, Model> {
 
     @Override
-    public ModelLoader<ResourceType, ResourceType> build(Context context,
+    public ModelLoader<Model, Model> build(Context context,
         MultiModelLoaderFactory multiFactory) {
       return new UnitModelLoader<>();
     }
