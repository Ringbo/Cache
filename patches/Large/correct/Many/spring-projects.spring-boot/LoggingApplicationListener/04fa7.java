diff --git a/spring-boot/src/main/java/org/springframework/boot/logging/LoggingApplicationListener.java b/spring-boot/src/main/java/org/springframework/boot/logging/LoggingApplicationListener.java
index d2e7760..5bee1ba 100644
--- a/spring-boot/src/main/java/org/springframework/boot/logging/LoggingApplicationListener.java
+++ b/spring-boot/src/main/java/org/springframework/boot/logging/LoggingApplicationListener.java
@@ -337,7 +337,7 @@
 			Runnable shutdownHandler = loggingSystem.getShutdownHandler();
 			if (shutdownHandler != null
 					&& shutdownHookRegistered.compareAndSet(false, true)) {
-				Runtime.getRuntime().addShutdownHook(new Thread());
+				Runtime.getRuntime().addShutdownHook(new Thread(shutdownHandler));
 			}
 		}
 	}
