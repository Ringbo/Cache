diff --git a/server/sonar-server/src/main/java/org/sonar/server/startup/LogServerId.java b/server/sonar-server/src/main/java/org/sonar/server/startup/LogServerId.java
index cf6ea5d..5fcbeb0 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/startup/LogServerId.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/startup/LogServerId.java
@@ -42,7 +42,7 @@
   }
 
   @VisibleForTesting
-  protected void logServerId(Logger logger) {
+  void logServerId(Logger logger) {
     PropertyDto serverIdProp = propertiesDao.selectGlobalProperty(CoreProperties.PERMANENT_SERVER_ID);
     if (serverIdProp != null) {
       // a server ID has been generated, let's print out the other useful informations that can help debugging license issues
