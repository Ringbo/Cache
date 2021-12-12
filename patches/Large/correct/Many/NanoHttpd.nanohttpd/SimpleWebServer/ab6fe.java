diff --git a/webserver/src/main/java/fi/iki/elonen/SimpleWebServer.java b/webserver/src/main/java/fi/iki/elonen/SimpleWebServer.java
index ed32dd7..4b615b7 100644
--- a/webserver/src/main/java/fi/iki/elonen/SimpleWebServer.java
+++ b/webserver/src/main/java/fi/iki/elonen/SimpleWebServer.java
@@ -527,7 +527,7 @@
                     } else if (len < 1024 * 1024) {
                         msg.append(len / 1024).append(".").append(len % 1024 / 10 % 100).append(" KB");
                     } else {
-                        msg.append(len / (1024 * 1024)).append(".").append(len % (1024 * 1024) / 10 % 100).append(" MB");
+                        msg.append(len / (1024 * 1024)).append(".").append(len % (1024 * 1024) / 10000 % 100).append(" MB");
                     }
                     msg.append(")</span></li>");
                 }
