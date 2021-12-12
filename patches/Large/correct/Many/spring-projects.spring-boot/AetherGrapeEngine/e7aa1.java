diff --git a/spring-boot-cli/src/main/java/org/springframework/boot/cli/compiler/grape/AetherGrapeEngine.java b/spring-boot-cli/src/main/java/org/springframework/boot/cli/compiler/grape/AetherGrapeEngine.java
index ebca33f..72d879d 100644
--- a/spring-boot-cli/src/main/java/org/springframework/boot/cli/compiler/grape/AetherGrapeEngine.java
+++ b/spring-boot-cli/src/main/java/org/springframework/boot/cli/compiler/grape/AetherGrapeEngine.java
@@ -195,7 +195,8 @@
 					.getManagedDependencies());
 
 			DependencyRequest dependencyRequest = new DependencyRequest(collectRequest,
-					DependencyFilterUtils.classpathFilter(JavaScopes.COMPILE));
+					DependencyFilterUtils.classpathFilter(JavaScopes.COMPILE,
+							JavaScopes.RUNTIME));
 
 			DependencyResult dependencyResult = this.repositorySystem
 					.resolveDependencies(this.session, dependencyRequest);
