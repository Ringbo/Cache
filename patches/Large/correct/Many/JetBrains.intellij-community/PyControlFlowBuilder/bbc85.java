diff --git a/python/src/com/jetbrains/python/codeInsight/controlflow/PyControlFlowBuilder.java b/python/src/com/jetbrains/python/codeInsight/controlflow/PyControlFlowBuilder.java
index ab4b195..c11d146 100644
--- a/python/src/com/jetbrains/python/codeInsight/controlflow/PyControlFlowBuilder.java
+++ b/python/src/com/jetbrains/python/codeInsight/controlflow/PyControlFlowBuilder.java
@@ -709,7 +709,8 @@
     myBuilder.processPending(new ControlFlowBuilder.PendingProcessor() {
       public void process(final PsiElement pendingScope, final Instruction instruction) {
         final PsiElement element = instruction.getElement();
-        if (PsiTreeUtil.getParentOfType(element, PyRaiseStatement.class) != null) {
+        if (element != null && PsiTreeUtil.isAncestor(node, element, true) &&
+            PsiTreeUtil.getParentOfType(element, PyRaiseStatement.class) != null) {
           myBuilder.addPendingEdge(node, instruction);
         }
         else {
