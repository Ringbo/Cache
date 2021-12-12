diff --git a/plugins/groovy/groovy-psi/gen/org/jetbrains/plugins/groovy/lang/parser/GroovyGeneratedParser.java b/plugins/groovy/groovy-psi/gen/org/jetbrains/plugins/groovy/lang/parser/GroovyGeneratedParser.java
index cede377..4fe123a 100644
--- a/plugins/groovy/groovy-psi/gen/org/jetbrains/plugins/groovy/lang/parser/GroovyGeneratedParser.java
+++ b/plugins/groovy/groovy-psi/gen/org/jetbrains/plugins/groovy/lang/parser/GroovyGeneratedParser.java
@@ -5056,7 +5056,7 @@
   }
 
   /* ********************************************************** */
-  // '(' paren_argument_list_inner ')'
+  // '(' <<notApplicationArguments paren_argument_list_inner>> ')'
   static boolean non_empty_argument_list(PsiBuilder b, int l) {
     if (!recursion_guard_(b, l, "non_empty_argument_list")) return false;
     if (!nextTokenIsFast(b, T_LPAREN)) return false;
@@ -5064,7 +5064,7 @@
     Marker m = enter_section_(b, l, _NONE_);
     r = consumeTokenFast(b, T_LPAREN);
     p = r; // pin = 1
-    r = r && report_error_(b, paren_argument_list_inner(b, l + 1));
+    r = r && report_error_(b, notApplicationArguments(b, l + 1, GroovyGeneratedParser::paren_argument_list_inner));
     r = p && consumeToken(b, T_RPAREN) && r;
     exit_section_(b, l, m, r, p, null);
     return r || p;
