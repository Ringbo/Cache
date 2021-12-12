diff --git a/src/java/org/apache/lucene/util/OpenBitSet.java b/src/java/org/apache/lucene/util/OpenBitSet.java
index 97e144a..cef76f3 100644
--- a/src/java/org/apache/lucene/util/OpenBitSet.java
+++ b/src/java/org/apache/lucene/util/OpenBitSet.java
@@ -763,7 +763,7 @@
       long h = 0x98761234;  // something non-zero for length==0
       for (int i = bits.length; --i>=0;) {
       h ^= bits[i];
-      h = (h << 1) | (h >>> 31); // rotate left
+      h = (h << 1) | (h >>> 63); // rotate left
     }
     return (int)((h>>32) ^ h);  // fold leftmost bits into right
   }
