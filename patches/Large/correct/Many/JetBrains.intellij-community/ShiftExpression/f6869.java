diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/expressions/arithmetic/ShiftExpression.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/expressions/arithmetic/ShiftExpression.java
index bc9e98f..f6802e1 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/expressions/arithmetic/ShiftExpression.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/expressions/arithmetic/ShiftExpression.java
@@ -49,7 +49,8 @@
         PsiBuilder.Marker newMarker = marker.precede();
         marker.done(SHIFT_EXPRESSION);
         result = SHIFT_EXPRESSION;
-        if (RANGES.contains(builder.getTokenType())) {
+        if (RANGES.contains(builder.getTokenType()) ||
+                getCompositeSign(builder)) {
           subParse(builder, newMarker);
         } else {
           newMarker.drop();
@@ -99,7 +100,8 @@
     }
     PsiBuilder.Marker newMarker = marker.precede();
     marker.done(SHIFT_EXPRESSION);
-    if (RANGES.contains(builder.getTokenType())) {
+    if (RANGES.contains(builder.getTokenType()) ||
+            getCompositeSign(builder)) {
       subParse(builder, newMarker);
     } else {
       newMarker.drop();
