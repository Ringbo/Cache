diff --git a/spring-batch-core/src/test/java/org/springframework/batch/core/repository/dao/JdbcStepExecutionDaoTests.java b/spring-batch-core/src/test/java/org/springframework/batch/core/repository/dao/JdbcStepExecutionDaoTests.java
index 03e7616..f548518 100644
--- a/spring-batch-core/src/test/java/org/springframework/batch/core/repository/dao/JdbcStepExecutionDaoTests.java
+++ b/spring-batch-core/src/test/java/org/springframework/batch/core/repository/dao/JdbcStepExecutionDaoTests.java
@@ -49,7 +49,7 @@
 	@Test
 	public void testTruncateExitDescription() {
 
-		StringBuffer sb = new StringBuffer();
+		StringBuilder sb = new StringBuilder();
 		for (int i = 0; i < 100; i++) {
 			sb.append("too long exit description");
 		}
