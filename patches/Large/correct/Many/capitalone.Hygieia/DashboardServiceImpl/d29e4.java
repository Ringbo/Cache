diff --git a/api/src/main/java/com/capitalone/dashboard/service/DashboardServiceImpl.java b/api/src/main/java/com/capitalone/dashboard/service/DashboardServiceImpl.java
index 7c053ad..9ec2d01 100644
--- a/api/src/main/java/com/capitalone/dashboard/service/DashboardServiceImpl.java
+++ b/api/src/main/java/com/capitalone/dashboard/service/DashboardServiceImpl.java
@@ -449,7 +449,7 @@
         Cmdb cmdbAppItem =  cmdbService.configurationItemByConfigurationItem(app);
         Iterable<Dashboard> rt = null;
 
-        if(cmdbAppItem != null && cmdbAppItem != null){
+        if(cmdbAppItem != null && cmdbCompItem != null){
             rt = dashboardRepository.findAllByConfigurationItemBusServObjectIdAndConfigurationItemBusAppObjectId(cmdbAppItem.getId(),cmdbCompItem.getId());
         }
         return new DataResponse<>(rt, System.currentTimeMillis());
