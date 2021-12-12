diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmInvoker.java b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmInvoker.java
index 790d42d..02aef6b 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmInvoker.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmInvoker.java
@@ -210,7 +210,7 @@
 
         String url = URL;
         boolean customApi = false;
-        if (api == null) {
+        if (api != null) {
             customApi = true;
             url = url.replace("api", api);
         }
