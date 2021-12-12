diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressWithNearbyCommentFilter.java b/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressWithNearbyCommentFilter.java
index b6d4690..d8f380d 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressWithNearbyCommentFilter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressWithNearbyCommentFilter.java
@@ -322,7 +322,7 @@
      * @param format a <code>String</code> value.
      * @throws ConversionException if unable to create Pattern object.
      */
-    public void setCommentFormat(String format) {
+    public final void setCommentFormat(String format) {
         commentRegexp = Utils.createPattern(format);
     }
 
@@ -343,7 +343,7 @@
      * Set the format for a check.
      * @param format a <code>String</code> value
      */
-    public void setCheckFormat(String format) {
+    public final void setCheckFormat(String format) {
         checkFormat = format;
     }
 
@@ -359,7 +359,7 @@
      * Set the format for the influence of this check.
      * @param format a <code>String</code> value
      */
-    public void setInfluenceFormat(String format) {
+    public final void setInfluenceFormat(String format) {
         influenceFormat = format;
     }
 
