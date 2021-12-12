diff --git a/src/main/java/com/alibaba/fastjson/parser/JSONLexerBase.java b/src/main/java/com/alibaba/fastjson/parser/JSONLexerBase.java
index b27e6e0..f900ce2 100755
--- a/src/main/java/com/alibaba/fastjson/parser/JSONLexerBase.java
+++ b/src/main/java/com/alibaba/fastjson/parser/JSONLexerBase.java
@@ -2447,7 +2447,7 @@
                 }
             }
 
-            int power = 1;
+            long power = 1;
             boolean small = (chLocal == '.');
             if (small) {
                 chLocal = charAt(bp + (offset++));
@@ -2500,7 +2500,7 @@
                 count = bp + offset - start - 1;
             }
 
-            if ((!exp) && count < 12) {
+            if ((!exp) && count < 17) {
                 value = (float) (((double) intVal) / power);
                 if (negative) {
                     value = -value;
