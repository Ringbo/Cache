diff --git a/examples/quickstart/src/test/java/org/springside/examples/quickstart/repository/TaskDaoTest.java b/examples/quickstart/src/test/java/org/springside/examples/quickstart/repository/TaskDaoTest.java
index 317e966..ba7a995 100644
--- a/examples/quickstart/src/test/java/org/springside/examples/quickstart/repository/TaskDaoTest.java
+++ b/examples/quickstart/src/test/java/org/springside/examples/quickstart/repository/TaskDaoTest.java
@@ -20,7 +20,7 @@
 
 	@Test
 	public void findTasksByUserId() throws Exception {
-		List<Task> tasks = taskDao.findByUserId(1L, new Sort(Direction.ASC, "id"));
+		List<Task> tasks = taskDao.findByUserId(2L, new Sort(Direction.ASC, "id"));
 		assertEquals(5, tasks.size());
 		assertEquals(new Long(1), tasks.get(0).getId());
 
