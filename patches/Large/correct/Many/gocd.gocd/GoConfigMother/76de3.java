diff --git a/config/config-api/test/com/thoughtworks/go/helper/GoConfigMother.java b/config/config-api/test/com/thoughtworks/go/helper/GoConfigMother.java
index 1160437..e51c2d9 100644
--- a/config/config-api/test/com/thoughtworks/go/helper/GoConfigMother.java
+++ b/config/config-api/test/com/thoughtworks/go/helper/GoConfigMother.java
@@ -311,7 +311,7 @@
     public static CruiseConfig configWithConfigRepo() {
         CruiseConfig cruiseConfig = new BasicCruiseConfig();
         cruiseConfig.setConfigRepos(new ConfigReposConfig(new ConfigRepoConfig(
-                new GitMaterialConfig("https://github.com/tomzo/gocd-indep-config-part.git"),"myplugin"
+                new GitMaterialConfig("https://github.com/tomzo/gocd-indep-config-part.git"),"myplugin", "id2"
         )));
         return cruiseConfig;
     }
