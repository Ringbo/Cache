diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/ResourceManager.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/ResourceManager.java
index 130cfd4..c209873 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/ResourceManager.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/ResourceManager.java
@@ -200,7 +200,8 @@
         this.configurationProvider.getConfigurationInputStream(this.conf,
             YarnConfiguration.CORE_SITE_CONFIGURATION_FILE);
     if (coreSiteXMLInputStream != null) {
-      this.conf.addResource(coreSiteXMLInputStream);
+      this.conf.addResource(coreSiteXMLInputStream,
+          YarnConfiguration.CORE_SITE_CONFIGURATION_FILE);
     }
 
     // Do refreshUserToGroupsMappings with loaded core-site.xml
@@ -218,7 +219,8 @@
         this.configurationProvider.getConfigurationInputStream(this.conf,
             YarnConfiguration.YARN_SITE_CONFIGURATION_FILE);
     if (yarnSiteXMLInputStream != null) {
-      this.conf.addResource(yarnSiteXMLInputStream);
+      this.conf.addResource(yarnSiteXMLInputStream,
+          YarnConfiguration.YARN_SITE_CONFIGURATION_FILE);
     }
 
     validateConfigs(this.conf);
