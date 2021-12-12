diff --git a/h2o-core/src/main/java/hex/ConfusionMatrix.java b/h2o-core/src/main/java/hex/ConfusionMatrix.java
index 603c349..d0c7c65 100644
--- a/h2o-core/src/main/java/hex/ConfusionMatrix.java
+++ b/h2o-core/src/main/java/hex/ConfusionMatrix.java
@@ -291,9 +291,7 @@
     colType[colFormat.length-1]   = "string";
     colFormat[colFormat.length-1] = "= %s";
 
-    TwoDimTable table = new TwoDimTable(
-            "Confusion Matrix (Act/Pred)", rowHeader, colHeader, colType, colFormat,
-            new String[rowHeader.length][], new double[rowHeader.length][]);
+    TwoDimTable table = new TwoDimTable("Confusion Matrix (Act/Pred)", rowHeader, colHeader, colType, colFormat);
 
     // Main CM Body
     long terr = 0;
