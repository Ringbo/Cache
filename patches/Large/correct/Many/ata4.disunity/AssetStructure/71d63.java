diff --git a/src/info/ata4/unity/extract/AssetStructure.java b/src/info/ata4/unity/extract/AssetStructure.java
index 2e9fc61..a39c337 100644
--- a/src/info/ata4/unity/extract/AssetStructure.java
+++ b/src/info/ata4/unity/extract/AssetStructure.java
@@ -63,7 +63,7 @@
     
     private void printStruct(PrintStream ps, File dir) throws FileNotFoundException {
         FieldTree fieldTree = asset.getFieldTree();
-        if (!fieldTree.isStandalone()) {
+        if (fieldTree.isStandalone()) {
             L.info("No structure data available");
             return;
         }
