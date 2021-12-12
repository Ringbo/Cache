diff --git a/graylog2-server/src/main/java/org/graylog2/rest/resources/tools/RegexTesterResource.java b/graylog2-server/src/main/java/org/graylog2/rest/resources/tools/RegexTesterResource.java
index 1b2aedf..eb1ba2d 100644
--- a/graylog2-server/src/main/java/org/graylog2/rest/resources/tools/RegexTesterResource.java
+++ b/graylog2-server/src/main/java/org/graylog2/rest/resources/tools/RegexTesterResource.java
@@ -44,7 +44,7 @@
 
         // Get the first matched group.
         final RegexTesterResponse.Match match;
-        if (matcher.groupCount() > 0) {
+        if (matched && matcher.groupCount() > 0) {
             match = RegexTesterResponse.Match.create(matcher.group(1), matcher.start(1), matcher.end(1));
         } else {
             match = null;
