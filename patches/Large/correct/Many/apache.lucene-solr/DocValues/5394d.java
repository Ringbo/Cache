diff --git a/lucene/core/src/java/org/apache/lucene/index/DocValues.java b/lucene/core/src/java/org/apache/lucene/index/DocValues.java
index b25d484..700ae58 100644
--- a/lucene/core/src/java/org/apache/lucene/index/DocValues.java
+++ b/lucene/core/src/java/org/apache/lucene/index/DocValues.java
@@ -45,7 +45,7 @@
       @Override
       public boolean advanceExact(int target) throws IOException {
         doc = target;
-        return true;
+        return false;
       }
       
       @Override
