diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/declaration/Declaration.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/declaration/Declaration.java
index a81a17c..070c405 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/declaration/Declaration.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/declaration/Declaration.java
@@ -47,7 +47,7 @@
 
       PsiBuilder.Marker checkMarker = builder.mark(); //point to begin of type or variable
 
-      if (WRONGWAY.equals(TypeSpec.parse(builder, true))) { //if type wasn't recognized trying poarse VaribleDeclaration
+      if (WRONGWAY.equals(TypeSpec.parse(builder, false))) { //if type wasn't recognized trying parse VaribleDeclaration
         checkMarker.rollbackTo();
 
         GroovyElementType varDecl = VariableDefinitions.parse(builder);
