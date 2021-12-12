diff --git a/spring-batch-test/src/test/java/org/springframework/batch/test/JobRepositoryTestUtilsTests.java b/spring-batch-test/src/test/java/org/springframework/batch/test/JobRepositoryTestUtilsTests.java
index fc05652..485ee91 100644
--- a/spring-batch-test/src/test/java/org/springframework/batch/test/JobRepositoryTestUtilsTests.java
+++ b/spring-batch-test/src/test/java/org/springframework/batch/test/JobRepositoryTestUtilsTests.java
@@ -96,7 +96,7 @@
 		assertEquals(3, list.size());
 		assertEquals(beforeJobs + 3, SimpleJdbcTestUtils.countRowsInTable(jdbcTemplate, "BATCH_JOB_EXECUTION"));
 		assertEquals(beforeSteps + 6, SimpleJdbcTestUtils.countRowsInTable(jdbcTemplate, "BATCH_STEP_EXECUTION"));
-		utils.removeJobExecutions();
+		utils.removeJobExecutions(list);
 		assertEquals(beforeJobs, SimpleJdbcTestUtils.countRowsInTable(jdbcTemplate, "BATCH_JOB_EXECUTION"));
 		assertEquals(beforeSteps, SimpleJdbcTestUtils.countRowsInTable(jdbcTemplate, "BATCH_STEP_EXECUTION"));
 	}
