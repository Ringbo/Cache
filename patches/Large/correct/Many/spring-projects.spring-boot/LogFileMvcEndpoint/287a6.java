diff --git a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/mvc/LogFileMvcEndpoint.java b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/mvc/LogFileMvcEndpoint.java
index b82c288..716b143 100644
--- a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/mvc/LogFileMvcEndpoint.java
+++ b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/mvc/LogFileMvcEndpoint.java
@@ -145,7 +145,7 @@
 
 		private final Resource resource;
 
-		public Handler(Resource resource) {
+		Handler(Resource resource) {
 			this.resource = resource;
 		}
 
