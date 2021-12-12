diff --git a/src/main/java/org/elasticsearch/discovery/zen/fd/NodesFaultDetection.java b/src/main/java/org/elasticsearch/discovery/zen/fd/NodesFaultDetection.java
index ed30034..ee4fc71 100644
--- a/src/main/java/org/elasticsearch/discovery/zen/fd/NodesFaultDetection.java
+++ b/src/main/java/org/elasticsearch/discovery/zen/fd/NodesFaultDetection.java
@@ -233,7 +233,7 @@
                                 if (!nodeFD.running) {
                                     return;
                                 }
-                                if (exp instanceof ConnectTransportException) {
+                                if (exp instanceof ConnectTransportException || exp.getCause() instanceof ConnectTransportException) {
                                     handleTransportDisconnect(node);
                                     return;
                                 }
