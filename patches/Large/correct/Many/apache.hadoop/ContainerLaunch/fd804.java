diff --git a/hadoop-mapreduce-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/containermanager/launcher/ContainerLaunch.java b/hadoop-mapreduce-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/containermanager/launcher/ContainerLaunch.java
index bcd2115..585ec85 100644
--- a/hadoop-mapreduce-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/containermanager/launcher/ContainerLaunch.java
+++ b/hadoop-mapreduce-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/containermanager/launcher/ContainerLaunch.java
@@ -100,7 +100,8 @@
       String appIdStr = app.toString();
       Path containerLogDir =
           this.logDirsSelector.getLocalPathForWrite(appIdStr + Path.SEPARATOR
-              + containerIdStr, LocalDirAllocator.SIZE_UNKNOWN, this.conf);
+              + containerIdStr, LocalDirAllocator.SIZE_UNKNOWN, this.conf, 
+              false);
       for (String str : command) {
         // TODO: Should we instead work via symlinks without this grammar?
         newCmds.add(str.replace(ApplicationConstants.LOG_DIR_EXPANSION_VAR,
@@ -147,7 +148,7 @@
               + Path.SEPARATOR + user + Path.SEPARATOR
               + ContainerLocalizer.APPCACHE + Path.SEPARATOR + appIdStr
               + Path.SEPARATOR + containerIdStr,
-              LocalDirAllocator.SIZE_UNKNOWN, this.conf);
+              LocalDirAllocator.SIZE_UNKNOWN, this.conf, false);
       try {
         // /////////// Write out the container-script in the nmPrivate space.
         String[] localDirs =
