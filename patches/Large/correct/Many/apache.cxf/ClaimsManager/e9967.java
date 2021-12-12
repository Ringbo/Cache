diff --git a/services/sts/sts-core/src/main/java/org/apache/cxf/sts/claims/ClaimsManager.java b/services/sts/sts-core/src/main/java/org/apache/cxf/sts/claims/ClaimsManager.java
index edaa8f1..5d6158c 100644
--- a/services/sts/sts-core/src/main/java/org/apache/cxf/sts/claims/ClaimsManager.java
+++ b/services/sts/sts-core/src/main/java/org/apache/cxf/sts/claims/ClaimsManager.java
@@ -140,7 +140,7 @@
                     ClaimCollection claimCollection = null;
                     try {
                         claimCollection = handler.retrieveClaimValues(claims, parameters);
-                    } catch (Exception ex) {
+                    } catch (RuntimeException ex) {
                         LOG.log(Level.INFO, "Failed retrieving claims from ClaimsHandler "
                                 + handler.getClass().getName(), ex);
                         if (this.isStopProcessingOnException()) {
