diff --git a/driver-core/src/main/java/com/datastax/driver/core/ProtocolOptions.java b/driver-core/src/main/java/com/datastax/driver/core/ProtocolOptions.java
index e054787..a7df067 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/ProtocolOptions.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/ProtocolOptions.java
@@ -115,7 +115,7 @@
      * available.
      */
     public ProtocolOptions setCompression(Compression compression) {
-        if (compression.compressor == null)
+        if (compression != Compression.NONE && compression.compressor == null)
             throw new IllegalStateException("The requested compression is not available (some compression require a JAR to be found in the classpath)");
 
         this.compression = compression;
