diff --git a/spring-jdbc/src/main/java/org/springframework/jdbc/support/DatabaseStartupValidator.java b/spring-jdbc/src/main/java/org/springframework/jdbc/support/DatabaseStartupValidator.java
index 40ad9dc..78e3f98 100644
--- a/spring-jdbc/src/main/java/org/springframework/jdbc/support/DatabaseStartupValidator.java
+++ b/spring-jdbc/src/main/java/org/springframework/jdbc/support/DatabaseStartupValidator.java
@@ -135,7 +135,7 @@
 					if (logger.isDebugEnabled()) {
 						logger.debug("Validation query [" + this.validationQuery + "] threw exception", ex);
 					}
-					if (logger.isWarnEnabled()) {
+					if (logger.isInfoEnabled()) {
 						float rest = ((float) (deadLine - System.currentTimeMillis())) / 1000;
 						if (rest > this.interval) {
 							logger.info("Database has not started up yet - retrying in " + this.interval +
