diff --git a/app/src/processing/app/Editor.java b/app/src/processing/app/Editor.java
index 57785f1..0d197a5 100644
--- a/app/src/processing/app/Editor.java
+++ b/app/src/processing/app/Editor.java
@@ -2120,7 +2120,7 @@
     String pdeName = parentName + ".pde";
     File altPdeFile = new File(parent, pdeName);
     String inoName = parentName + ".ino";
-    File altInoFile = new File(parent, pdeName);
+    File altInoFile = new File(parent, inoName);
 
     if (pdeName.equals(fileName) || inoName.equals(fileName)) {
       // no beef with this guy
