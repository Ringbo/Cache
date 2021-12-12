diff --git a/subprojects/base-services/src/main/java/org/gradle/api/Transformer.java b/subprojects/base-services/src/main/java/org/gradle/api/Transformer.java
index aadb125..ac3966e 100644
--- a/subprojects/base-services/src/main/java/org/gradle/api/Transformer.java
+++ b/subprojects/base-services/src/main/java/org/gradle/api/Transformer.java
@@ -20,15 +20,15 @@
  * 
  * <p>Implementations are free to return new objects or mutate the incoming value.</p>
  *
- * @param <R> The type the value is transformed to.
- * @param <I> The type of the value to be transformed.
+ * @param <OUT> The type the value is transformed to.
+ * @param <IN> The type of the value to be transformed.
  */
-public interface Transformer<R, I> {
+public interface Transformer<OUT, IN> {
     /**
      * Transforms the given object, and returns the transformed value.
      *
      * @param original The object to transform.
      * @return The transformed object.
      */
-    R transform(I original);
+    OUT transform(IN original);
 }
