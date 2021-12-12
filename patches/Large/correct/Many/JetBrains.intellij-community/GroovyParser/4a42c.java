diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/GroovyParser.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/GroovyParser.java
index 8545b8b..2a26e84 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/GroovyParser.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/GroovyParser.java
@@ -18,7 +18,7 @@
 
   @Deprecated
   public static void parseExpression(PsiBuilder builder) {
-    new GroovyParser().parse(GroovyElementTypes.EXPRESSION, builder);
+    new GroovyParser().parseLight(GroovyElementTypes.EXPRESSION, builder);
   }
 
   //gsp directives, scriptlets and such
