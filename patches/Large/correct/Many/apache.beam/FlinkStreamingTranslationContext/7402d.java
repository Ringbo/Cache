diff --git a/runners/flink/runner/src/main/java/org/apache/beam/runners/flink/translation/FlinkStreamingTranslationContext.java b/runners/flink/runner/src/main/java/org/apache/beam/runners/flink/translation/FlinkStreamingTranslationContext.java
index 6db252e..7932f68 100644
--- a/runners/flink/runner/src/main/java/org/apache/beam/runners/flink/translation/FlinkStreamingTranslationContext.java
+++ b/runners/flink/runner/src/main/java/org/apache/beam/runners/flink/translation/FlinkStreamingTranslationContext.java
@@ -107,7 +107,7 @@
   }
 
   public <T extends PInput> List<TaggedPValue> getInputs(PTransform<T, ?> transform) {
-    return currentTransform.getOutputs();
+    return currentTransform.getInputs();
   }
 
   @SuppressWarnings("unchecked")
