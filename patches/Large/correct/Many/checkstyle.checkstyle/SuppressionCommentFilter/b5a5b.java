diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressionCommentFilter.java b/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressionCommentFilter.java
index 55d0ea0..4d4cc93 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressionCommentFilter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressionCommentFilter.java
@@ -315,7 +315,7 @@
      * @param format a <code>String</code> value.
      * @throws ConversionException if unable to create Pattern object.
      */
-    public void setOffCommentFormat(String format) {
+    public final void setOffCommentFormat(String format) {
         offRegexp = Utils.createPattern(format);
     }
 
@@ -324,7 +324,7 @@
      * @param format a <code>String</code> value
      * @throws ConversionException if unable to create Pattern object.
      */
-    public void setOnCommentFormat(String format) {
+    public final void setOnCommentFormat(String format) {
         onRegexp = Utils.createPattern(format);
     }
 
@@ -345,7 +345,7 @@
      * Set the format for a check.
      * @param format a <code>String</code> value
      */
-    public void setCheckFormat(String format) {
+    public final void setCheckFormat(String format) {
         checkFormat = format;
     }
 
