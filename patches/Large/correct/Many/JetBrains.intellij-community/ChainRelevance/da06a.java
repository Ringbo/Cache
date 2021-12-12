diff --git a/java/compiler/impl/src/com/intellij/compiler/classFilesIndex/chainsSearch/ChainRelevance.java b/java/compiler/impl/src/com/intellij/compiler/classFilesIndex/chainsSearch/ChainRelevance.java
index 9b8d3dc..db501a7 100644
--- a/java/compiler/impl/src/com/intellij/compiler/classFilesIndex/chainsSearch/ChainRelevance.java
+++ b/java/compiler/impl/src/com/intellij/compiler/classFilesIndex/chainsSearch/ChainRelevance.java
@@ -85,7 +85,7 @@
     if (myParametersInContext > that.myParametersInContext) {
       return 1;
     }
-    if (myParametersInContext <= that.myParametersInContext) {
+    if (myParametersInContext < that.myParametersInContext) {
       return -1;
     }
     int sub = myLastMethodOccurrences - that.myLastMethodOccurrences;
