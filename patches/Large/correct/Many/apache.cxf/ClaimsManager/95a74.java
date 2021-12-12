diff --git a/services/sts/sts-core/src/main/java/org/apache/cxf/sts/claims/ClaimsManager.java b/services/sts/sts-core/src/main/java/org/apache/cxf/sts/claims/ClaimsManager.java
index 14a4cf2..505f7e3 100644
--- a/services/sts/sts-core/src/main/java/org/apache/cxf/sts/claims/ClaimsManager.java
+++ b/services/sts/sts-core/src/main/java/org/apache/cxf/sts/claims/ClaimsManager.java
@@ -192,7 +192,7 @@
                                     STSException.REQUEST_FAILED);
                         }
                         
-                        if (targetPrincipal == null) {
+                        if (targetPrincipal == null || targetPrincipal.getName() == null) {
                             LOG.log(Level.WARNING, "Null. Failed to map user '" + parameters.getPrincipal().getName()
                                     + "' [" + parameters.getRealm() + "] to realm '"
                                     + handlerRealmSupport.getHandlerRealm() + "'");
