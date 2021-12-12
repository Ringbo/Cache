diff --git a/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/DataFlowRunner.java b/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/DataFlowRunner.java
index 44a4b62..bb0db45 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/DataFlowRunner.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/DataFlowRunner.java
@@ -188,7 +188,10 @@
           }
 
           DfaInstructionState[] after = acceptInstruction(visitor, instructionState);
-          if (LOG.isDebugEnabled() && instruction instanceof ControlTransferInstruction && after.length == 0) {
+          if (LOG.isDebugEnabled() &&
+              !(psiBlock instanceof PsiCodeFragment) &&
+              instruction instanceof ControlTransferInstruction &&
+              after.length == 0) {
             DfaMemoryState memoryState = instructionState.getMemoryState();
             if (!memoryState.isEmptyStack() && !(memoryState.peek() instanceof DfaControlTransferValue)) {
               LOG.error("Stack is corrupted at "+instructionState);
