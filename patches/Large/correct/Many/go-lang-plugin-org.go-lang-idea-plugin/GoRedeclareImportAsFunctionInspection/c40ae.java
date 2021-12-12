diff --git a/src/com/goide/inspections/GoRedeclareImportAsFunctionInspection.java b/src/com/goide/inspections/GoRedeclareImportAsFunctionInspection.java
index 7c99c35..655bc81 100644
--- a/src/com/goide/inspections/GoRedeclareImportAsFunctionInspection.java
+++ b/src/com/goide/inspections/GoRedeclareImportAsFunctionInspection.java
@@ -32,7 +32,9 @@
       @Override
       public void visitFunctionDeclaration(@NotNull GoFunctionDeclaration o) {
         String functionName = o.getName();
-        if (StringUtil.isNotEmpty(functionName) && o.getContainingFile().getImportMap().containsKey(functionName)) {
+        if (StringUtil.isNotEmpty(functionName) &&
+            !"_".equals(functionName) &&
+            o.getContainingFile().getImportMap().containsKey(functionName)) {
           holder.registerProblem(o.getIdentifier(), "import \"" + functionName + "\" redeclared in this block", new GoRenameQuickFix(o));
         }
       }
