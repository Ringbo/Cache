diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/common/Reiterator.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/common/Reiterator.java
index 8624790..e865c83 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/common/Reiterator.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/common/Reiterator.java
@@ -36,5 +36,5 @@
    * true for the corresponding elements of each if the original source is
    * logically immutable.
    */
-  public Reiterator<T> copy();
+  Reiterator<T> copy();
 }
