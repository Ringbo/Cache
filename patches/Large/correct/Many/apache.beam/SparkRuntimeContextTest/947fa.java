diff --git a/runners/spark/src/test/java/org/apache/beam/runners/spark/translation/SparkRuntimeContextTest.java b/runners/spark/src/test/java/org/apache/beam/runners/spark/translation/SparkRuntimeContextTest.java
index 372d46f..e8f578a 100644
--- a/runners/spark/src/test/java/org/apache/beam/runners/spark/translation/SparkRuntimeContextTest.java
+++ b/runners/spark/src/test/java/org/apache/beam/runners/spark/translation/SparkRuntimeContextTest.java
@@ -105,7 +105,7 @@
         .as(JacksonIncompatibleOptions.class);
     options.setRunner(CrashingRunner.class);
     Pipeline p = Pipeline.create(options);
-    SparkRuntimeContext context = new SparkRuntimeContext(p);
+    SparkRuntimeContext context = new SparkRuntimeContext(p, options);
 
     ByteArrayOutputStream baos = new ByteArrayOutputStream();
     try (ObjectOutputStream outputStream = new ObjectOutputStream(baos)) {
