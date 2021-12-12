diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressWithNearbyCommentFilter.java b/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressWithNearbyCommentFilter.java
index 70bdd86..dfcee3c 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressWithNearbyCommentFilter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressWithNearbyCommentFilter.java
@@ -333,7 +333,7 @@
                 }
                 format = CommonUtils.fillTemplateWithStringsByRegexp(
                         filter.influenceFormat, text, filter.commentRegexp);
-                int influence;
+                final int influence;
                 try {
                     if (CommonUtils.startsWithChar(format, '+')) {
                         format = format.substring(1);
