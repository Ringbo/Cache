diff --git a/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/instructions/MethodCallInstruction.java b/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/instructions/MethodCallInstruction.java
index 5134489..3f0c374 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/instructions/MethodCallInstruction.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/instructions/MethodCallInstruction.java
@@ -177,7 +177,7 @@
 
     int argCount = args.length;
     int paramCount = parameters.length;
-    if (argCount > paramCount) {
+    if (argCount > paramCount || argCount == paramCount - 1) {
       return true;
     }
 
