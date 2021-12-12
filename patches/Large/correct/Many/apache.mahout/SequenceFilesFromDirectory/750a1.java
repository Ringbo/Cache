diff --git a/integration/src/main/java/org/apache/mahout/text/SequenceFilesFromDirectory.java b/integration/src/main/java/org/apache/mahout/text/SequenceFilesFromDirectory.java
index e0572b2..9cd4f8b 100644
--- a/integration/src/main/java/org/apache/mahout/text/SequenceFilesFromDirectory.java
+++ b/integration/src/main/java/org/apache/mahout/text/SequenceFilesFromDirectory.java
@@ -93,7 +93,7 @@
                                            ChunkedWriter.class,
                                            Charset.class,
                                            FileSystem.class);
-        pathFilter = constructor.newInstance(conf, keyPrefix, options, writer, fs);
+        pathFilter = constructor.newInstance(conf, keyPrefix, options, writer, charset, fs);
       }
       fs.listStatus(input, pathFilter);
     } finally {
