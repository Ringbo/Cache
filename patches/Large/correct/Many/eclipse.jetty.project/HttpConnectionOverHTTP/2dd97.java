diff --git a/jetty-client/src/main/java/org/eclipse/jetty/client/http/HttpConnectionOverHTTP.java b/jetty-client/src/main/java/org/eclipse/jetty/client/http/HttpConnectionOverHTTP.java
index 65e8eac..7c5a1b5 100644
--- a/jetty-client/src/main/java/org/eclipse/jetty/client/http/HttpConnectionOverHTTP.java
+++ b/jetty-client/src/main/java/org/eclipse/jetty/client/http/HttpConnectionOverHTTP.java
@@ -152,7 +152,7 @@
                     LOG.debug("Idle timeout {}/{}ms - {}", elapsed, idleTimeout, this);
                 if (idle)
                 {
-                    idleTimeoutStamp = -1;
+                    idleTimeoutGuard = -1;
                     close(new TimeoutException("Idle timeout expired: " + idleTimeout + "ms"));
                 }
             }
