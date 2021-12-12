diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/toplevel/imports/GrImportStatementImpl.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/toplevel/imports/GrImportStatementImpl.java
index 2ad1f71..8592ce9 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/toplevel/imports/GrImportStatementImpl.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/toplevel/imports/GrImportStatementImpl.java
@@ -173,8 +173,8 @@
       }
 
       PsiMethod method = (PsiMethod)member;
-      if ((propByGetter == null || importedName.equals(propByGetter)) && GroovyPropertyUtils.isSimplePropertyGetter(method, refName) ||
-          (propBySetter == null || importedName.equals(propBySetter)) && GroovyPropertyUtils.isSimplePropertySetter(method, refName)) {
+      if ((nameHint == null || importedName.equals(propByGetter)) && GroovyPropertyUtils.isSimplePropertyGetter(method, refName) ||
+          (nameHint == null || importedName.equals(propBySetter)) && GroovyPropertyUtils.isSimplePropertySetter(method, refName)) {
         if (method.hasModifierProperty(PsiModifier.STATIC) && !processor.execute(method, state)) {
           return false;
         }
