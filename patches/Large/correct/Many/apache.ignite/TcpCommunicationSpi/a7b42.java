diff --git a/modules/core/src/main/java/org/apache/ignite/spi/communication/tcp/TcpCommunicationSpi.java b/modules/core/src/main/java/org/apache/ignite/spi/communication/tcp/TcpCommunicationSpi.java
index c80617e..3736d08 100644
--- a/modules/core/src/main/java/org/apache/ignite/spi/communication/tcp/TcpCommunicationSpi.java
+++ b/modules/core/src/main/java/org/apache/ignite/spi/communication/tcp/TcpCommunicationSpi.java
@@ -519,7 +519,8 @@
 
                     GridCommunicationClient oldClient = clients.putIfAbsent(node.id(), client);
 
-                    assert oldClient == null;
+                    assert oldClient == null : "Client already created [node=" + node + ", client=" + client +
+                            ", oldClient=" + oldClient + ", recoveryDesc=" + recovery + ']';
                 }
 
                 return client;
@@ -1830,7 +1831,8 @@
                             if (client0 != null) {
                                 GridCommunicationClient old = clients.put(nodeId, client0);
 
-                                assert old == null;
+                                assert old == null : "Client already created " +
+                                        "[node=" + node + ", client=" + client0 + ", oldClient=" + old + ']';
                             }
                             else
                                 U.sleep(200);
@@ -2359,7 +2361,7 @@
             int queueLimit = unackedMsgsBufSize != 0 ? unackedMsgsBufSize : (maxSize * 5);
 
             GridNioRecoveryDescriptor old =
-                recoveryDescs.put(id, recovery = new GridNioRecoveryDescriptor(queueLimit, node, log));
+                recoveryDescs.putIfAbsent(id, recovery = new GridNioRecoveryDescriptor(queueLimit, node, log));
 
             if (old != null)
                 recovery = old;
