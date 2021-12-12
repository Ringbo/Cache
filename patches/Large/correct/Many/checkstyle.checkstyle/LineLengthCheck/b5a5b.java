diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/sizes/LineLengthCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/sizes/LineLengthCheck.java
index 50ebbef..4649414 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/sizes/LineLengthCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/sizes/LineLengthCheck.java
@@ -129,7 +129,7 @@
      * Set the ignore pattern.
      * @param format a <code>String</code> value
      */
-    public void setIgnorePattern(String format) {
+    public final void setIgnorePattern(String format) {
         ignorePattern = Utils.createPattern(format);
     }
 }
