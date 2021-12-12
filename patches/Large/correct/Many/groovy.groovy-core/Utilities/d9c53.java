diff --git a/src/main/org/codehaus/groovy/tools/Utilities.java b/src/main/org/codehaus/groovy/tools/Utilities.java
index 2a361f5..925f8ad 100644
--- a/src/main/org/codehaus/groovy/tools/Utilities.java
+++ b/src/main/org/codehaus/groovy/tools/Utilities.java
@@ -38,7 +38,7 @@
 
     public static String repeatString( String pattern, int repeats )
     {
-        StringBuffer buffer = new StringBuffer( pattern.length() * repeats );
+        StringBuilder buffer = new StringBuilder( pattern.length() * repeats );
         for( int i = 0; i < repeats; i++ )
         {
             buffer.append( pattern );
