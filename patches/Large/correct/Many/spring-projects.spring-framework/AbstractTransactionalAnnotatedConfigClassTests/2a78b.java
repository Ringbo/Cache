diff --git a/spring-test/src/test/java/org/springframework/test/context/junit4/spr9051/AbstractTransactionalAnnotatedConfigClassTests.java b/spring-test/src/test/java/org/springframework/test/context/junit4/spr9051/AbstractTransactionalAnnotatedConfigClassTests.java
index 54b55c8..59cef2c 100644
--- a/spring-test/src/test/java/org/springframework/test/context/junit4/spr9051/AbstractTransactionalAnnotatedConfigClassTests.java
+++ b/spring-test/src/test/java/org/springframework/test/context/junit4/spr9051/AbstractTransactionalAnnotatedConfigClassTests.java
@@ -76,7 +76,7 @@
 	}
 
 	private int countRowsInTable(String tableName) {
-		return jdbcTemplate.queryForInt("SELECT COUNT(0) FROM " + tableName);
+		return jdbcTemplate.queryForObject("SELECT COUNT(0) FROM " + tableName, Integer.class);
 	}
 
 	private int createPerson(String name) {
