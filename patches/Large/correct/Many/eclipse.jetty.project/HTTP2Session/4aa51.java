diff --git a/jetty-http2/http2-common/src/main/java/org/eclipse/jetty/http2/HTTP2Session.java b/jetty-http2/http2-common/src/main/java/org/eclipse/jetty/http2/HTTP2Session.java
index e4ce969..869e21c 100644
--- a/jetty-http2/http2-common/src/main/java/org/eclipse/jetty/http2/HTTP2Session.java
+++ b/jetty-http2/http2-common/src/main/java/org/eclipse/jetty/http2/HTTP2Session.java
@@ -871,7 +871,7 @@
             case LOCALLY_CLOSED:
             case REMOTELY_CLOSED:
             {
-                abort(new TimeoutException());
+                abort(new TimeoutException("Idle timeout " + endPoint.getIdleTimeout() + " ms"));
                 return false;
             }
             default:
