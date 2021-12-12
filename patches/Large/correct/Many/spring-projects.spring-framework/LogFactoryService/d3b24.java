diff --git a/spring-jcl/src/main/java/org/apache/commons/logging/LogFactoryService.java b/spring-jcl/src/main/java/org/apache/commons/logging/LogFactoryService.java
index af8d810..4c771ba 100644
--- a/spring-jcl/src/main/java/org/apache/commons/logging/LogFactoryService.java
+++ b/spring-jcl/src/main/java/org/apache/commons/logging/LogFactoryService.java
@@ -37,7 +37,7 @@
 
 	@Override
 	public Log getInstance(String name) {
-		return LogDelegate.createLog(name);
+		return LogAdapter.createLog(name);
 	}
 
 
