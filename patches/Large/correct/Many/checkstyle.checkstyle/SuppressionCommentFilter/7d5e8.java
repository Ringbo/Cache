diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressionCommentFilter.java b/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressionCommentFilter.java
index 47938ab..5772972 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressionCommentFilter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressionCommentFilter.java
@@ -67,7 +67,7 @@
      * whether the supression turns checkstyle reporting on or off.
      * @author Rick Giles
      */
-    public class Tag
+    public static class Tag
         implements Comparable<Tag>
     {
         /** The text of the tag. */
@@ -94,10 +94,11 @@
          * @param column the column number.
          * @param text the text of the suppression.
          * @param on <code>true</code> if the tag turns checkstyle reporting.
+         * @param filter the {@code SuppressionCommentFilter} with the context
          * @throws ConversionException if unable to parse expanded text.
          * on.
          */
-        public Tag(int line, int column, String text, boolean on)
+        public Tag(int line, int column, String text, boolean on, SuppressionCommentFilter filter)
             throws ConversionException
         {
             this.line = line;
@@ -105,31 +106,31 @@
             this.text = text;
             this.on = on;
 
-            tagCheckRegexp = checkRegexp;
+            tagCheckRegexp = filter.checkRegexp;
             //Expand regexp for check and message
             //Does not intern Patterns with Utils.getPattern()
             String format = "";
             try {
                 if (on) {
                     format =
-                        expandFromCoont(text, checkFormat, onRegexp);
+                        expandFromCoont(text, filter.checkFormat, filter.onRegexp);
                     tagCheckRegexp = Pattern.compile(format);
-                    if (messageFormat != null) {
+                    if (filter.messageFormat != null) {
                         format =
-                            expandFromCoont(text, messageFormat, onRegexp);
+                            expandFromCoont(text, filter.messageFormat, filter.onRegexp);
                         tagMessageRegexp = Pattern.compile(format);
                     }
                 }
                 else {
                     format =
-                        expandFromCoont(text, checkFormat, offRegexp);
+                        expandFromCoont(text, filter.checkFormat, filter.offRegexp);
                     tagCheckRegexp = Pattern.compile(format);
-                    if (messageFormat != null) {
+                    if (filter.messageFormat != null) {
                         format =
                             expandFromCoont(
                                 text,
-                                messageFormat,
-                                offRegexp);
+                                filter.messageFormat,
+                                filter.offRegexp);
                         tagMessageRegexp = Pattern.compile(format);
                     }
                 }
@@ -501,7 +502,7 @@
      */
     private void addTag(String text, int line, int column, boolean on)
     {
-        final Tag tag = new Tag(line, column, text, on);
+        final Tag tag = new Tag(line, column, text, on, this);
         tags.add(tag);
     }
 }
