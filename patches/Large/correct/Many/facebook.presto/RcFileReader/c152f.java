diff --git a/presto-rcfile/src/main/java/com/facebook/presto/rcfile/RcFileReader.java b/presto-rcfile/src/main/java/com/facebook/presto/rcfile/RcFileReader.java
index 0cbaf67..26be5c8 100644
--- a/presto-rcfile/src/main/java/com/facebook/presto/rcfile/RcFileReader.java
+++ b/presto-rcfile/src/main/java/com/facebook/presto/rcfile/RcFileReader.java
@@ -130,7 +130,7 @@
         else if (SEQUENCE_FILE_MAGIC.equals(magic)) {
             // first version of RCFile used magic SEQ with version 6
             byte sequenceFileVersion = input.readByte();
-            if (sequenceFileVersion == SEQUENCE_FILE_VERSION) {
+            if (sequenceFileVersion != SEQUENCE_FILE_VERSION) {
                 throw corrupt("File %s is a SequenceFile not an RCFile", dataSource);
             }
 
