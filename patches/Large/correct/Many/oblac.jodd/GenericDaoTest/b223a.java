diff --git a/jodd-db/src/test/java/jodd/db/oom/dao/GenericDaoTest.java b/jodd-db/src/test/java/jodd/db/oom/dao/GenericDaoTest.java
index f5e8d15..0c255c9 100644
--- a/jodd-db/src/test/java/jodd/db/oom/dao/GenericDaoTest.java
+++ b/jodd-db/src/test/java/jodd/db/oom/dao/GenericDaoTest.java
@@ -127,7 +127,7 @@
 		boyMatch = new Boy();
 		boyMatch.setName("Oleg");
 		dbBoys = dao.find(Boy.class, boyMatch);
-		assertEquals(0, dbBoys.size());		// this doesn't work since boy has girldId set to 0
+		assertEquals(1, dbBoys.size());
 
 		// correct way
 
