diff --git a/ambari-server/src/main/java/org/apache/ambari/server/events/listeners/upgrade/StackVersionListener.java b/ambari-server/src/main/java/org/apache/ambari/server/events/listeners/upgrade/StackVersionListener.java
index dd4335b..bd7eb00 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/events/listeners/upgrade/StackVersionListener.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/events/listeners/upgrade/StackVersionListener.java
@@ -125,7 +125,7 @@
         processComponentAdvertisedVersion(cluster, sch, newVersion, sc);
       } else if(!sc.isVersionAdvertised() && StringUtils.isNotBlank(newVersion)
           && !UNKNOWN_VERSION.equalsIgnoreCase(newVersion)) {
-        LOG.error("ServiceComponent {} doesn't advertise version, " +
+        LOG.debug("ServiceComponent {} doesn't advertise version, " +
                 "however ServiceHostComponent {} on host {} advertised version as {}. Skipping version update",
             sc.getName(), sch.getServiceComponentName(), sch.getHostName(), newVersion);
       } else {
