diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/ForStatement.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/ForStatement.java
index f7f46ac..fd7ceb7 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/ForStatement.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/ForStatement.java
@@ -168,7 +168,7 @@
     PsiBuilder.Marker declMarker = builder.mark();
 
     if (ParserUtils.lookAhead(builder, mIDENT, kIN)) {
-      ParserUtils.eatElement(builder, VARIABLE);
+      ParserUtils.eatElement(builder, PARAMETER);
       declMarker.drop();
       ParserUtils.getToken(builder, kIN);
       if (WRONGWAY.equals(ShiftExpression.parse(builder))) {
