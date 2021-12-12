diff --git a/core/src/main/java/io/undertow/security/impl/SimpleNonceManager.java b/core/src/main/java/io/undertow/security/impl/SimpleNonceManager.java
index 0525b0c..911edfe 100644
--- a/core/src/main/java/io/undertow/security/impl/SimpleNonceManager.java
+++ b/core/src/main/java/io/undertow/security/impl/SimpleNonceManager.java
@@ -291,7 +291,7 @@
                     return false;
                 }
 
-                if (nonce.timeStamp > earliestAccepted && nonce.timeStamp < now) {
+                if (nonce.timeStamp > earliestAccepted && nonce.timeStamp <= now) {
                     knownNonces.put(nonce.nonce, nonce);
                     long timeTillExpiry = nonce.timeStamp - earliestAccepted;
                     nonce.executorKey = executor.executeAfter(new KnownNonceCleaner(nonce.nonce), timeTillExpiry,
