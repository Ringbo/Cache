diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/internal/CheckUtil.java b/src/test/java/com/puppycrawl/tools/checkstyle/internal/CheckUtil.java
index c8da4d7..6019a3e 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/internal/CheckUtil.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/internal/CheckUtil.java
@@ -250,7 +250,7 @@
             tokenText = "TokenTypes.";
         }
         else {
-            final StringBuilder result = new StringBuilder();
+            final StringBuilder result = new StringBuilder(50);
             boolean first = true;
 
             for (int token : tokens) {
@@ -300,7 +300,7 @@
     }
 
     public static String getJavadocTokenText(int[] tokens, int... subtractions) {
-        final StringBuilder result = new StringBuilder();
+        final StringBuilder result = new StringBuilder(50);
         boolean first = true;
 
         for (int token : tokens) {
