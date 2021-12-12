diff --git a/src/info/ata4/unity/cli/extract/AssetExtractHandler.java b/src/info/ata4/unity/cli/extract/AssetExtractHandler.java
index e6ebed4..a0e9b49 100644
--- a/src/info/ata4/unity/cli/extract/AssetExtractHandler.java
+++ b/src/info/ata4/unity/cli/extract/AssetExtractHandler.java
@@ -73,7 +73,7 @@
 
     public void setOutputFileName(String outFileName) {
         // remove any chars that could cause troubles on various file systems
-        if (StringUtils.isBlank(outFileName)) {
+        if (!StringUtils.isBlank(outFileName)) {
             outFileName = outFileName.replaceAll("[^a-zA-Z0-9\\._]+", "_");
         }
         this.outFileName = outFileName;
