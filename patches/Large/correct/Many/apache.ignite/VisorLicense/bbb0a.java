diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/dto/VisorLicense.java b/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/dto/VisorLicense.java
index bdef3a2..e4784f5 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/dto/VisorLicense.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/dto/VisorLicense.java
@@ -130,7 +130,7 @@
         l.maintenanceTime(lic.maintenanceTime());
         l.maxNodes(lic.maxNodes());
         l.maxComputers(lic.maxComputers());
-        l.maxComputers(lic.maxCpus());
+        l.maxCpus(lic.maxCpus());
         l.maxUpTime(lic.maxUpTime());
         l.gracePeriod(lic.gracePeriod());
         l.attributeName(lic.attributeName());
