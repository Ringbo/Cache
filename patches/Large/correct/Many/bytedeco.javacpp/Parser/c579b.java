diff --git a/src/main/java/org/bytedeco/javacpp/tools/Parser.java b/src/main/java/org/bytedeco/javacpp/tools/Parser.java
index 9549a1d..0600a13 100644
--- a/src/main/java/org/bytedeco/javacpp/tools/Parser.java
+++ b/src/main/java/org/bytedeco/javacpp/tools/Parser.java
@@ -1977,7 +1977,7 @@
             dcl.type.annotations += attr.javaName;
         }
 
-        if (cppName == null || javaName == null || !tokens.get().match('(', '[', '=', ',', ':', ';')) {
+        if (cppName == null || javaName == null || !tokens.get().match('(', '[', '=', ',', ':', ';', '{')) {
             tokens.index = backIndex;
             return false;
         } else if (!dcl.type.staticMember && context.javaName != null) {
