diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/TypesUtil.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/TypesUtil.java
index 5689142..6e66238 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/TypesUtil.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/TypesUtil.java
@@ -612,15 +612,15 @@
   }
 
   @NotNull
-  public static PsiType getLeastUpperBound(PsiClass[] classes, PsiManager manager) {
+  public static PsiType getLeastUpperBound(PsiType[] classes, PsiManager manager) {
     PsiElementFactory factory = JavaPsiFacade.getElementFactory(manager.getProject());
 
     if (classes.length == 0) return factory.createTypeByFQClassName(CommonClassNames.JAVA_LANG_OBJECT);
 
-    PsiType type = factory.createType(classes[0]);
+    PsiType type = classes[0];
 
     for (int i = 1; i < classes.length; i++) {
-      PsiType t = getLeastUpperBound(type, factory.createType(classes[i]), manager);
+      PsiType t = getLeastUpperBound(type, classes[i], manager);
       if (t != null) {
         type = t;
       }
