diff --git a/tool/src/org/antlr/v4/Tool.java b/tool/src/org/antlr/v4/Tool.java
index 42ace2e..1a39dd3 100644
--- a/tool/src/org/antlr/v4/Tool.java
+++ b/tool/src/org/antlr/v4/Tool.java
@@ -246,7 +246,7 @@
 			haveOutputDir = true;
 			if (outDir.exists() && !outDir.isDirectory()) {
 				errMgr.toolError(ErrorType.OUTPUT_DIR_IS_FILE, outputDirectory);
-				libDirectory = ".";
+				outputDirectory = ".";
 			}
 		}
 		else {
