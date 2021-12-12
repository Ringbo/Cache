diff --git a/src/main/java/org/yinwang/pysonar/RubyParser.java b/src/main/java/org/yinwang/pysonar/RubyParser.java
index 3a79f83..017630f 100644
--- a/src/main/java/org/yinwang/pysonar/RubyParser.java
+++ b/src/main/java/org/yinwang/pysonar/RubyParser.java
@@ -492,7 +492,7 @@
             return Op.Or;
         }
 
-        if (name.equals("not")) {
+        if (name.equals("not") || name.equals("!")) {
             return Op.Not;
         }
 
