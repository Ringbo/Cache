diff --git a/plugin/security/src/main/java/org/elasticsearch/xpack/security/audit/logfile/LoggingAuditTrail.java b/plugin/security/src/main/java/org/elasticsearch/xpack/security/audit/logfile/LoggingAuditTrail.java
index e34bb89..f300652 100644
--- a/plugin/security/src/main/java/org/elasticsearch/xpack/security/audit/logfile/LoggingAuditTrail.java
+++ b/plugin/security/src/main/java/org/elasticsearch/xpack/security/audit/logfile/LoggingAuditTrail.java
@@ -514,7 +514,7 @@
 
     static Optional<String[]> indices(TransportMessage message) {
         if (message instanceof IndicesRequest) {
-            return Optional.of(((IndicesRequest) message).indices());
+            return Optional.ofNullable(((IndicesRequest) message).indices());
         }
         return Optional.empty();
     }
