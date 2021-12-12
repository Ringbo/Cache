diff --git a/src/info/ata4/unity/serdes/db/StructDatabase.java b/src/info/ata4/unity/serdes/db/StructDatabase.java
index 5c03318..34fdeb3 100644
--- a/src/info/ata4/unity/serdes/db/StructDatabase.java
+++ b/src/info/ata4/unity/serdes/db/StructDatabase.java
@@ -219,7 +219,7 @@
         AssetClassType classType = asset.getClassType();
         Set<Integer> classIDs = asset.getClassIDs();
         
-        if (classType.hasTypeTree()) {
+        if (!classType.hasTypeTree()) {
             L.info("No type tree available");
             return 0;
         }
