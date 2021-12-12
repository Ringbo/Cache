diff --git a/factory/src/test/java/com/google/auto/factory/processor/AutoFactoryProcessorTest.java b/factory/src/test/java/com/google/auto/factory/processor/AutoFactoryProcessorTest.java
index 68167c8..0ccbd43 100644
--- a/factory/src/test/java/com/google/auto/factory/processor/AutoFactoryProcessorTest.java
+++ b/factory/src/test/java/com/google/auto/factory/processor/AutoFactoryProcessorTest.java
@@ -129,7 +129,7 @@
             .processedWith(new AutoFactoryProcessor())
             .failsToCompile()
             .withErrorContaining("AutoFactory does not support generic types")
-                .in(file).onLine(6).atColumn(14);
+                .in(file).onLine(21).atColumn(14);
   }
 
   @Test public void providedButNoAutoFactory() {
