diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/util/xcontent/XContentType.java b/modules/elasticsearch/src/main/java/org/elasticsearch/util/xcontent/XContentType.java
index 914bf58..c52fd91 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/util/xcontent/XContentType.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/util/xcontent/XContentType.java
@@ -39,11 +39,11 @@
         if (contentType == null) {
             return null;
         }
-        if ("application/json".equals(contentType)) {
+        if ("application/json".equals(contentType) || "json".equalsIgnoreCase(contentType)) {
             return JSON;
         }
 
-        if ("application/xson".equals(contentType)) {
+        if ("application/xson".equals(contentType) || "xson".equalsIgnoreCase(contentType)) {
             return XSON;
         }
 
