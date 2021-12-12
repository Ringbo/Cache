diff --git a/lucene/core/src/test/org/apache/lucene/index/TestLazyProxSkipping.java b/lucene/core/src/test/org/apache/lucene/index/TestLazyProxSkipping.java
index fb8189d..2af8ac3 100644
--- a/lucene/core/src/test/org/apache/lucene/index/TestLazyProxSkipping.java
+++ b/lucene/core/src/test/org/apache/lucene/index/TestLazyProxSkipping.java
@@ -230,7 +230,7 @@
 
           @Override
           public IndexInput slice(String sliceDescription, long offset, long length) throws IOException {
-            return new SeeksCountingStream(this.input.clone());
+            return new SeeksCountingStream(this.input.slice(sliceDescription, offset, length));
           }
     }
 }
