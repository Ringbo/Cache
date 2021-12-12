diff --git a/lucene/misc/src/java/org/apache/lucene/uninverting/DocTermOrds.java b/lucene/misc/src/java/org/apache/lucene/uninverting/DocTermOrds.java
index d29260c..afd5a85 100644
--- a/lucene/misc/src/java/org/apache/lucene/uninverting/DocTermOrds.java
+++ b/lucene/misc/src/java/org/apache/lucene/uninverting/DocTermOrds.java
@@ -895,7 +895,7 @@
       try {
         return getOrdTermsEnum(reader);
       } catch (IOException e) {
-        throw new RuntimeException();
+        throw new RuntimeException(e);
       }
     }
   }
