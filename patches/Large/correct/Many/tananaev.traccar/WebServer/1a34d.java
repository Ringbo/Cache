diff --git a/src/org/traccar/web/WebServer.java b/src/org/traccar/web/WebServer.java
index 4e764d5..ba98c1b 100644
--- a/src/org/traccar/web/WebServer.java
+++ b/src/org/traccar/web/WebServer.java
@@ -100,7 +100,7 @@
                 writer.write("<!DOCTYPE<html><head><title>Error</title></head><html><body>"
                         + code + " - " + HttpStatus.getMessage(code) + "</body></html>");
             }
-        });
+        }, false);
     }
 
     private void initWebApp() {
