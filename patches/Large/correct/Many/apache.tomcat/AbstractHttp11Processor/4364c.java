diff --git a/java/org/apache/coyote/http11/AbstractHttp11Processor.java b/java/org/apache/coyote/http11/AbstractHttp11Processor.java
index 15350c0..10ee31a 100644
--- a/java/org/apache/coyote/http11/AbstractHttp11Processor.java
+++ b/java/org/apache/coyote/http11/AbstractHttp11Processor.java
@@ -1584,7 +1584,7 @@
                     request.setAttribute(RequestDispatcher.ERROR_EXCEPTION, x);
                 }
             } catch (IllegalStateException x) {
-                registerForEvent(false, true);
+                registerForEvent(true, false);
             }
         }
 
