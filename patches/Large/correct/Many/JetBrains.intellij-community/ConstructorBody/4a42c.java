diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/constructor/ConstructorBody.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/constructor/ConstructorBody.java
index 400284e..64cf03b 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/constructor/ConstructorBody.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/constructor/ConstructorBody.java
@@ -10,6 +10,6 @@
 
   @Deprecated
   public static void parseConstructorBodyDeep(PsiBuilder builder, GroovyParser parser) {
-    parser.parse(GroovyElementTypes.CONSTRUCTOR_BLOCK, builder);
+    parser.parseLight(GroovyElementTypes.CONSTRUCTOR_BLOCK, builder);
   }
 }
