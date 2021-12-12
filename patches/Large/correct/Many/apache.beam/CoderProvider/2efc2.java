diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/CoderProvider.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/CoderProvider.java
index 0289447..0db73eb 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/CoderProvider.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/CoderProvider.java
@@ -30,5 +30,5 @@
    *
    * @throws CannotProvideCoderException if no coder can be provided
    */
-  public <T> Coder<T> getCoder(TypeDescriptor<T> type) throws CannotProvideCoderException;
+  <T> Coder<T> getCoder(TypeDescriptor<T> type) throws CannotProvideCoderException;
 }
