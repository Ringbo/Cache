diff --git a/util/src/com/intellij/openapi/util/text/StringUtil.java b/util/src/com/intellij/openapi/util/text/StringUtil.java
index 8c520da..8b17bf5 100644
--- a/util/src/com/intellij/openapi/util/text/StringUtil.java
+++ b/util/src/com/intellij/openapi/util/text/StringUtil.java
@@ -534,7 +534,7 @@
   @NotNull public static String capitalize(@NotNull String s) {
     if (s.length() == 0) return s;
     if (s.length() == 1) return s.toUpperCase();
-    if (s.length() > 1 && Character.isUpperCase(s.charAt(1))) return s;
+    if (s.length() > 1 && Character.isUpperCase(s.charAt(0))) return s;
     return Character.toUpperCase(s.charAt(0)) + s.substring(1);
   }
 
