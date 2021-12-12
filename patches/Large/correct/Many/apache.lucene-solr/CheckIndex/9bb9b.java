diff --git a/lucene/core/src/java/org/apache/lucene/index/CheckIndex.java b/lucene/core/src/java/org/apache/lucene/index/CheckIndex.java
index 246784e..0c24461 100644
--- a/lucene/core/src/java/org/apache/lucene/index/CheckIndex.java
+++ b/lucene/core/src/java/org/apache/lucene/index/CheckIndex.java
@@ -955,7 +955,7 @@
         lastTerm.copyBytes(term);
       } else {
         if (lastTerm.get().compareTo(term) >= 0) {
-          throw new RuntimeException("terms out of order: lastTerm=" + lastTerm + " term=" + term);
+          throw new RuntimeException("terms out of order: lastTerm=" + lastTerm.get() + " term=" + term);
         }
         lastTerm.copyBytes(term);
       }
@@ -1083,7 +1083,7 @@
           lastTerm.copyBytes(term);
         } else {
           if (lastTerm.get().compareTo(term) >= 0) {
-            throw new RuntimeException("terms out of order: lastTerm=" + lastTerm + " term=" + term);
+            throw new RuntimeException("terms out of order: lastTerm=" + lastTerm.get() + " term=" + term);
           }
           lastTerm.copyBytes(term);
         }
@@ -1240,7 +1240,7 @@
           lastTerm.copyBytes(term);
         } else {
           if (lastTerm.get().compareTo(term) >= 0) {
-            throw new RuntimeException("terms out of order: lastTerm=" + lastTerm + " term=" + term);
+            throw new RuntimeException("terms out of order: lastTerm=" + lastTerm.get() + " term=" + term);
           }
           lastTerm.copyBytes(term);
         }
@@ -1547,7 +1547,7 @@
         // Test seek to last term:
         if (lastTerm != null) {
           if (termsEnum.seekCeil(lastTerm.get()) != TermsEnum.SeekStatus.FOUND) { 
-            throw new RuntimeException("seek to last term " + lastTerm + " failed");
+            throw new RuntimeException("seek to last term " + lastTerm.get() + " failed");
           }
           if (termsEnum.term().equals(lastTerm.get()) == false) {
             throw new RuntimeException("seek to last term " + lastTerm.get() + " returned FOUND but seeked to the wrong term " + termsEnum.term());
@@ -1560,7 +1560,7 @@
             docFreq++;
           }
           if (docFreq != expectedDocFreq) {
-            throw new RuntimeException("docFreq for last term " + lastTerm.toBytesRef() + "=" + expectedDocFreq + " != recomputed docFreq=" + docFreq);
+            throw new RuntimeException("docFreq for last term " + lastTerm.get() + "=" + expectedDocFreq + " != recomputed docFreq=" + docFreq);
           }
         }
         
