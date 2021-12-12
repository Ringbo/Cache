diff --git a/requery-processor/src/main/java/io/requery/processor/ModelGenerator.java b/requery-processor/src/main/java/io/requery/processor/ModelGenerator.java
index ad30f6b..4762209 100644
--- a/requery-processor/src/main/java/io/requery/processor/ModelGenerator.java
+++ b/requery-processor/src/main/java/io/requery/processor/ModelGenerator.java
@@ -48,7 +48,7 @@
     private final ProcessingEnvironment processingEnvironment;
     private final Collection<? extends EntityDescriptor> entities;
 
-    public ModelGenerator(ProcessingEnvironment processingEnvironment,
+    ModelGenerator(ProcessingEnvironment processingEnvironment,
                           String packageName,
                           Collection<? extends EntityDescriptor> entities) {
         this.processingEnvironment = processingEnvironment;
