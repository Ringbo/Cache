diff --git a/hutool-db/src/test/java/cn/hutool/db/test/CRUDTest.java b/hutool-db/src/test/java/cn/hutool/db/test/CRUDTest.java
index 51add39..fc67185 100644
--- a/hutool-db/src/test/java/cn/hutool/db/test/CRUDTest.java
+++ b/hutool-db/src/test/java/cn/hutool/db/test/CRUDTest.java
@@ -98,7 +98,7 @@
 	@Test
 	public void findAllTest() throws SQLException {
 		List<Entity> results = runner.findAll("user");
-		Assert.assertEquals(3, results.size());
+		Assert.assertEquals(4, results.size());
 	}
 
 	@Test
