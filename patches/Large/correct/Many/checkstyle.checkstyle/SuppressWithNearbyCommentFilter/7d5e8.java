diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressWithNearbyCommentFilter.java b/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressWithNearbyCommentFilter.java
index b1020b0..1fe71ec 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressWithNearbyCommentFilter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressWithNearbyCommentFilter.java
@@ -79,7 +79,7 @@
     /**
      * A Tag holds a suppression comment and its location.
      */
-    public class Tag implements Comparable<Tag>
+    public static class Tag implements Comparable<Tag>
     {
         /** The text of the tag. */
         private final String text;
@@ -100,30 +100,31 @@
          * Constructs a tag.
          * @param text the text of the suppression.
          * @param line the line number.
+         * @param filter the {@code SuppressWithNearbyCommentFilter} with the context
          * @throws ConversionException if unable to parse expanded text.
          * on.
          */
-        public Tag(String text, int line)
+        public Tag(String text, int line, SuppressWithNearbyCommentFilter filter)
             throws ConversionException
         {
             this.text = text;
 
-            tagCheckRegexp = checkRegexp;
+            tagCheckRegexp = filter.checkRegexp;
             //Expand regexp for check and message
             //Does not intern Patterns with Utils.getPattern()
             String format = "";
             try {
-                format = expandFrocomment(text, checkFormat, commentRegexp);
+                format = expandFrocomment(text, filter.checkFormat, filter.commentRegexp);
                 tagCheckRegexp = Pattern.compile(format);
-                if (messageFormat != null) {
+                if (filter.messageFormat != null) {
                     format = expandFrocomment(
-                         text, messageFormat, commentRegexp);
+                         text, filter.messageFormat, filter.commentRegexp);
                     tagMessageRegexp = Pattern.compile(format);
                 }
                 int influence = 0;
-                if (influenceFormat != null) {
+                if (filter.influenceFormat != null) {
                     format = expandFrocomment(
-                        text, influenceFormat, commentRegexp);
+                        text, filter.influenceFormat, filter.commentRegexp);
                     try {
                         if (format.startsWith("+")) {
                             format = format.substring(1);
@@ -133,7 +134,7 @@
                     catch (final NumberFormatException e) {
                         throw new ConversionException(
                             "unable to parse influence from '" + text
-                                + "' using " + influenceFormat, e);
+                                + "' using " + filter.influenceFormat, e);
                     }
                 }
                 if (influence >= 0) {
@@ -482,7 +483,7 @@
      */
     private void addTag(String text, int line)
     {
-        final Tag tag = new Tag(text, line);
+        final Tag tag = new Tag(text, line, this);
         tags.add(tag);
     }
 }
