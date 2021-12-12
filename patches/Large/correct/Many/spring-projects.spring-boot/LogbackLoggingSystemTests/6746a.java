diff --git a/spring-boot/src/test/java/org/springframework/boot/logging/logback/LogbackLoggingSystemTests.java b/spring-boot/src/test/java/org/springframework/boot/logging/logback/LogbackLoggingSystemTests.java
index 35d0c75..1db49ae 100644
--- a/spring-boot/src/test/java/org/springframework/boot/logging/logback/LogbackLoggingSystemTests.java
+++ b/spring-boot/src/test/java/org/springframework/boot/logging/logback/LogbackLoggingSystemTests.java
@@ -173,7 +173,7 @@
 	@Test
 	public void loggingLevelIsPropagatedToJulI() {
 		this.loggingSystem.beforeInitialize();
-		this.loggingSystem.initialize(null, null);
+		this.loggingSystem.initialize(this.initializationContext, null, null);
 		this.loggingSystem.setLogLevel(getClass().getName(), LogLevel.DEBUG);
 		java.util.logging.Logger julLogger = java.util.logging.Logger
 				.getLogger(getClass().getName());
