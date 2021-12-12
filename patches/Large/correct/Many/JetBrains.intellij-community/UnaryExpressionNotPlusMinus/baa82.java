diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/expressions/arithmetic/UnaryExpressionNotPlusMinus.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/expressions/arithmetic/UnaryExpressionNotPlusMinus.java
index cdfe1a7..feeb454 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/expressions/arithmetic/UnaryExpressionNotPlusMinus.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/expressions/arithmetic/UnaryExpressionNotPlusMinus.java
@@ -61,7 +61,7 @@
     }
     if (TokenSets.BUILT_IN_TYPE.contains(builder.getTokenType()) ||
             mIDENT.equals(builder.getTokenType())) {
-      if (TypeSpec.parseStrict(builder).equals(WRONGWAY)) {
+      if (TypeSpec.parse(builder, false).equals(WRONGWAY)) {
         marker.rollbackTo();
         return WRONGWAY;
       }
