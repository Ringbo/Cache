diff --git a/modules/cpr/src/main/java/org/atmosphere/util/DefaultEndpointMapper.java b/modules/cpr/src/main/java/org/atmosphere/util/DefaultEndpointMapper.java
index 310e1df..664f6cf 100644
--- a/modules/cpr/src/main/java/org/atmosphere/util/DefaultEndpointMapper.java
+++ b/modules/cpr/src/main/java/org/atmosphere/util/DefaultEndpointMapper.java
@@ -88,7 +88,7 @@
 
                 // (4) try without a path
                 if (handler == null) {
-                    String p = path.lastIndexOf("/") == 0 ? "/" : path.substring(0, path.lastIndexOf("/"));
+                    String p = path.lastIndexOf("/") <= 0 ? "/" : path.substring(0, path.lastIndexOf("/"));
                     while (p.length() > 0) {
                         handler = map(p, handlers);
 
@@ -131,7 +131,7 @@
 
                 // (4) try without a path
                 if (handler == null) {
-                    String p = path.lastIndexOf("/") == 0 ? "/" : path.substring(0, path.lastIndexOf("/"));
+                    String p = path.lastIndexOf("/")  <= 0 ? "/" : path.substring(0, path.lastIndexOf("/"));
                     while (p.length() > 0 && p.indexOf("/") != -1) {
                         handler = match(p, handlers);
 
