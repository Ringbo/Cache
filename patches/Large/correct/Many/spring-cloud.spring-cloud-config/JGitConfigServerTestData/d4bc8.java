diff --git a/spring-cloud-config-server/src/test/java/org/springframework/cloud/config/server/environment/JGitConfigServerTestData.java b/spring-cloud-config-server/src/test/java/org/springframework/cloud/config/server/environment/JGitConfigServerTestData.java
index d31c26d..cda3797 100644
--- a/spring-cloud-config-server/src/test/java/org/springframework/cloud/config/server/environment/JGitConfigServerTestData.java
+++ b/spring-cloud-config-server/src/test/java/org/springframework/cloud/config/server/environment/JGitConfigServerTestData.java
@@ -80,7 +80,7 @@
         return this.context;
     }
 
-    public static JGitConfigServerTestData prepareClonedGitRepository(Object... sources) throws Exception {
+    public static JGitConfigServerTestData prepareClonedGitRepository(Class... sources) throws Exception {
         //setup remote repository
         String remoteUri = ConfigServerTestUtils.prepareLocalRepo();
         File remoteRepoDir = ResourceUtils.getFile(remoteUri);
