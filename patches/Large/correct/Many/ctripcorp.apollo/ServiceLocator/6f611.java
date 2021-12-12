diff --git a/apollo-portal/src/main/java/com/ctrip/apollo/portal/service/ServiceLocator.java b/apollo-portal/src/main/java/com/ctrip/apollo/portal/service/ServiceLocator.java
index 192f134..629f172 100644
--- a/apollo-portal/src/main/java/com/ctrip/apollo/portal/service/ServiceLocator.java
+++ b/apollo-portal/src/main/java/com/ctrip/apollo/portal/service/ServiceLocator.java
@@ -41,18 +41,18 @@
 
   public ServiceDTO getAdminService(Env env) throws ServiceException {
     List<ServiceDTO> services = getServices(env, "admin");
-    if (services.size() == 0) {
+    if (services == null || services.size() == 0) {
       throw new ServiceException("No available admin service");
     }
-    return services.get(adminCallCounts.getAndIncrement() % services.size());
+    return services.get(Math.abs(adminCallCounts.getAndIncrement()) % services.size());
   }
 
   public ServiceDTO getConfigService(Env env) throws ServiceException {
     List<ServiceDTO> services = getServices(env, "config");
-    if (services.size() == 0) {
+    if (services == null || services.size() == 0) {
       throw new ServiceException("No available config service");
     }
-    return services.get(configCallCounts.getAndIncrement() % services.size());
+    return services.get(Math.abs(configCallCounts.getAndIncrement()) % services.size());
   }
 
   private List<ServiceDTO> getServices(Env env, String serviceUrl) {
