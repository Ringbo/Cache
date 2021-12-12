diff --git a/archetypes/simple-cli/src/main/java/test/jdbc/datasource/DataSourceInitializer.java b/archetypes/simple-cli/src/main/java/test/jdbc/datasource/DataSourceInitializer.java
index ccfdef8..e8641d7 100644
--- a/archetypes/simple-cli/src/main/java/test/jdbc/datasource/DataSourceInitializer.java
+++ b/archetypes/simple-cli/src/main/java/test/jdbc/datasource/DataSourceInitializer.java
@@ -89,7 +89,7 @@
 	public void destroy() {
 		if (destroyScripts==null) return;
 		for (int i = 0; i < destroyScripts.length; i++) {
-			Resource destroyScript = initScripts[i];
+			Resource destroyScript = destroyScripts[i];
 			try {
 				doExecuteScript(destroyScript);
 			}
