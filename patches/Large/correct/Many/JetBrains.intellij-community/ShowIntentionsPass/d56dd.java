diff --git a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java
index 039df0b..5b02b46 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java
@@ -415,7 +415,7 @@
               super.registerProblem(problemDescriptor);
               if (problemDescriptor instanceof ProblemDescriptorBase) {
                 final TextRange range = ((ProblemDescriptorBase)problemDescriptor).getTextRange();
-                if (range != null && range.contains(offset)) {
+                if (range != null && range.containsOffset(offset)) {
                   final QuickFix[] fixes = problemDescriptor.getFixes();
                   if (fixes != null) {
                     for (int k = 0; k < fixes.length; k++) {
