diff --git a/spring-core/src/main/java/org/springframework/core/log/CompositeLog.java b/spring-core/src/main/java/org/springframework/core/log/CompositeLog.java
index 9d46d28..3e50f32 100644
--- a/spring-core/src/main/java/org/springframework/core/log/CompositeLog.java
+++ b/spring-core/src/main/java/org/springframework/core/log/CompositeLog.java
@@ -114,7 +114,7 @@
 
 	@Override
 	public void error(Object message, Throwable ex) {
-		this.errorLogger.error(message);
+		this.errorLogger.error(message, ex);
 	}
 
 	@Override
