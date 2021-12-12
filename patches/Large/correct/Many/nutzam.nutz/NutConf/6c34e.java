diff --git a/src/org/nutz/conf/NutConf.java b/src/org/nutz/conf/NutConf.java
index e00a6be..746fb1c 100644
--- a/src/org/nutz/conf/NutConf.java
+++ b/src/org/nutz/conf/NutConf.java
@@ -74,12 +74,12 @@
     private void loadResource(String... paths) {
         for (String path : paths) {
             List<NutResource> resources;
-            if (path.endsWith(".js")) {
+            if (path.endsWith(".js") || path.endsWith(".json")) {
                 File f = Files.findFile(path);
                 resources = new ArrayList<NutResource>();
                 resources.add(new FileResource(f));
             } else {
-                resources = Scans.me().scan(path, "\\.js$");
+                resources = Scans.me().scan(path, "\\.(js|json)$");
             }
 
             for (NutResource nr : resources) {
