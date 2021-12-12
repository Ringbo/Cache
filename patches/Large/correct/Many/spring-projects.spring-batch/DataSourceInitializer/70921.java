diff --git a/spring-batch-core-tests/src/test/java/test/jdbc/datasource/DataSourceInitializer.java b/spring-batch-core-tests/src/test/java/test/jdbc/datasource/DataSourceInitializer.java
index a2dc03f..5fa3a79 100644
--- a/spring-batch-core-tests/src/test/java/test/jdbc/datasource/DataSourceInitializer.java
+++ b/spring-batch-core-tests/src/test/java/test/jdbc/datasource/DataSourceInitializer.java
@@ -137,10 +137,10 @@
 	}
 
 	private String stripComments(List<String> list) {
-		StringBuffer buffer = new StringBuffer();
+		StringBuilder buffer = new StringBuilder();
 		for (String line : list) {
 			if (!line.startsWith("//") && !line.startsWith("--")) {
-				buffer.append(line + "\n");
+				buffer.append(line).append("\n");
 			}
 		}
 		return buffer.toString();
