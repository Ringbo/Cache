diff --git a/modules/util/source-formatter/src/test/java/com/liferay/source/formatter/JavaSourceProcessorTest.java b/modules/util/source-formatter/src/test/java/com/liferay/source/formatter/JavaSourceProcessorTest.java
index fa1710d..8292bc0 100644
--- a/modules/util/source-formatter/src/test/java/com/liferay/source/formatter/JavaSourceProcessorTest.java
+++ b/modules/util/source-formatter/src/test/java/com/liferay/source/formatter/JavaSourceProcessorTest.java
@@ -259,7 +259,7 @@
 
 	@Test
 	public void testMissingAuthor() throws Exception {
-		test("MissingAuthor.testjava", "Missing author");
+		test("MissingAuthor.testjava", "Missing author", 20);
 	}
 
 	@Test
