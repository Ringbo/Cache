diff --git a/lucene/src/test-framework/org/apache/lucene/index/codecs/mockrandom/MockRandomCodec.java b/lucene/src/test-framework/org/apache/lucene/index/codecs/mockrandom/MockRandomCodec.java
index 745c619..bfc9fc8 100644
--- a/lucene/src/test-framework/org/apache/lucene/index/codecs/mockrandom/MockRandomCodec.java
+++ b/lucene/src/test-framework/org/apache/lucene/index/codecs/mockrandom/MockRandomCodec.java
@@ -151,7 +151,7 @@
 
               @Override
               public boolean isIndexTerm(BytesRef term, TermStats stats) {
-                return random.nextInt(gap) == 17;
+                return rand.nextInt(gap) == 17;
               }
 
               @Override
