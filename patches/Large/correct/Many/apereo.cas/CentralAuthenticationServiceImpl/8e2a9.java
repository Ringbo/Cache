diff --git a/cas-server-core/src/main/java/org/jasig/cas/CentralAuthenticationServiceImpl.java b/cas-server-core/src/main/java/org/jasig/cas/CentralAuthenticationServiceImpl.java
index e965a67..b282693 100644
--- a/cas-server-core/src/main/java/org/jasig/cas/CentralAuthenticationServiceImpl.java
+++ b/cas-server-core/src/main/java/org/jasig/cas/CentralAuthenticationServiceImpl.java
@@ -278,7 +278,7 @@
             principalAttrs = new HashMap<>();
         }
 
-        if (!registeredService.getAccessStrategy().doPrincipalAttributesAllowServiceAccess(principalAttrs)) {
+        if (!registeredService.getAccessStrategy().doPrincipalAttributesAllowServiceAccess(principal.getId(), principalAttrs)) {
             logger.warn("Cannot grant proxy ticket because Service [{}] is not authorized for use by [{}].",
                     service.getId(), principal);
             throw new UnauthorizedServiceForPrincipalException();
