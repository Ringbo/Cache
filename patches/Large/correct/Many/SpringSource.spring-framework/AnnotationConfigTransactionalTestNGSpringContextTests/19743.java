diff --git a/spring-test/src/test/java/org/springframework/test/context/testng/AnnotationConfigTransactionalTestNGSpringContextTests.java b/spring-test/src/test/java/org/springframework/test/context/testng/AnnotationConfigTransactionalTestNGSpringContextTests.java
index df4dca6..6c51502 100644
--- a/spring-test/src/test/java/org/springframework/test/context/testng/AnnotationConfigTransactionalTestNGSpringContextTests.java
+++ b/spring-test/src/test/java/org/springframework/test/context/testng/AnnotationConfigTransactionalTestNGSpringContextTests.java
@@ -135,7 +135,7 @@
 	}
 
 	@Test
-	public void modifyTestDataWithinTransaction() {
+	void modifyTestDataWithinTransaction() {
 		assertInTransaction(true);
 		assertAddPerson(JANE);
 		assertAddPerson(SUE);
