diff --git a/modules/jdbc/src/main/java/org/testcontainers/jdbc/ext/ScriptUtils.java b/modules/jdbc/src/main/java/org/testcontainers/jdbc/ext/ScriptUtils.java
index 1d7a12f..286ea32 100644
--- a/modules/jdbc/src/main/java/org/testcontainers/jdbc/ext/ScriptUtils.java
+++ b/modules/jdbc/src/main/java/org/testcontainers/jdbc/ext/ScriptUtils.java
@@ -246,7 +246,7 @@
 
 		try {
 			if (LOGGER.isInfoEnabled()) {
-				LOGGER.info("Executing SQL script from " + script);
+				LOGGER.info("Executing SQL script from " + scriptPath);
 			}
 
 			long startTime = System.currentTimeMillis();
