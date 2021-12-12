diff --git a/source/com/intellij/codeInspection/dataFlow/instructions/MethodCallInstruction.java b/source/com/intellij/codeInspection/dataFlow/instructions/MethodCallInstruction.java
index 6769ae7..b2763b1 100644
--- a/source/com/intellij/codeInspection/dataFlow/instructions/MethodCallInstruction.java
+++ b/source/com/intellij/codeInspection/dataFlow/instructions/MethodCallInstruction.java
@@ -64,7 +64,7 @@
     for (int i = 0; i < myArgs.length; i++) {
       final DfaValue arg = memState.pop();
       final int revIdx = myArgs.length - i - 1;
-      if (i < myParametersNotNull.length && myParametersNotNull[revIdx] && !memState.applyNotNull(arg)) {
+      if (revIdx < myParametersNotNull.length && myParametersNotNull[revIdx] && !memState.applyNotNull(arg)) {
         runner.onPassingNullParameter(myArgs[revIdx]); // Parameters on stack are reverted.
         return new DfaInstructionState[0];
       }
