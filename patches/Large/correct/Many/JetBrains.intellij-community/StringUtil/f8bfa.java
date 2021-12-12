diff --git a/platform/util/src/com/intellij/openapi/util/text/StringUtil.java b/platform/util/src/com/intellij/openapi/util/text/StringUtil.java
index 1a75e07..0be8b3c 100644
--- a/platform/util/src/com/intellij/openapi/util/text/StringUtil.java
+++ b/platform/util/src/com/intellij/openapi/util/text/StringUtil.java
@@ -905,10 +905,10 @@
   @Nullable
   public static String nullize(@Nullable final String s, boolean nullizeSpaces) {
     if (nullizeSpaces) {
-      if (isEmpty(s)) return null;
+      if (isEmptyOrSpaces(s)) return null;
     }
     else {
-      if (isEmptyOrSpaces(s)) return null;
+      if (isEmpty(s)) return null;
     }
     return s;
   }
