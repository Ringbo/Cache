diff --git a/core/common/src/main/java/alluxio/collections/IndexedSet.java b/core/common/src/main/java/alluxio/collections/IndexedSet.java
index 12251c3..35a4156 100644
--- a/core/common/src/main/java/alluxio/collections/IndexedSet.java
+++ b/core/common/src/main/java/alluxio/collections/IndexedSet.java
@@ -165,7 +165,7 @@
    */
   @Override
   public boolean add(T object) {
-    Preconditions.checkNotNull(object);
+    Preconditions.checkNotNull(object, "object");
 
     // Locking this object protects against removing the exact object, but does not protect against
     // removing a distinct, but equivalent object.
