diff --git a/src/java/org/apache/lucene/store/SimpleFSDirectory.java b/src/java/org/apache/lucene/store/SimpleFSDirectory.java
index 11bdcb7..16a36ea 100644
--- a/src/java/org/apache/lucene/store/SimpleFSDirectory.java
+++ b/src/java/org/apache/lucene/store/SimpleFSDirectory.java
@@ -132,7 +132,7 @@
     }
   
     public Object clone() {
-      FSIndexInput clone = (FSIndexInput)super.clone();
+      SimpleFSIndexInput clone = (SimpleFSIndexInput)super.clone();
       clone.isClone = true;
       return clone;
     }
