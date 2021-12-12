diff --git a/idea/src/org/jetbrains/jet/lang/parsing/JetParsing.java b/idea/src/org/jetbrains/jet/lang/parsing/JetParsing.java
index 850eb5d..69fab3e 100644
--- a/idea/src/org/jetbrains/jet/lang/parsing/JetParsing.java
+++ b/idea/src/org/jetbrains/jet/lang/parsing/JetParsing.java
@@ -494,7 +494,7 @@
 
     /*
      * enumEntry
-     *   : modifiers SimpleName typeParameters? valueParameters? (":" initializer{","})? classBody?
+     *   : modifiers SimpleName typeParameters? primaryConstructorParameters? (":" initializer{","})? classBody?
      *   ;
      */
     private void parseEnumEntry() {
@@ -505,7 +505,8 @@
         parseTypeParameterList(TokenSet.create(COLON, LPAR, SEMICOLON, LBRACE));
 
         if (at(LPAR)) {
-            parseValueParameterList(false, TokenSet.create(COLON, SEMICOLON, LBRACE));
+            parsePrimaryConstructorParameterList();
+//            parseValueParameterList(false, TokenSet.create(COLON, SEMICOLON, LBRACE));
         }
 
         if (at(COLON)) {
