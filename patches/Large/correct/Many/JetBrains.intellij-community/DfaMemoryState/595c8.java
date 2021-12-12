diff --git a/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/DfaMemoryState.java b/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/DfaMemoryState.java
index e050f2e..33997bb 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/DfaMemoryState.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/DfaMemoryState.java
@@ -35,7 +35,7 @@
   DfaMemoryState createCopy();
 
   @NotNull
-  DfaMemoryStateImpl createClosureState();
+  DfaMemoryState createClosureState();
 
   DfaValue pop();
   DfaValue peek();
