diff --git a/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/text/DefaultTextTemplateEngine.java b/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/text/DefaultTextTemplateEngine.java
index 697d24c..a2fc1c6 100644
--- a/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/text/DefaultTextTemplateEngine.java
+++ b/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/text/DefaultTextTemplateEngine.java
@@ -65,7 +65,7 @@
         if (template.startsWith("__")) {
             int endOfContentName = template.indexOf("__::", 3); //There must be a __<content_type__:: prefix so the minimum length before detecting '__::' is 3
             if (endOfContentName != -1) {
-                return XContentType.fromRestContentType(template.substring(2, endOfContentName));
+                return XContentType.fromMediaTypeOrFormat(template.substring(2, endOfContentName));
             }
         }
         return null;
