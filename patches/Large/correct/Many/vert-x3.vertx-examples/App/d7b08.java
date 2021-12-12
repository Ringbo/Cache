diff --git a/mqtt-server-examples/src/main/java/io/vertx/example/mqtt/server/app/App.java b/mqtt-server-examples/src/main/java/io/vertx/example/mqtt/server/app/App.java
index 5869eb0..faab168 100644
--- a/mqtt-server-examples/src/main/java/io/vertx/example/mqtt/server/app/App.java
+++ b/mqtt-server-examples/src/main/java/io/vertx/example/mqtt/server/app/App.java
@@ -55,7 +55,7 @@
             " QoS = " + endpoint.will().willQos() + " isRetain = " + endpoint.will().isWillRetain() + "]");
         }
 
-        System.out.println("[keep alive timeout = " + endpoint.keepAliveTimeoutSeconds() + "]");
+        System.out.println("[keep alive timeout = " + endpoint.keepAliveTimeSeconds() + "]");
 
         // accept connection from the remote client
         endpoint.accept(false);
