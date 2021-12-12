diff --git a/java/org/apache/catalina/startup/HostConfig.java b/java/org/apache/catalina/startup/HostConfig.java
index 758d63a..2f79404 100644
--- a/java/org/apache/catalina/startup/HostConfig.java
+++ b/java/org/apache/catalina/startup/HostConfig.java
@@ -1312,7 +1312,7 @@
         if (host.getCreateDirs()) {
             File[] dirs = new File[] {appBase(),configBase()};
             for (int i=0; i<dirs.length; i++) {
-                if ( (!dirs[i].exists()) && (!dirs[i].mkdirs())) {
+                if ( (!dirs[i].isDirectory()) && (!dirs[i].mkdirs())) {
                     log.error(sm.getString("hostConfig.createDirs",dirs[i]));
                 }
             }
