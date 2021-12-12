diff --git a/inspections/impl/com/intellij/codeInspection/javaDoc/JavaDocLocalInspection.java b/inspections/impl/com/intellij/codeInspection/javaDoc/JavaDocLocalInspection.java
index 00973ff..3ece276 100644
--- a/inspections/impl/com/intellij/codeInspection/javaDoc/JavaDocLocalInspection.java
+++ b/inspections/impl/com/intellij/codeInspection/javaDoc/JavaDocLocalInspection.java
@@ -439,7 +439,7 @@
                                                                    final PsiTypeParameter psiTypeParameter,
                                                                    final InspectionManager manager) {
     String message = InspectionsBundle.message("inspection.javadoc.problem.missing.tag", "<code>@param</code>");
-    return createDescriptor(nameIdentifier, message, new AddMissingTagFix("param", "<" + psiTypeParameter.getText() + ">"), manager);
+    return createDescriptor(nameIdentifier, message, new AddMissingTagFix("param", "<" + psiTypeParameter.getName() + ">"), manager);
   }
 
   @Nullable
