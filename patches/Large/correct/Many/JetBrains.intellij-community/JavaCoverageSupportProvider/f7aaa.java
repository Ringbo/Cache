diff --git a/plugins/coverage/src/com/intellij/coverage/JavaCoverageSupportProvider.java b/plugins/coverage/src/com/intellij/coverage/JavaCoverageSupportProvider.java
index 1650aa6..c73d70f 100644
--- a/plugins/coverage/src/com/intellij/coverage/JavaCoverageSupportProvider.java
+++ b/plugins/coverage/src/com/intellij/coverage/JavaCoverageSupportProvider.java
@@ -294,7 +294,7 @@
       } else if (parent instanceof PsiAssertStatement) {
         condition = ((PsiAssertStatement)parent).getAssertCondition();
       }
-      if (condition != null) {
+      if (condition != null && PsiTreeUtil.isAncestor(condition, psiFile.findElementAt(offset), false)) {
         try {
           final ControlFlow controlFlow = ControlFlowFactory.getInstance(project).getControlFlow(
             parent, AllVariablesControlFlowPolicy.getInstance());
