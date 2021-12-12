diff --git a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/DaemonTcpServerConnector.java b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/DaemonTcpServerConnector.java
index dcbc91c..950e170 100644
--- a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/DaemonTcpServerConnector.java
+++ b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/DaemonTcpServerConnector.java
@@ -79,7 +79,7 @@
                 }
             };
 
-            acceptor = incomingConnector.accept(connectEvent, false);
+            acceptor = incomingConnector.accept(connectEvent, true);
             started = true;
             return acceptor.getAddress();
         } finally {
