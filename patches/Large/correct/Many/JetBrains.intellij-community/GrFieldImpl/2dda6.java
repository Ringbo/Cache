diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/GrFieldImpl.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/GrFieldImpl.java
index 6e7ecdb..dd7cfee 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/GrFieldImpl.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/GrFieldImpl.java
@@ -98,7 +98,7 @@
 
   @Override
   public PsiType getTypeGroovy() {
-    if (getDeclaredType() == null && getInitializer() == null) {
+    if (getDeclaredType() == null && getInitializerGroovy() == null) {
       final PsiType type = GrVariableEnhancer.getEnhancedType(this);
       if (type != null) {
         return type;
