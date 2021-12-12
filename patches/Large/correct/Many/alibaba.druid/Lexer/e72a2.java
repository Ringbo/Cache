diff --git a/src/main/java/com/alibaba/druid/sql/parser/Lexer.java b/src/main/java/com/alibaba/druid/sql/parser/Lexer.java
index 12ccd10..e4aa41f 100644
--- a/src/main/java/com/alibaba/druid/sql/parser/Lexer.java
+++ b/src/main/java/com/alibaba/druid/sql/parser/Lexer.java
@@ -808,7 +808,7 @@
         token = Token.LITERAL_HEX;
     }
 
-    public String hexString() throws NumberFormatException {
+    public String hexString() {
         return new String(buf, np, sp);
     }
 
@@ -876,7 +876,7 @@
     }
 
     // QS_TODO negative number is invisible for lexer
-    public Number integerValue() throws NumberFormatException {
+    public Number integerValue() {
         long result = 0;
         boolean negative = false;
         int i = np, max = np + sp;
