diff --git a/src/ServerInterface.java b/src/ServerInterface.java
index 8dfe4da..cc5d8ee 100644
--- a/src/ServerInterface.java
+++ b/src/ServerInterface.java
@@ -198,7 +198,7 @@
         }
 
         Chest chest = (Chest)cblock;
-        hj[] itemArray = chest.getArray();
+        hl[] itemArray = chest.getArray();
 
         // Find an existing slot to put it into
         for (int i = 0; itemArray.length > i; i++) {
