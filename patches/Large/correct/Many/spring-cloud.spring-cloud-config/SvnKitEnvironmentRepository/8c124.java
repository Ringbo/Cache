diff --git a/spring-cloud-config-server/src/main/java/org/springframework/cloud/config/server/SvnKitEnvironmentRepository.java b/spring-cloud-config-server/src/main/java/org/springframework/cloud/config/server/SvnKitEnvironmentRepository.java
index 78beb79..e968035 100644
--- a/spring-cloud-config-server/src/main/java/org/springframework/cloud/config/server/SvnKitEnvironmentRepository.java
+++ b/spring-cloud-config-server/src/main/java/org/springframework/cloud/config/server/SvnKitEnvironmentRepository.java
@@ -78,7 +78,7 @@
 		}
 	}
 
-	private Environment loadEnvironment(String application, String profile, String label) {
+	private synchronized Environment loadEnvironment(String application, String profile, String label) {
 		final NativeEnvironmentRepository environmentRepository = new NativeEnvironmentRepository(
 				getEnvironment());
 		environmentRepository.setSearchLocations(getSearchLocations(getSvnPath(
