diff --git a/web/src/main/java/org/openmrs/web/filter/initialization/InitializationFilter.java b/web/src/main/java/org/openmrs/web/filter/initialization/InitializationFilter.java
index eea43d0..da51d64 100644
--- a/web/src/main/java/org/openmrs/web/filter/initialization/InitializationFilter.java
+++ b/web/src/main/java/org/openmrs/web/filter/initialization/InitializationFilter.java
@@ -1394,7 +1394,7 @@
 							
 							// connect via jdbc with root user and create an openmrs user
 							String host = "'%'";
-							if (wizardModel.databaseConnection.contains("localhost")) {
+							if (wizardModel.databaseConnection.contains("localhost") || wizardModel.databaseConnection.contains("127.0.0.1")) {
 								host = "'localhost'";
 							}
 							String sql = "drop user '?'@" + host;
