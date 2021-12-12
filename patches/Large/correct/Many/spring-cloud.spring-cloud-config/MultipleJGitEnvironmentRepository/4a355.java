diff --git a/spring-cloud-config-server/src/main/java/org/springframework/cloud/config/server/environment/MultipleJGitEnvironmentRepository.java b/spring-cloud-config-server/src/main/java/org/springframework/cloud/config/server/environment/MultipleJGitEnvironmentRepository.java
index 987cfce..fc3017d 100644
--- a/spring-cloud-config-server/src/main/java/org/springframework/cloud/config/server/environment/MultipleJGitEnvironmentRepository.java
+++ b/spring-cloud-config-server/src/main/java/org/springframework/cloud/config/server/environment/MultipleJGitEnvironmentRepository.java
@@ -166,7 +166,7 @@
 		if (label != null) {
 			key = key.replace("{label}", label);
 		}
-		if (!this.repos.containsKey(key)) {
+		if (!this.placeholders.containsKey(key)) {
 			this.placeholders.put(key, getRepository(repository, key));
 		}
 		return this.placeholders.get(key);
