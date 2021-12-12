diff --git a/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/CommonDataflow.java b/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/CommonDataflow.java
index d5827b5..0b2513a 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/CommonDataflow.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/CommonDataflow.java
@@ -60,7 +60,7 @@
       public DfaInstructionState[] visitPush(PushInstruction instruction, DataFlowRunner runner, DfaMemoryState memState) {
         DfaInstructionState[] states = super.visitPush(instruction, runner, memState);
         PsiExpression place = instruction.getPlace();
-        if (place != null) {
+        if (place != null && !instruction.isReferenceWrite()) {
           for (DfaInstructionState state : states) {
             dfr.add(place, (DfaMemoryStateImpl)state.getMemoryState());
           }
