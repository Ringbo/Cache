diff --git a/src/com/google/javascript/jscomp/parsing/parser/Scanner.java b/src/com/google/javascript/jscomp/parsing/parser/Scanner.java
index b7501eb..bd68b85 100644
--- a/src/com/google/javascript/jscomp/parsing/parser/Scanner.java
+++ b/src/com/google/javascript/jscomp/parsing/parser/Scanner.java
@@ -210,11 +210,11 @@
     return true;
   }
 
-  private boolean isRegularExpressionFirstChar(char ch) {
+  private static boolean isRegularExpressionFirstChar(char ch) {
     return isRegularExpressionChar(ch) && ch != '*';
   }
 
-  private boolean isRegularExpressionChar(char ch) {
+  private static boolean isRegularExpressionChar(char ch) {
     switch (ch) {
     case '/':
       return false;
@@ -741,7 +741,7 @@
     return value;
   }
 
-  private boolean isIdentifierStart(char ch) {
+  private static boolean isIdentifierStart(char ch) {
     switch (ch) {
     case '$':
     case '_':
@@ -752,7 +752,7 @@
     }
   }
 
-  private boolean isIdentifierPart(char ch) {
+  private static boolean isIdentifierPart(char ch) {
     // TODO: identifier part character classes
     // CombiningMark
     //   Non-Spacing mark (Mn)
