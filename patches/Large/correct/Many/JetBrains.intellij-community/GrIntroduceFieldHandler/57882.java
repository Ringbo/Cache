diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/introduce/field/GrIntroduceFieldHandler.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/introduce/field/GrIntroduceFieldHandler.java
index 0211ee3..dad877d 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/introduce/field/GrIntroduceFieldHandler.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/introduce/field/GrIntroduceFieldHandler.java
@@ -140,17 +140,16 @@
     EnumSet<GrIntroduceFieldSettings.Init> result = EnumSet.of(GrIntroduceFieldSettings.Init.FIELD_DECLARATION,
                                                                GrIntroduceFieldSettings.Init.CONSTRUCTOR);
 
-
-    GrTypeDefinition clazz = (GrTypeDefinition)context.getScope();
+    PsiElement scope = context.getScope();
 
     if (replaceAll) {
-      PsiElement anchor = GrIntroduceHandlerBase.findAnchor(context.getOccurrences(), clazz);
+      PsiElement anchor = GrIntroduceHandlerBase.findAnchor(context.getOccurrences(), scope);
       if (anchor != null) {
         result.add(GrIntroduceFieldSettings.Init.CUR_METHOD);
       }
     }
 
-    if (TestFrameworks.getInstance().isTestClass(clazz)) {
+    if (scope instanceof GrTypeDefinition && TestFrameworks.getInstance().isTestClass((PsiClass)scope)) {
       result.add(GrIntroduceFieldSettings.Init.SETUP_METHOD);
     }
 
