diff --git a/java/org/apache/coyote/ajp/AjpNioProcessor.java b/java/org/apache/coyote/ajp/AjpNioProcessor.java
index 84cab13..abf73fb 100644
--- a/java/org/apache/coyote/ajp/AjpNioProcessor.java
+++ b/java/org/apache/coyote/ajp/AjpNioProcessor.java
@@ -128,14 +128,14 @@
                     } catch (IOException e) {
                         error = true;
                     }
-                    recycle(true);
+                    recycle(false);
                     continue;
                 } else if(type != Constants.JK_AJP13_FORWARD_REQUEST) {
                     // Usually the servlet didn't read the previous request body
                     if(log.isDebugEnabled()) {
                         log.debug("Unexpected message: "+type);
                     }
-                    recycle(false);
+                    recycle(true);
                     continue;
                 }
                 request.setStartTime(System.currentTimeMillis());
@@ -217,7 +217,7 @@
                 socket.setTimeout(keepAliveTimeout);
             }
 
-            recycle(true);
+            recycle(false);
         }
         
         rp.setStage(org.apache.coyote.Constants.STAGE_ENDED);
