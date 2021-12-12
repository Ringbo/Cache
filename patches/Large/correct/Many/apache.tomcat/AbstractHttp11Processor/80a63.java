diff --git a/java/org/apache/coyote/http11/AbstractHttp11Processor.java b/java/org/apache/coyote/http11/AbstractHttp11Processor.java
index 4b14386..29f0c96 100644
--- a/java/org/apache/coyote/http11/AbstractHttp11Processor.java
+++ b/java/org/apache/coyote/http11/AbstractHttp11Processor.java
@@ -1055,8 +1055,8 @@
                         getLog().debug(sm.getString(
                                 "http11processor.request.prepare"), t);
                     }
-                    // 400 - Internal Server Error
-                    response.setStatus(400);
+                    // 500 - Internal Server Error
+                    response.setStatus(500);
                     getAdapter().log(request, response, 0);
                     error = true;
                 }
