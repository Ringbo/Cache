diff --git a/core/java/android/util/MapCollections.java b/core/java/android/util/MapCollections.java
index 09f1f8e..f4a9b0b 100644
--- a/core/java/android/util/MapCollections.java
+++ b/core/java/android/util/MapCollections.java
@@ -328,12 +328,12 @@
 
         @Override
         public Object[] toArray() {
-            return toArrayHelper(1);
+            return toArrayHelper(0);
         }
 
         @Override
         public <T> T[] toArray(T[] array) {
-            return toArrayHelper(array, 1);
+            return toArrayHelper(array, 0);
         }
 
         @Override
