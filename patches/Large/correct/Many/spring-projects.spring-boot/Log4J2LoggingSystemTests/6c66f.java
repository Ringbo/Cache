diff --git a/spring-boot/src/test/java/org/springframework/boot/logging/log4j2/Log4J2LoggingSystemTests.java b/spring-boot/src/test/java/org/springframework/boot/logging/log4j2/Log4J2LoggingSystemTests.java
index 9d75c50..20c54d2 100644
--- a/spring-boot/src/test/java/org/springframework/boot/logging/log4j2/Log4J2LoggingSystemTests.java
+++ b/spring-boot/src/test/java/org/springframework/boot/logging/log4j2/Log4J2LoggingSystemTests.java
@@ -96,7 +96,7 @@
 		this.loggingSystem.initialize();
 		java.util.logging.Logger julLogger = java.util.logging.Logger
 				.getLogger(getClass().getName());
-		julLogger.info("Hello world");
+		julLogger.severe("Hello world");
 		String output = this.output.toString().trim();
 		assertTrue("Wrong output:\n" + output, output.contains("Hello world"));
 	}
