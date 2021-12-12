diff --git a/lucene/contrib/demo/src/java/org/apache/lucene/demo/SearchFiles.java b/lucene/contrib/demo/src/java/org/apache/lucene/demo/SearchFiles.java
index 4a24e60..7d1e929 100644
--- a/lucene/contrib/demo/src/java/org/apache/lucene/demo/SearchFiles.java
+++ b/lucene/contrib/demo/src/java/org/apache/lucene/demo/SearchFiles.java
@@ -189,7 +189,7 @@
                   
       }
 
-      if (!interactive) {
+      if (!interactive || end == 0) {
         break;
       }
 
