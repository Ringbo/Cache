diff --git a/graylog2-server/src/main/java/org/graylog2/rest/resources/search/SearchResource.java b/graylog2-server/src/main/java/org/graylog2/rest/resources/search/SearchResource.java
index f4c87b8..2aa7ec7 100644
--- a/graylog2-server/src/main/java/org/graylog2/rest/resources/search/SearchResource.java
+++ b/graylog2-server/src/main/java/org/graylog2/rest/resources/search/SearchResource.java
@@ -122,10 +122,10 @@
             throw new BadRequestException("Missing required parameter `fields`");
         }
         final Iterable<String> split = Splitter.on(',').omitEmptyStrings().trimResults().split(fields);
-        final ArrayList<String> fieldList = Lists.newArrayList("timestamp", "source");
-        // skip the mandatory fields timestamp and source
+        final ArrayList<String> fieldList = Lists.newArrayList("timestamp");
+        // skip the mandatory field timestamp
         for (String field : split) {
-            if ("timestamp".equals(field) || "source".equals(field)) {
+            if ("timestamp".equals(field)) {
                 continue;
             }
             fieldList.add(field);
