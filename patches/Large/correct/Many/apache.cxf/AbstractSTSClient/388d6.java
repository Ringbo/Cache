diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/trust/AbstractSTSClient.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/trust/AbstractSTSClient.java
index 013ff49..5e0ea25 100755
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/trust/AbstractSTSClient.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/trust/AbstractSTSClient.java
@@ -586,7 +586,7 @@
                     client = new ClientImpl(bus, endpoint);
                 }
             } catch (Exception ex) {
-                throw new TrustException(LOG, "WS_MEX_ERROR", ex);
+                throw new TrustException("WS_MEX_ERROR", ex, LOG);
             }
         }
     }
@@ -1436,7 +1436,7 @@
                     try {
                         secret = psha1.createKey(requestorEntropy, serviceEntr, 0, length / 8);
                     } catch (WSSecurityException e) {
-                        throw new TrustException("DERIVED_KEY_ERROR", LOG, e);
+                        throw new TrustException("DERIVED_KEY_ERROR", e, LOG);
                     }
                 } else {
                     // Service entropy missing
@@ -1487,7 +1487,7 @@
                         WSSecurityEngineResult.TAG_SECRET
                     );
             } catch (IOException e) {
-                throw new TrustException("ENCRYPTED_KEY_ERROR", LOG, e);
+                throw new TrustException("ENCRYPTED_KEY_ERROR", e, LOG);
             }
         }
     }
