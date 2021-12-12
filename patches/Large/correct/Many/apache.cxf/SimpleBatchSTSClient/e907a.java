diff --git a/services/sts/systests/advanced/src/test/java/org/apache/cxf/systest/sts/batch/SimpleBatchSTSClient.java b/services/sts/systests/advanced/src/test/java/org/apache/cxf/systest/sts/batch/SimpleBatchSTSClient.java
index 4036035..b21fb8e 100644
--- a/services/sts/systests/advanced/src/test/java/org/apache/cxf/systest/sts/batch/SimpleBatchSTSClient.java
+++ b/services/sts/systests/advanced/src/test/java/org/apache/cxf/systest/sts/batch/SimpleBatchSTSClient.java
@@ -930,7 +930,7 @@
                     try {
                         secret = psha1.createKey(requestorEntropy, serviceEntr, 0, length / 8);
                     } catch (WSSecurityException e) {
-                        throw new TrustException("DERIVED_KEY_ERROR", LOG, e);
+                        throw new TrustException("DERIVED_KEY_ERROR", e, LOG);
                     }
                 } else {
                     // Service entropy missing
@@ -981,7 +981,7 @@
                         WSSecurityEngineResult.TAG_SECRET
                     );
             } catch (IOException e) {
-                throw new TrustException("ENCRYPTED_KEY_ERROR", LOG, e);
+                throw new TrustException("ENCRYPTED_KEY_ERROR", e, LOG);
             }
         }
     }
