diff --git a/src/main/java/com/ning/http/client/providers/grizzly/GrizzlyAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/grizzly/GrizzlyAsyncHttpProvider.java
index 908c1f8..289b3bc 100644
--- a/src/main/java/com/ning/http/client/providers/grizzly/GrizzlyAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/grizzly/GrizzlyAsyncHttpProvider.java
@@ -522,9 +522,9 @@
         int port = p;
         if (port == -1) {
             final String protocol = uri.getScheme().toLowerCase();
-            if ("http".equals(protocol)) {
+            if ("http".equals(protocol) || "ws".equals(protocol)) {
                 port = 80;
-            } else if ("https".equals(protocol)) {
+            } else if ("https".equals(protocol) || "wss".equals(protocol)) {
                 port = 443;
             } else {
                 throw new IllegalArgumentException("Unknown protocol: " + protocol);
