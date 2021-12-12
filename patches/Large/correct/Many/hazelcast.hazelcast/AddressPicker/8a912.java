diff --git a/hazelcast/src/main/java/com/hazelcast/impl/AddressPicker.java b/hazelcast/src/main/java/com/hazelcast/impl/AddressPicker.java
index f362e52..b79d1ee 100644
--- a/hazelcast/src/main/java/com/hazelcast/impl/AddressPicker.java
+++ b/hazelcast/src/main/java/com/hazelcast/impl/AddressPicker.java
@@ -208,7 +208,16 @@
             }
             final InetAddress inetAddress = InetAddress.getByName(currentAddress);
             ServerSocket serverSocket = serverSocketChannel.socket();
-            serverSocket.setReuseAddress(false);
+            /**
+             * why setReuseAddress(true)?
+             * when the member is shutdown,
+             * the serversocket port will be in TIME_WAIT state for the next
+             * 2 minutes or so. If you start the member right after shutting it down
+             * you may not able able to bind to the same port because it is in TIME_WAIT
+             * state. if you set reuseaddress=true then TIME_WAIT will be ignored and
+             * you will be able to bind to the same port again.
+             */
+            serverSocket.setReuseAddress(true);
             InetSocketAddress isa;
 
             int port = config.getPort();
@@ -219,7 +228,7 @@
                     break;
                 } catch (final Exception e) {
                     serverSocket = serverSocketChannel.socket();
-                    serverSocket.setReuseAddress(false);
+                    serverSocket.setReuseAddress(true);
                     port++;
                 }
             }
