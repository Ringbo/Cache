diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/parsing/toplevel/CompilationUnit.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/parsing/toplevel/CompilationUnit.java
index df9053b..4455934 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/parsing/toplevel/CompilationUnit.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/parsing/toplevel/CompilationUnit.java
@@ -10,6 +10,6 @@
 
   @Deprecated
   public static void parseFile(PsiBuilder builder, GroovyParser parser) {
-    parser.parse(GroovyElementTypes.GROOVY_FILE, builder);
+    parser.parseLight(GroovyElementTypes.GROOVY_FILE, builder);
   }
 }
