diff --git a/ambari-server/src/main/java/org/apache/ambari/server/controller/ControllerModule.java b/ambari-server/src/main/java/org/apache/ambari/server/controller/ControllerModule.java
index c9daab4..72c33bd 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/controller/ControllerModule.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/controller/ControllerModule.java
@@ -606,7 +606,7 @@
     // log the order of the pre-upgrade checks
     List<AbstractCheckDescriptor> upgradeChecks = registry.getUpgradeChecks();
     for (AbstractCheckDescriptor upgradeCheck : upgradeChecks) {
-      LOG.error("Registered pre-upgrade check {}", upgradeCheck.getClass());
+      LOG.debug("Registered pre-upgrade check {}", upgradeCheck.getClass());
     }
   }
 }
