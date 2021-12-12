diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmInvoker.java b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmInvoker.java
index 644c9dc..c1d10a6 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmInvoker.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmInvoker.java
@@ -188,7 +188,7 @@
         String url = URL;
         if (method.startsWith("/"))
             url = url.replaceAll("/api/", "");
-        StringBuilder requestBuilder = new StringBuilder(URL).append(method).append('?');
+        StringBuilder requestBuilder = new StringBuilder(url).append(method).append('?');
         StringBuilder sigBuilder = new StringBuilder();
         for(Pair<String, Object> entry : params) {
             if(entry.getRight() == null)
