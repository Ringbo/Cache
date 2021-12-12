diff --git a/src/java/org/apache/cassandra/io/compress/CompressionParameters.java b/src/java/org/apache/cassandra/io/compress/CompressionParameters.java
index cf16711..2ca99f5 100644
--- a/src/java/org/apache/cassandra/io/compress/CompressionParameters.java
+++ b/src/java/org/apache/cassandra/io/compress/CompressionParameters.java
@@ -116,7 +116,7 @@
         validateCrcCheckChance(crcCheckChance);
         this.crcCheckChance = crcCheckChance;
 
-        if (liveMetadata != null)
+        if (liveMetadata != null && this != liveMetadata.compressionParameters)
             liveMetadata.compressionParameters.setCrcCheckChance(crcCheckChance);
     }
 
