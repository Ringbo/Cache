diff --git a/hazelcast/src/main/java/com/hazelcast/instance/DefaultAddressPicker.java b/hazelcast/src/main/java/com/hazelcast/instance/DefaultAddressPicker.java
index 09f0853..4037115 100644
--- a/hazelcast/src/main/java/com/hazelcast/instance/DefaultAddressPicker.java
+++ b/hazelcast/src/main/java/com/hazelcast/instance/DefaultAddressPicker.java
@@ -74,7 +74,7 @@
             Throwable error = null;
             for (int i = 0; i < 100; i++) {
                 /**
-                 * Instead of reusing the ServerSocket/ServerSocketChannel, we are going to close replace them on
+                 * Instead of reusing the ServerSocket/ServerSocketChannel, we are going to close and replace them on
                  * every attempt to find a free port. The reason to do this is because in some cases, when concurrent
                  * threads/processes try to acquire the same port, the ServerSocket gets corrupted and isn't able to find
                  * any free port at all (no matter if there are more than enough free ports available). We have seen this
@@ -110,7 +110,7 @@
                     }
                 }
             }
-            if (serverSocket == null) {
+            if (serverSocket == null || !serverSocket.isBound()) {
                 throw new HazelcastException("ServerSocket bind has failed. Hazelcast cannot start! " +
                         "config-port: " + networkConfig.getPort() + ", latest-port: " + port, error);
             }
