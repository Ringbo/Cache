diff --git a/util/src/com/intellij/psi/codeStyle/NameUtil.java b/util/src/com/intellij/psi/codeStyle/NameUtil.java
index 600fea0..2da4371 100644
--- a/util/src/com/intellij/psi/codeStyle/NameUtil.java
+++ b/util/src/com/intellij/psi/codeStyle/NameUtil.java
@@ -378,7 +378,7 @@
       }
 
       if (myEnsureFirstSymbolsMatch) {
-        if (patternLen == 0) return false;
+        if (patternLen == 0 || nameIndex >= nameLen) return false;
         if (StringUtil.toLowerCase(name.charAt(nameIndex)) != pattern.charAt(0)) return false;
 
         nameIndex++;
