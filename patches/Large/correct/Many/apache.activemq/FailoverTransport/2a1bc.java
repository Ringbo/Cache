diff --git a/activemq-client/src/main/java/org/apache/activemq/transport/failover/FailoverTransport.java b/activemq-client/src/main/java/org/apache/activemq/transport/failover/FailoverTransport.java
index 3f71181..6c92b38 100755
--- a/activemq-client/src/main/java/org/apache/activemq/transport/failover/FailoverTransport.java
+++ b/activemq-client/src/main/java/org/apache/activemq/transport/failover/FailoverTransport.java
@@ -963,7 +963,7 @@
                             uri = bt.getUri();
                             if (priorityBackup && priorityBackupAvailable) {
                                 Transport old = this.connectedTransport.getAndSet(null);
-                                if (transport != null) {
+                                if (old != null) {
                                     disposeTransport(old);
                                 }
                                 priorityBackupAvailable = false;
