diff --git a/clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosLogin.java b/clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosLogin.java
index 74b4ff2..ff9f218 100644
--- a/clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosLogin.java
+++ b/clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosLogin.java
@@ -158,7 +158,7 @@
                         long expiry = tgt.getEndTime().getTime();
                         Date expiryDate = new Date(expiry);
                         if (isUsingTicketCache && tgt.getRenewTill() != null && tgt.getRenewTill().getTime() < expiry) {
-                            log.error("The TGT cannot be renewed beyond the next expiry date: {}." +
+                            log.warn("The TGT cannot be renewed beyond the next expiry date: {}." +
                                     "This process will not be able to authenticate new SASL connections after that " +
                                     "time (for example, it will not be able to authenticate a new connection with a Kafka " +
                                     "Broker).  Ask your system administrator to either increase the " +
