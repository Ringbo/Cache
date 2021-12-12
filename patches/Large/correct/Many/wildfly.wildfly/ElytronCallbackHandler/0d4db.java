diff --git a/connector/src/main/java/org/jboss/as/connector/security/ElytronCallbackHandler.java b/connector/src/main/java/org/jboss/as/connector/security/ElytronCallbackHandler.java
index 3d3bd29..b9e0b27 100644
--- a/connector/src/main/java/org/jboss/as/connector/security/ElytronCallbackHandler.java
+++ b/connector/src/main/java/org/jboss/as/connector/security/ElytronCallbackHandler.java
@@ -141,7 +141,7 @@
 
         // establish the caller principal using the info from the callback.
         Principal callerPrincipal = null;
-        if (callerPrincipalCallback == null) {
+        if (callerPrincipalCallback != null) {
             Principal callbackPrincipal = callerPrincipalCallback.getPrincipal();
             callerPrincipal = callbackPrincipal != null ? new NamePrincipal(callbackPrincipal.getName()) :
                     callerPrincipalCallback.getName() != null ? new NamePrincipal(callerPrincipalCallback.getName()) : null;
