diff --git a/factory/src/main/java/com/google/auto/factory/processor/AutoFactoryProcessor.java b/factory/src/main/java/com/google/auto/factory/processor/AutoFactoryProcessor.java
index 2f1006a..ad4e911 100644
--- a/factory/src/main/java/com/google/auto/factory/processor/AutoFactoryProcessor.java
+++ b/factory/src/main/java/com/google/auto/factory/processor/AutoFactoryProcessor.java
@@ -70,7 +70,7 @@
   @Override
   public synchronized void init(ProcessingEnvironment processingEnv) {
     super.init(processingEnv);
-    Dagger_AutoFactoryProcessorComponent.builder()
+    DaggerAutoFactoryProcessorComponent.builder()
         .processorModule(new ProcessorModule(processingEnv))
         .build()
         .injectProcessor(this);
