diff --git a/src/main/java/org/elasticsearch/discovery/zen/fd/MasterFaultDetection.java b/src/main/java/org/elasticsearch/discovery/zen/fd/MasterFaultDetection.java
index a438d3b..6b08297 100644
--- a/src/main/java/org/elasticsearch/discovery/zen/fd/MasterFaultDetection.java
+++ b/src/main/java/org/elasticsearch/discovery/zen/fd/MasterFaultDetection.java
@@ -299,7 +299,7 @@
                             synchronized (masterNodeMutex) {
                                 // check if the master node did not get switched on us...
                                 if (masterToPing.equals(MasterFaultDetection.this.masterNode())) {
-                                    if (exp instanceof ConnectTransportException) {
+                                    if (exp instanceof ConnectTransportException || exp.getCause() instanceof ConnectTransportException) {
                                         handleTransportDisconnect(masterToPing);
                                         return;
                                     } else if (exp.getCause() instanceof NoLongerMasterException) {
