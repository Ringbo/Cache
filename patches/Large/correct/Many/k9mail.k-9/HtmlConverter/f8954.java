diff --git a/src/com/fsck/k9/helper/HtmlConverter.java b/src/com/fsck/k9/helper/HtmlConverter.java
index 3ca4858..f1b88b4 100644
--- a/src/com/fsck/k9/helper/HtmlConverter.java
+++ b/src/com/fsck/k9/helper/HtmlConverter.java
@@ -397,7 +397,7 @@
         Matcher m = Regex.WEB_URL_PATTERN.matcher(prepared);
         while (m.find()) {
             int start = m.start();
-            if (start == 0 || (start != 0 && text.charAt(start - 1) != '@')) {
+            if (start == 0 || (start != 0 && prepared.charAt(start - 1) != '@')) {
                 if (m.group().indexOf(':') > 0) { // With no URI-schema we may get "http:/" links with the second / missing
                     m.appendReplacement(outputBuffer, "<a href=\"$0\">$0</a>");
                 } else {
