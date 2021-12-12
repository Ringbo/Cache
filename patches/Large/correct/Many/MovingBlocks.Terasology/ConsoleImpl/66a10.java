diff --git a/engine/src/main/java/org/terasology/logic/console/ConsoleImpl.java b/engine/src/main/java/org/terasology/logic/console/ConsoleImpl.java
index dbcd600..31ad501 100644
--- a/engine/src/main/java/org/terasology/logic/console/ConsoleImpl.java
+++ b/engine/src/main/java/org/terasology/logic/console/ConsoleImpl.java
@@ -241,7 +241,7 @@
                 Throwable cause = e.getCause();
                 String causeMessage = cause.getLocalizedMessage();
 
-                logger.trace("An error occurred while executing a command: ", e);
+                logger.error("An error occurred while executing a command: ", e);
 
                 if (Strings.isNullOrEmpty(causeMessage)) {
                     causeMessage = cause.toString();
