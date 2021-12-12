diff --git a/python/src/com/jetbrains/python/codeInsight/controlflow/PyControlFlowBuilder.java b/python/src/com/jetbrains/python/codeInsight/controlflow/PyControlFlowBuilder.java
index f8fce00..5cc592c 100644
--- a/python/src/com/jetbrains/python/codeInsight/controlflow/PyControlFlowBuilder.java
+++ b/python/src/com/jetbrains/python/codeInsight/controlflow/PyControlFlowBuilder.java
@@ -501,7 +501,7 @@
         continue;
       }
       // All instructions inside the try part have edges to except and finally parts
-      if (PsiTreeUtil.getParentOfType(e, PyTryPart.class, true) == tryPart) {
+      if (PsiTreeUtil.getParentOfType(e, PyTryPart.class, false) == tryPart) {
         for (Instruction inst : exceptInstructions) {
           myBuilder.addEdge(instruction, inst);
         }
@@ -512,12 +512,12 @@
       if (finallyPart != null) {
         // All instructions inside except parts have edges to the finally part
         for (PyExceptPart exceptPart : node.getExceptParts()) {
-          if (PsiTreeUtil.isAncestor(exceptPart, e, true)) {
+          if (PsiTreeUtil.isAncestor(exceptPart, e, false)) {
             myBuilder.addEdge(instruction, finallyFailInstruction);
           }
         }
         // All instructions inside the else part have edges to the finally part
-        if (PsiTreeUtil.isAncestor(elsePart, e, true)) {
+        if (PsiTreeUtil.isAncestor(elsePart, e, false)) {
           myBuilder.addEdge(instruction, finallyFailInstruction);
         }
       }
@@ -544,10 +544,10 @@
         }
       });
 
-      // Duplicate CFG for finally (-fail and -success) only if there are no except parts and there are some successfull exits from the
+      // Duplicate CFG for finally (-fail and -success) only if there are some successfull exits from the
       // try part. Otherwise a single CFG for finally provides the correct control flow
       final Instruction finallyInstruction;
-      if (node.getExceptParts().length == 0 && !normalExits.isEmpty()) {
+      if (!normalExits.isEmpty()) {
         // Finally-success part handling
         storeAndClearPending();
         myBuilder.flowAbrupted();
@@ -727,16 +727,7 @@
       return true;
     }
     return !PsiTreeUtil.instanceOf(instruction.getElement(),
-                                   PyReturnStatement.class,
-                                   PyBreakStatement.class,
-                                   PyContinueStatement.class,
-                                   PyAssignmentStatement.class,
-                                   PyRaiseStatement.class,
-                                   PyStatementList.class,
-                                   PyTryExceptStatement.class,
-                                   PyTryPart.class,
-                                   PyExceptPart.class,
-                                   PyFinallyPart.class);
+                                   PyStatementList.class);
   }
 }
 
