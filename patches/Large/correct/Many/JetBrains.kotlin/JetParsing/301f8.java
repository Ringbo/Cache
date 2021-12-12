diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/parsing/JetParsing.java b/compiler/frontend/src/org/jetbrains/jet/lang/parsing/JetParsing.java
index 9ab7133..57471dc 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/parsing/JetParsing.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/parsing/JetParsing.java
@@ -167,7 +167,7 @@
         }
 
         PsiBuilder.Marker reference = mark();
-        expect(IDENTIFIER, "Expecting qualified name", TokenSet.create(DOT, AS_KEYWORD));
+        expect(IDENTIFIER, "Expecting qualified name");
         reference.done(REFERENCE_EXPRESSION);
         while (at(DOT) && lookahead(1) != MUL) {
             advance(); // DOT
