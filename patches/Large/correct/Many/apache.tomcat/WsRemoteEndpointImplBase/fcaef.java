diff --git a/java/org/apache/tomcat/websocket/WsRemoteEndpointImplBase.java b/java/org/apache/tomcat/websocket/WsRemoteEndpointImplBase.java
index 2d5a946..457827c 100644
--- a/java/org/apache/tomcat/websocket/WsRemoteEndpointImplBase.java
+++ b/java/org/apache/tomcat/websocket/WsRemoteEndpointImplBase.java
@@ -992,8 +992,10 @@
                  // NO-OP. Leave state as is.
                 } else {
                     // Should never happen
-                    // TODO Better message
-                    throw new IllegalStateException();
+                    // The if ... else ... blocks above should cover all states
+                    // permitted by the preceding checkState() call
+                    throw new IllegalStateException(
+                            "BUG: This code should never be called");
                 }
             }
         }
@@ -1004,8 +1006,8 @@
                     return;
                 }
             }
-            // TODO Better (well, any) message
-            throw new IllegalStateException();
+            throw new IllegalStateException(
+                    sm.getString("wsRemoteEndpoint.wrongState", this.state));
         }
     }
 
