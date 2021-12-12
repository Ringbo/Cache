diff --git a/src/info/ata4/unity/extract/StructDatabase.java b/src/info/ata4/unity/extract/StructDatabase.java
index 1637ae1..2c4a978 100644
--- a/src/info/ata4/unity/extract/StructDatabase.java
+++ b/src/info/ata4/unity/extract/StructDatabase.java
@@ -111,7 +111,7 @@
         }
         
         // don't include the struct when saving
-        fieldTree.setStandalone(false);
+        fieldTree.setStandalone(true);
     }
     
     public int learn(Asset asset) {
