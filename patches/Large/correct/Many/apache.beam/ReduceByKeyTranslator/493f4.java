diff --git a/sdks/java/extensions/euphoria/euphoria-flink/src/main/java/cz/seznam/euphoria/flink/streaming/ReduceByKeyTranslator.java b/sdks/java/extensions/euphoria/euphoria-flink/src/main/java/cz/seznam/euphoria/flink/streaming/ReduceByKeyTranslator.java
index 143e830..29461a6 100644
--- a/sdks/java/extensions/euphoria/euphoria-flink/src/main/java/cz/seznam/euphoria/flink/streaming/ReduceByKeyTranslator.java
+++ b/sdks/java/extensions/euphoria/euphoria-flink/src/main/java/cz/seznam/euphoria/flink/streaming/ReduceByKeyTranslator.java
@@ -239,7 +239,7 @@
     @SuppressWarnings("unchecked")
     public TypeInformation<MultiWindowedElement<GROUP, LABEL, Pair<KEY, VALUE>>>
     getProducedType() {
-      return TypeInformation.of((Class) StreamingWindowedElement.class);
+      return TypeInformation.of((Class) MultiWindowedElement.class);
     }
   } // ~ end of MultiWindowedElementIncrementalReducer
 
