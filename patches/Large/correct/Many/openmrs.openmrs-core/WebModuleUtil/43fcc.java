diff --git a/src/web/org/openmrs/module/web/WebModuleUtil.java b/src/web/org/openmrs/module/web/WebModuleUtil.java
index 6ed18eb..e4f9b18 100644
--- a/src/web/org/openmrs/module/web/WebModuleUtil.java
+++ b/src/web/org/openmrs/module/web/WebModuleUtil.java
@@ -313,7 +313,7 @@
 						log.warn(msg + " for module: " + mod.getModuleId(), e);
 					
 					try {
-						ModuleFactory.stopModule(mod); //remove jar from classloader play 
+						ModuleFactory.stopModule(mod, true, true); //remove jar from classloader play 
 						stopModule(mod, servletContext, true);
 					}
 					catch (Exception e2) {
