diff --git a/library/src/main/java/com/bumptech/glide/load/model/MultiModelLoaderFactory.java b/library/src/main/java/com/bumptech/glide/load/model/MultiModelLoaderFactory.java
index 1cb1ba2..9105067 100644
--- a/library/src/main/java/com/bumptech/glide/load/model/MultiModelLoaderFactory.java
+++ b/library/src/main/java/com/bumptech/glide/load/model/MultiModelLoaderFactory.java
@@ -28,17 +28,18 @@
     this(context, DEFAULT_FACTORY);
   }
 
+  // Visible for testing.
   MultiModelLoaderFactory(Context context, Factory factory) {
     this.context = context.getApplicationContext();
     this.factory = factory;
   }
 
-  <Model, Data> void append(Class<Model> modelClass, Class<Data> dataClass,
+  synchronized <Model, Data> void append(Class<Model> modelClass, Class<Data> dataClass,
       ModelLoaderFactory<Model, Data> factory) {
     add(modelClass, dataClass, factory, true /*append*/);
   }
 
-  <Model, Data> void prepend(Class<Model> modelClass, Class<Data> dataClass,
+  synchronized <Model, Data> void prepend(Class<Model> modelClass, Class<Data> dataClass,
       ModelLoaderFactory<Model, Data> factory) {
     add(modelClass, dataClass, factory, false /*append*/);
   }
@@ -49,14 +50,14 @@
     entries.add(append ? entries.size() : 0, entry);
   }
 
-  <Model, Data> List<ModelLoaderFactory<Model, Data>> replace(Class<Model> modelClass,
+  synchronized <Model, Data> List<ModelLoaderFactory<Model, Data>> replace(Class<Model> modelClass,
       Class<Data> dataClass, ModelLoaderFactory<Model, Data> factory) {
     List<ModelLoaderFactory<Model, Data>> removed = remove(modelClass, dataClass);
     append(modelClass, dataClass, factory);
     return removed;
   }
 
-  <Model, Data> List<ModelLoaderFactory<Model, Data>> remove(Class<Model> modelClass,
+  synchronized <Model, Data> List<ModelLoaderFactory<Model, Data>> remove(Class<Model> modelClass,
       Class<Data> dataClass) {
     List<ModelLoaderFactory<Model, Data>> factories = new ArrayList<>();
     for (Iterator<Entry<?, ?>> iterator = entries.iterator(); iterator.hasNext(); ) {
@@ -69,7 +70,7 @@
     return factories;
   }
 
-  <Model> List<ModelLoader<Model, ?>> build(Class<Model> modelClass) {
+  synchronized <Model> List<ModelLoader<Model, ?>> build(Class<Model> modelClass) {
     List<ModelLoader<Model, ?>> loaders = new ArrayList<>();
     for (Entry<?, ?> entry : entries) {
       // Avoid stack overflow recursively creating model loaders by only creating loaders in
@@ -89,7 +90,7 @@
     return loaders;
   }
 
-  List<Class<?>> getDataClasses(Class<?> modelClass) {
+  synchronized List<Class<?>> getDataClasses(Class<?> modelClass) {
     List<Class<?>> result = new ArrayList<>();
     for (Entry<?, ?> entry : entries) {
       if (!result.contains(entry.dataClass) && entry.handles(modelClass)) {
@@ -99,7 +100,7 @@
     return result;
   }
 
-  public <Model, Data> ModelLoader<Model, Data> build(Class<Model> modelClass,
+  public synchronized <Model, Data> ModelLoader<Model, Data> build(Class<Model> modelClass,
       Class<Data> dataClass) {
     List<ModelLoader<Model, Data>> loaders = new ArrayList<>();
     boolean ignoredAnyEntries = false;
