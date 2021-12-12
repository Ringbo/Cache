diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/parsing/JetExpressionParsing.java b/compiler/frontend/src/org/jetbrains/jet/lang/parsing/JetExpressionParsing.java
index 611d0a8..2f953fc 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/parsing/JetExpressionParsing.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/parsing/JetExpressionParsing.java
@@ -1134,7 +1134,21 @@
         // it to function params if possible.
         boolean preferParamsToExpressions = false;
 
-        int lastDot = matchTokenStreamPredicate(new LastBefore(new At(DOT), new AtSet(ARROW, RPAR)));
+        // Last dot before ARROW and RPAR, but also stop at top-level keywords and '{', '}'
+        int lastDot = matchTokenStreamPredicate(new LastBefore(
+                new At(DOT),
+                new AtSet(TokenSet.orSet(
+                        TokenSet.create(ARROW, RPAR),
+                        TokenSet.orSet(
+                                TokenSet.create(LBRACE, RBRACE),
+                                TokenSet.andNot(
+                                        KEYWORDS,
+                                        TokenSet.create(CAPITALIZED_THIS_KEYWORD)
+                                )
+                        )
+                ))
+        ));
+
         if (lastDot >= 0) {
             createTruncatedBuilder(lastDot).parseTypeRef();
             if (at(DOT)) {
@@ -1187,7 +1201,7 @@
                 if (at(COMMA)) errorAndAdvance("Expecting a parameter declaration");
 
                 PsiBuilder.Marker parameter = mark();
-                int parameterNamePos = matchTokenStreamPredicate(new LastBefore(new At(IDENTIFIER), new AtSet(COMMA, RPAR, COLON, ARROW)));
+                int parameterNamePos = matchTokenStreamPredicate(new LastBefore(new At(IDENTIFIER), new AtSet(COMMA, RPAR, COLON, ARROW, RBRACE, LBRACE)));
                 createTruncatedBuilder(parameterNamePos).parseModifierList(MODIFIER_LIST, REGULAR_ANNOTATIONS_ONLY_WITH_BRACKETS);
 
                 expect(IDENTIFIER, "Expecting parameter declaration");
