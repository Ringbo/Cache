diff --git a/util/src/com/intellij/openapi/util/text/StringUtil.java b/util/src/com/intellij/openapi/util/text/StringUtil.java
index 1093c1b..406e08a 100644
--- a/util/src/com/intellij/openapi/util/text/StringUtil.java
+++ b/util/src/com/intellij/openapi/util/text/StringUtil.java
@@ -461,7 +461,7 @@
   @NotNull public static String unquoteString( @NotNull String s )
   {
     if( s.length() > 1 && s.charAt( 0 ) == '"' && s.charAt( s.length() - 1) == '"' )
-      return s.substring( 1, s.length() - 2 );
+      return s.substring( 1, s.length() - 1 );
     else
     return s;
   }
