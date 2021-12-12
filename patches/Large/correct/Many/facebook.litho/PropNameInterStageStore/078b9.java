diff --git a/litho-processor/src/main/java/com/facebook/litho/specmodels/processor/PropNameInterStageStore.java b/litho-processor/src/main/java/com/facebook/litho/specmodels/processor/PropNameInterStageStore.java
index 3395ce7..3d67821 100644
--- a/litho-processor/src/main/java/com/facebook/litho/specmodels/processor/PropNameInterStageStore.java
+++ b/litho-processor/src/main/java/com/facebook/litho/specmodels/processor/PropNameInterStageStore.java
@@ -77,7 +77,7 @@
   public void saveNames(SpecModel specModel) throws IOException {
     // This is quite important, because we must not open resources without writing to them
     // due to a bug in the Buck caching layer.
-    if (specModel.getProps().isEmpty()) {
+    if (specModel.getRawProps().isEmpty()) {
       return;
     }
 
@@ -87,7 +87,7 @@
 
     try (Writer writer =
         new BufferedWriter(new OutputStreamWriter(outputFile.openOutputStream()))) {
-      for (final PropModel propModel : specModel.getProps()) {
+      for (final PropModel propModel : specModel.getRawProps()) {
         writer.write(propModel.getName() + "\n");
       }
     }
