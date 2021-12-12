diff --git a/src/test/java/com/gitblit/tests/JGitUtilsTest.java b/src/test/java/com/gitblit/tests/JGitUtilsTest.java
index f60343a..05bea91 100644
--- a/src/test/java/com/gitblit/tests/JGitUtilsTest.java
+++ b/src/test/java/com/gitblit/tests/JGitUtilsTest.java
@@ -518,7 +518,7 @@
 		// grab the commits since 2008-07-15
 		commits = JGitUtils.getRevLog(repository, null,
 				new SimpleDateFormat("yyyy-MM-dd").parse("2008-07-15"));
-		assertEquals(12, commits.size());
+		assertEquals(19, commits.size());
 		repository.close();
 	}
 
