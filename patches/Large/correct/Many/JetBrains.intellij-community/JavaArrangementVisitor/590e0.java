diff --git a/java/java-impl/src/com/intellij/psi/codeStyle/arrangement/JavaArrangementVisitor.java b/java/java-impl/src/com/intellij/psi/codeStyle/arrangement/JavaArrangementVisitor.java
index d4e9c79..0fbe339 100644
--- a/java/java-impl/src/com/intellij/psi/codeStyle/arrangement/JavaArrangementVisitor.java
+++ b/java/java-impl/src/com/intellij/psi/codeStyle/arrangement/JavaArrangementVisitor.java
@@ -172,7 +172,7 @@
       @Override
       public void run() {
         PsiExpressionList list = aClass.getArgumentList();
-        if (list != null) {
+        if (list != null && list.getTextLength() > 0) {
           JavaElementArrangementEntry listEntry = createNewEntry(list, list.getTextRange(), ANON_CLASS_PARAMETER_LIST, aClass.getName(), true);
           processEntry(listEntry, null, list);
         }
