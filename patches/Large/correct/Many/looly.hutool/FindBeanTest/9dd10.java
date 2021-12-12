diff --git a/hutool-db/src/test/java/cn/hutool/db/test/FindBeanTest.java b/hutool-db/src/test/java/cn/hutool/db/test/FindBeanTest.java
index fa24ab0..cfacaf6 100644
--- a/hutool-db/src/test/java/cn/hutool/db/test/FindBeanTest.java
+++ b/hutool-db/src/test/java/cn/hutool/db/test/FindBeanTest.java
@@ -30,7 +30,7 @@
 	public void findAllBeanTest() throws SQLException {
 		List<User> results = runner.findAll(Entity.create("user"), User.class);
 		
-		Assert.assertEquals(3, results.size());
+		Assert.assertEquals(4, results.size());
 		Assert.assertEquals(Integer.valueOf(1), results.get(0).getId());
 		Assert.assertEquals("张三", results.get(0).getName());
 	}
@@ -40,7 +40,7 @@
 	public void findAllListTest() throws SQLException {
 		List<List> results = runner.findAll(Entity.create("user"), List.class);
 		
-		Assert.assertEquals(3, results.size());
+		Assert.assertEquals(4, results.size());
 		Assert.assertEquals(1, results.get(0).get(0));
 		Assert.assertEquals("张三", results.get(0).get(1));
 	}
@@ -49,7 +49,7 @@
 	public void findAllArrayTest() throws SQLException {
 		List<Object[]> results = runner.findAll(Entity.create("user"), Object[].class);
 		
-		Assert.assertEquals(3, results.size());
+		Assert.assertEquals(4, results.size());
 		Assert.assertEquals(1, results.get(0)[0]);
 		Assert.assertEquals("张三", results.get(0)[1]);
 	}
@@ -57,14 +57,14 @@
 	@Test
 	public void findAllStringTest() throws SQLException {
 		List<String> results = runner.findAll(Entity.create("user"), String.class);
-		Assert.assertEquals(3, results.size());
+		Assert.assertEquals(4, results.size());
 	}
 	
 	@Test
 	public void findAllStringArrayTest() throws SQLException {
 		List<String[]> results = runner.findAll(Entity.create("user"), String[].class);
 		
-		Assert.assertEquals(3, results.size());
+		Assert.assertEquals(4, results.size());
 		Assert.assertEquals("1", results.get(0)[0]);
 		Assert.assertEquals("张三", results.get(0)[1]);
 	}
