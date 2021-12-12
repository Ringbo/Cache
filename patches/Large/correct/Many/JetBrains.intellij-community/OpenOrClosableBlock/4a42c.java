diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/blocks/OpenOrClosableBlock.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/blocks/OpenOrClosableBlock.java
index 5215eb4..57d3066 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/blocks/OpenOrClosableBlock.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/blocks/OpenOrClosableBlock.java
@@ -10,11 +10,11 @@
 
   @Deprecated
   public static void parseOpenBlockDeep(PsiBuilder builder, GroovyParser parser) {
-    parser.parse(GroovyElementTypes.OPEN_BLOCK, builder);
+    parser.parseLight(GroovyElementTypes.OPEN_BLOCK, builder);
   }
 
   @Deprecated
   public static void parseClosableBlockDeep(PsiBuilder builder, GroovyParser parser) {
-    parser.parse(GroovyElementTypes.CLOSURE, builder);
+    parser.parseLight(GroovyElementTypes.CLOSURE, builder);
   }
 }
