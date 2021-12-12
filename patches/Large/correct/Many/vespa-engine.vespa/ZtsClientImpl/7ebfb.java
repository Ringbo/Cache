diff --git a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/athenz/impl/ZtsClientImpl.java b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/athenz/impl/ZtsClientImpl.java
index d964cc9..62b80b8 100644
--- a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/athenz/impl/ZtsClientImpl.java
+++ b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/athenz/impl/ZtsClientImpl.java
@@ -36,10 +36,10 @@
     public List<AthensDomain> getTenantDomainsForUser(AthenzPrincipal principal) {
         log.log(LogLevel.DEBUG, String.format(
                 "getTenantDomains(domain=%s, username=%s, rolename=admin, service=%s)",
-                service.getDomain().getName(), principal, service.getServiceName()));
+                service.getDomain().id(), principal, service.getServiceName()));
         try {
             TenantDomains domains = ztsClient.getTenantDomains(
-                    service.getDomain().getName(), principal.toYRN(), "admin", service.getServiceName());
+                    service.getDomain().id(), principal.toYRN(), "admin", service.getServiceName());
             return domains.getTenantDomainNames().stream()
                     .map(AthensDomain::new)
                     .collect(toList());
