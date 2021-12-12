diff --git a/java/java-impl/src/com/intellij/codeInsight/daemon/impl/quickfix/AddExceptionToCatchFix.java b/java/java-impl/src/com/intellij/codeInsight/daemon/impl/quickfix/AddExceptionToCatchFix.java
index f6ea6df..bb47fe18 100644
--- a/java/java-impl/src/com/intellij/codeInsight/daemon/impl/quickfix/AddExceptionToCatchFix.java
+++ b/java/java-impl/src/com/intellij/codeInsight/daemon/impl/quickfix/AddExceptionToCatchFix.java
@@ -121,7 +121,7 @@
     String name = new VariableNameGenerator(tryStatement, VariableKind.PARAMETER).byType(exceptionType)
       .byName("e", "ex", "exception").generate(false);
 
-    PsiCatchSection catchSection = factory.createCatchSection(exceptionType, name, file);
+    PsiCatchSection catchSection = factory.createCatchSection(exceptionType, name, tryStatement);
 
     PsiCodeBlock finallyBlock = tryStatement.getFinallyBlock();
     if (finallyBlock == null) {
