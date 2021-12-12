diff --git a/core/common/src/main/java/alluxio/collections/ConcurrentHashSet.java b/core/common/src/main/java/alluxio/collections/ConcurrentHashSet.java
index 763b067..7bdd590 100644
--- a/core/common/src/main/java/alluxio/collections/ConcurrentHashSet.java
+++ b/core/common/src/main/java/alluxio/collections/ConcurrentHashSet.java
@@ -137,7 +137,7 @@
   }
 
   @Override
-  public <T> T[] toArray(T[] a) {
+  public <E> E[] toArray(E[] a) {
     return mMap.keySet().toArray(a);
   }
 
