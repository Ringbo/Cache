diff --git a/spring-batch-core/src/test/java/org/springframework/batch/core/repository/dao/JdbcJobInstanceDaoTests.java b/spring-batch-core/src/test/java/org/springframework/batch/core/repository/dao/JdbcJobInstanceDaoTests.java
index 02fa041..659dccc 100644
--- a/spring-batch-core/src/test/java/org/springframework/batch/core/repository/dao/JdbcJobInstanceDaoTests.java
+++ b/spring-batch-core/src/test/java/org/springframework/batch/core/repository/dao/JdbcJobInstanceDaoTests.java
@@ -79,7 +79,7 @@
 	public void testHexing() throws Exception {
 		MessageDigest digest = MessageDigest.getInstance("MD5");
 		byte[] bytes = digest.digest("f78spx".getBytes("UTF-8"));
-		StringBuffer output = new StringBuffer();
+		StringBuilder output = new StringBuilder();
 		for (byte bite : bytes) {
 			output.append(String.format("%02x", bite));
 		}
