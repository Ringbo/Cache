diff --git a/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPServerEngine.java b/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPServerEngine.java
index 70c964d..d08e135 100644
--- a/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPServerEngine.java
+++ b/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPServerEngine.java
@@ -359,7 +359,7 @@
                     }
                 }
             } catch (Exception e) {
-                LOG.log(Level.SEVERE, "START_UP_SERVER_FAILED_MSG", new Object[] {e.getMessage()});
+                LOG.log(Level.SEVERE, "START_UP_SERVER_FAILED_MSG", new Object[] {e.getMessage(), port});
                 //problem starting server
                 try {                    
                     server.stop();
@@ -368,7 +368,7 @@
                     //ignore - probably wasn't fully started anyway
                 }
                 server = null;
-                throw new Fault(new Message("START_UP_SERVER_FAILED_MSG", LOG, e.getMessage()), e);
+                throw new Fault(new Message("START_UP_SERVER_FAILED_MSG", LOG, e.getMessage(), port), e);
             }
         }        
         
