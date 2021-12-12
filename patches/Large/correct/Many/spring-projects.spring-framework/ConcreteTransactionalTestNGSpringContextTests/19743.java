diff --git a/spring-test/src/test/java/org/springframework/test/context/testng/ConcreteTransactionalTestNGSpringContextTests.java b/spring-test/src/test/java/org/springframework/test/context/testng/ConcreteTransactionalTestNGSpringContextTests.java
index d9223c0..d249fc3 100644
--- a/spring-test/src/test/java/org/springframework/test/context/testng/ConcreteTransactionalTestNGSpringContextTests.java
+++ b/spring-test/src/test/java/org/springframework/test/context/testng/ConcreteTransactionalTestNGSpringContextTests.java
@@ -205,7 +205,7 @@
 	}
 
 	@Test
-	public void modifyTestDataWithinTransaction() {
+	void modifyTestDataWithinTransaction() {
 		assertInTransaction(true);
 		assertAddPerson(JANE);
 		assertAddPerson(SUE);
