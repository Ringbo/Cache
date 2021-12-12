diff --git a/lucene/core/src/java/org/apache/lucene/index/StandardDirectoryReader.java b/lucene/core/src/java/org/apache/lucene/index/StandardDirectoryReader.java
index 7e4316a..493d741 100644
--- a/lucene/core/src/java/org/apache/lucene/index/StandardDirectoryReader.java
+++ b/lucene/core/src/java/org/apache/lucene/index/StandardDirectoryReader.java
@@ -173,7 +173,7 @@
             // Steal the ref returned by SegmentReader ctor:
             assert infos.info(i).info.dir == newReaders[i].getSegmentInfo().info.dir;
             assert infos.info(i).hasDeletions();
-            newReaders[i] = new SegmentReader(infos.info(i), newReaders[i].core, IOContext.READ);
+            newReaders[i] = new SegmentReader(infos.info(i), newReaders[i].core);
           }
         }
         success = true;
