diff --git a/spring-boot/src/test/java/org/springframework/boot/logging/log4j/Log4JLoggingSystemTests.java b/spring-boot/src/test/java/org/springframework/boot/logging/log4j/Log4JLoggingSystemTests.java
index 3fca3a4..1de85df 100644
--- a/spring-boot/src/test/java/org/springframework/boot/logging/log4j/Log4JLoggingSystemTests.java
+++ b/spring-boot/src/test/java/org/springframework/boot/logging/log4j/Log4JLoggingSystemTests.java
@@ -95,7 +95,7 @@
 		this.loggingSystem.initialize();
 		java.util.logging.Logger julLogger = java.util.logging.Logger
 				.getLogger(getClass().getName());
-		julLogger.info("Hello world");
+		julLogger.severe("Hello world");
 		String output = this.output.toString().trim();
 		assertTrue("Wrong output:\n" + output, output.contains("Hello world"));
 	}
