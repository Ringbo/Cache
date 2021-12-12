diff --git a/java/org/apache/catalina/connector/CoyoteAdapter.java b/java/org/apache/catalina/connector/CoyoteAdapter.java
index 9495637..8a4fa69 100644
--- a/java/org/apache/catalina/connector/CoyoteAdapter.java
+++ b/java/org/apache/catalina/connector/CoyoteAdapter.java
@@ -305,7 +305,10 @@
                     asyncConImpl.setErrorState(null, false);
                 }
             } else if (status==SocketStatus.ASYNC_READ_ERROR) {
-                success = true;
+                // A async read error is an IO error which means the socket
+                // needs to be closed so set success to false to trigger a
+                // close
+                success = false;
                 Throwable t = (Throwable)req.getAttribute(
                         RequestDispatcher.ERROR_EXCEPTION);
                 req.getAttributes().remove(RequestDispatcher.ERROR_EXCEPTION);
@@ -325,7 +328,10 @@
                     asyncConImpl.setErrorState(t, true);
                 }
             } else if (status==SocketStatus.ASYNC_WRITE_ERROR) {
-                success = true;
+                // A async write error is an IO error which means the socket
+                // needs to be closed so set success to false to trigger a
+                // close
+                success = false;
                 Throwable t = (Throwable)req.getAttribute(
                         RequestDispatcher.ERROR_EXCEPTION);
                 req.getAttributes().remove(RequestDispatcher.ERROR_EXCEPTION);
