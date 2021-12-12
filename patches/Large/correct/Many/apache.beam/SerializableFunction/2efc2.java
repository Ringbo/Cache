diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/SerializableFunction.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/SerializableFunction.java
index eb15630..b2ac9ed 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/SerializableFunction.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/SerializableFunction.java
@@ -28,5 +28,5 @@
  */
 public interface SerializableFunction<InputT, OutputT> extends Serializable {
   /** Returns the result of invoking this function on the given input. */
-  public OutputT apply(InputT input);
+  OutputT apply(InputT input);
 }
