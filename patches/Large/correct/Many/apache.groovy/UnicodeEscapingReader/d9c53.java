diff --git a/src/main/org/codehaus/groovy/antlr/UnicodeEscapingReader.java b/src/main/org/codehaus/groovy/antlr/UnicodeEscapingReader.java
index 3915745..f10eadd 100644
--- a/src/main/org/codehaus/groovy/antlr/UnicodeEscapingReader.java
+++ b/src/main/org/codehaus/groovy/antlr/UnicodeEscapingReader.java
@@ -129,7 +129,7 @@
 
         // Get first hex digit
         checkHexDigit(c);
-        StringBuffer charNum = new StringBuffer();
+        StringBuilder charNum = new StringBuilder();
         charNum.append((char) c);
 
         // Must now be three more hex digits
