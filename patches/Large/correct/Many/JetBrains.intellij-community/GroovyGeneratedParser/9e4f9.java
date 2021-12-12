diff --git a/plugins/groovy/groovy-psi/gen/org/jetbrains/plugins/groovy/lang/parser/GroovyGeneratedParser.java b/plugins/groovy/groovy-psi/gen/org/jetbrains/plugins/groovy/lang/parser/GroovyGeneratedParser.java
index 205ac4f..cf4053c 100644
--- a/plugins/groovy/groovy-psi/gen/org/jetbrains/plugins/groovy/lang/parser/GroovyGeneratedParser.java
+++ b/plugins/groovy/groovy-psi/gen/org/jetbrains/plugins/groovy/lang/parser/GroovyGeneratedParser.java
@@ -3504,7 +3504,7 @@
   // var
   public static boolean field(PsiBuilder b, int l) {
     if (!recursion_guard_(b, l, "field")) return false;
-    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
+    if (!nextTokenIs(b, IDENTIFIER)) return false;
     boolean r;
     Marker m = enter_section_(b);
     r = var(b, l + 1);
@@ -3516,7 +3516,7 @@
   // field (',' mb_nl field)*
   public static boolean field_declaration(PsiBuilder b, int l) {
     if (!recursion_guard_(b, l, "field_declaration")) return false;
-    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
+    if (!nextTokenIs(b, IDENTIFIER)) return false;
     boolean r;
     Marker m = enter_section_(b);
     r = field(b, l + 1);
@@ -3772,7 +3772,7 @@
   // variable_declaration_tail <<wrapLeft>>
   static boolean fvd_tail(PsiBuilder b, int l) {
     if (!recursion_guard_(b, l, "fvd_tail")) return false;
-    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
+    if (!nextTokenIs(b, IDENTIFIER)) return false;
     boolean r;
     Marker m = enter_section_(b);
     r = variable_declaration_tail(b, l + 1);
@@ -4861,7 +4861,7 @@
   // var
   public static boolean parameter(PsiBuilder b, int l) {
     if (!recursion_guard_(b, l, "parameter")) return false;
-    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
+    if (!nextTokenIs(b, IDENTIFIER)) return false;
     boolean r;
     Marker m = enter_section_(b);
     r = var(b, l + 1);
@@ -6927,10 +6927,10 @@
   // IDENTIFIER mb_initializer
   static boolean var(PsiBuilder b, int l) {
     if (!recursion_guard_(b, l, "var")) return false;
-    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
+    if (!nextTokenIs(b, IDENTIFIER)) return false;
     boolean r;
     Marker m = enter_section_(b);
-    r = consumeTokenFast(b, IDENTIFIER);
+    r = consumeToken(b, IDENTIFIER);
     r = r && mb_initializer(b, l + 1);
     exit_section_(b, m, null, r);
     return r;
@@ -6940,7 +6940,7 @@
   // var
   public static boolean variable(PsiBuilder b, int l) {
     if (!recursion_guard_(b, l, "variable")) return false;
-    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
+    if (!nextTokenIs(b, IDENTIFIER)) return false;
     boolean r;
     Marker m = enter_section_(b);
     r = var(b, l + 1);
@@ -6952,7 +6952,7 @@
   // variable (',' mb_nl variable)*
   public static boolean variable_declaration_tail(PsiBuilder b, int l) {
     if (!recursion_guard_(b, l, "variable_declaration_tail")) return false;
-    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
+    if (!nextTokenIs(b, IDENTIFIER)) return false;
     boolean r;
     Marker m = enter_section_(b);
     r = variable(b, l + 1);
