diff --git a/src/info/ata4/unity/cli/action/DumpAction.java b/src/info/ata4/unity/cli/action/DumpAction.java
index 7fd831b..2fd5109 100644
--- a/src/info/ata4/unity/cli/action/DumpAction.java
+++ b/src/info/ata4/unity/cli/action/DumpAction.java
@@ -99,7 +99,7 @@
     public void printStruct(AssetFile asset) {
         AssetClassType classType = asset.getClassType();
         
-        if (classType.hasTypeTree()) {
+        if (!classType.hasTypeTree()) {
             L.info("No type tree available");
             return;
         }
