diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/path/GrIndexPropertyImpl.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/path/GrIndexPropertyImpl.java
index 16b032c..6bc581f 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/path/GrIndexPropertyImpl.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/path/GrIndexPropertyImpl.java
@@ -281,7 +281,7 @@
   @NotNull
   @Override
   public GroovyResolveResult[] multiResolveSetter(boolean incomplete) {
-    return resolveImpl(incomplete, null, false);
+    return resolveImpl(incomplete, null, true);
   }
 
   @NotNull
