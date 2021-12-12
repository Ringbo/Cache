diff --git a/core/common/src/main/java/alluxio/resource/DynamicResourcePool.java b/core/common/src/main/java/alluxio/resource/DynamicResourcePool.java
index 1d4c316..b4b0501 100644
--- a/core/common/src/main/java/alluxio/resource/DynamicResourcePool.java
+++ b/core/common/src/main/java/alluxio/resource/DynamicResourcePool.java
@@ -52,11 +52,11 @@
   /**
    * A wrapper on the resource to include the last time at which it was used.
    *
-   * @param <T> the resource type
+   * @param <R> the resource type
    */
-  protected class ResourceInternal<T> {
+  protected class ResourceInternal<R> {
     /** The resource. */
-    private T mResource;
+    private R mResource;
 
     /** The last access time in ms. */
     private long mLastAccessTimeMs;
@@ -80,7 +80,7 @@
      *
      * @param resource the resource
      */
-    public ResourceInternal(T resource) {
+    public ResourceInternal(R resource) {
       mResource = resource;
       mLastAccessTimeMs = mClock.millis();
     }
