diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/common/Reiterable.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/common/Reiterable.java
index 23f8960..d8086bb 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/common/Reiterable.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/common/Reiterable.java
@@ -24,5 +24,5 @@
  */
 public interface Reiterable<T> extends Iterable<T> {
   @Override
-  public Reiterator<T> iterator();
+  Reiterator<T> iterator();
 }
