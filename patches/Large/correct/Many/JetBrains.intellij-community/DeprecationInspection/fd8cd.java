diff --git a/inspections/impl/com/intellij/codeInspection/deprecation/DeprecationInspection.java b/inspections/impl/com/intellij/codeInspection/deprecation/DeprecationInspection.java
index 11ec538..7a66fa6 100644
--- a/inspections/impl/com/intellij/codeInspection/deprecation/DeprecationInspection.java
+++ b/inspections/impl/com/intellij/codeInspection/deprecation/DeprecationInspection.java
@@ -63,7 +63,7 @@
         }
         final PsiResolveHelper resolveHelper = expression.getManager().getResolveHelper();
         final PsiMethod[] constructors = aClass.getConstructors();
-        if (constructors.length > 0) {
+        if (constructors.length > 0 && list != null) {
           JavaResolveResult[] results = resolveHelper.multiResolveConstructor((PsiClassType)type, list, list);
           MethodCandidateInfo result = null;
           if (results.length == 1) result = (MethodCandidateInfo)results[0];
