diff --git a/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/invoke/reflect/ReflectiveOperationInvoker.java b/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/invoke/reflect/ReflectiveOperationInvoker.java
index 4f437b2..fff5507 100644
--- a/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/invoke/reflect/ReflectiveOperationInvoker.java
+++ b/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/invoke/reflect/ReflectiveOperationInvoker.java
@@ -86,7 +86,7 @@
 	private boolean isMissing(Map<String, Object> arguments,
 			OperationParameter parameter) {
 		if (!parameter.isMandatory()) {
-			return true;
+			return false;
 		}
 		return arguments.get(parameter.getName()) == null;
 	}
