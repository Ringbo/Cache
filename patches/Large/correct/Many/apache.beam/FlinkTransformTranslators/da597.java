diff --git a/runners/flink/src/main/java/com/dataartisans/flink/dataflow/translation/FlinkTransformTranslators.java b/runners/flink/src/main/java/com/dataartisans/flink/dataflow/translation/FlinkTransformTranslators.java
index 5a1860e..43f32fd 100644
--- a/runners/flink/src/main/java/com/dataartisans/flink/dataflow/translation/FlinkTransformTranslators.java
+++ b/runners/flink/src/main/java/com/dataartisans/flink/dataflow/translation/FlinkTransformTranslators.java
@@ -155,7 +155,7 @@
 //			Schema schema = transform.getSchema();
 			PValue output = context.getOutput(transform);
 
-			TypeInformation<T> typeInformation = context.getInputTypeInfo();
+			TypeInformation<T> typeInformation = context.getTypeInfo(output);
 
 			// This is super hacky, but unfortunately we cannot get the type otherwise
 			Class<T> avroType = null;
