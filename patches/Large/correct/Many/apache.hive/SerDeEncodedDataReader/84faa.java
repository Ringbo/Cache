diff --git a/llap-server/src/java/org/apache/hadoop/hive/llap/io/encoded/SerDeEncodedDataReader.java b/llap-server/src/java/org/apache/hadoop/hive/llap/io/encoded/SerDeEncodedDataReader.java
index 419043a..f6531e8 100644
--- a/llap-server/src/java/org/apache/hadoop/hive/llap/io/encoded/SerDeEncodedDataReader.java
+++ b/llap-server/src/java/org/apache/hadoop/hive/llap/io/encoded/SerDeEncodedDataReader.java
@@ -1475,8 +1475,7 @@
         Path path, StructObjectInspector oi) throws IOException {
       // TODO: this is currently broken. We need to set memory manager to a bogus implementation
       //       to avoid problems with memory manager actually tracking the usage.
-      return OrcFile.createWriter(path, createOrcWriterOptions(
-          sourceOi, conf, cacheWriter, allocSize));
+      return OrcFile.createWriter(path, createOrcWriterOptions(oi, conf, cacheWriter, allocSize));
     }
   }
 
