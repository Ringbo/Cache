diff --git a/Dart/gen/com/jetbrains/lang/dart/DartParser.java b/Dart/gen/com/jetbrains/lang/dart/DartParser.java
index 45fb9be..e7fd517 100644
--- a/Dart/gen/com/jetbrains/lang/dart/DartParser.java
+++ b/Dart/gen/com/jetbrains/lang/dart/DartParser.java
@@ -751,7 +751,7 @@
   }
 
   /* ********************************************************** */
-  // 'assert' '(' expressionWithRecoverUntilParenOrComma (',' stringLiteralExpression)? ','? ')'
+  // 'assert' '(' expressionWithRecoverUntilParenOrComma (',' expressionWithRecoverUntilParenOrComma)? ','? ')'
   public static boolean assertStatement(PsiBuilder b, int l) {
     if (!recursion_guard_(b, l, "assertStatement")) return false;
     if (!nextTokenIs(b, ASSERT)) return false;
@@ -767,20 +767,20 @@
     return r || p;
   }
 
-  // (',' stringLiteralExpression)?
+  // (',' expressionWithRecoverUntilParenOrComma)?
   private static boolean assertStatement_3(PsiBuilder b, int l) {
     if (!recursion_guard_(b, l, "assertStatement_3")) return false;
     assertStatement_3_0(b, l + 1);
     return true;
   }
 
-  // ',' stringLiteralExpression
+  // ',' expressionWithRecoverUntilParenOrComma
   private static boolean assertStatement_3_0(PsiBuilder b, int l) {
     if (!recursion_guard_(b, l, "assertStatement_3_0")) return false;
     boolean r;
     Marker m = enter_section_(b);
     r = consumeToken(b, COMMA);
-    r = r && stringLiteralExpression(b, l + 1);
+    r = r && expressionWithRecoverUntilParenOrComma(b, l + 1);
     exit_section_(b, m, null, r);
     return r;
   }
