diff --git a/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/service/impl/OverrideServiceImpl.java b/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/service/impl/OverrideServiceImpl.java
index 386aa8d..e7bb310 100644
--- a/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/service/impl/OverrideServiceImpl.java
+++ b/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/service/impl/OverrideServiceImpl.java
@@ -75,7 +75,7 @@
             return;
         }
 
-        URL newOverride = oldOverride.removeParameter("enabled");
+        URL newOverride = oldOverride.addParameter("enabled", "enabled");
         registryService.unregister(oldOverride);
         registryService.register(newOverride);
 
