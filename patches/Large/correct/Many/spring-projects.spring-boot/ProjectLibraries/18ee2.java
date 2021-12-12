diff --git a/spring-boot-tools/spring-boot-gradle-plugin/src/main/groovy/org/springframework/boot/gradle/task/ProjectLibraries.java b/spring-boot-tools/spring-boot-gradle-plugin/src/main/groovy/org/springframework/boot/gradle/task/ProjectLibraries.java
index 794df87..6e013e3 100644
--- a/spring-boot-tools/spring-boot-gradle-plugin/src/main/groovy/org/springframework/boot/gradle/task/ProjectLibraries.java
+++ b/spring-boot-tools/spring-boot-gradle-plugin/src/main/groovy/org/springframework/boot/gradle/task/ProjectLibraries.java
@@ -49,7 +49,7 @@
 				this.providedConfigurationName);
 		if (provided != null) {
 			compile = compile.minus(provided);
-			runtime = compile.minus(provided);
+			runtime = runtime.minus(provided);
 		}
 
 		libraries(LibraryScope.COMPILE, compile, callback);
