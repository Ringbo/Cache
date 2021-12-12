diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/HttpChannel.java b/jetty-server/src/main/java/org/eclipse/jetty/server/HttpChannel.java
index fd6b5e6..5d82b78 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/HttpChannel.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/HttpChannel.java
@@ -396,7 +396,7 @@
                 hashCode(),
                 _requests,
                 _state.getState(),
-                _state.getState()!=HttpChannelState.State.IDLE?"-":_request.getRequestURI()
+                _state.getState()==HttpChannelState.State.IDLE?"-":_request.getRequestURI()
             );
     }
 
