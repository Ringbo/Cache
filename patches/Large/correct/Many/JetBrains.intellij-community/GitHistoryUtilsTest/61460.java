diff --git a/plugins/git4idea/tests/git4idea/history/GitHistoryUtilsTest.java b/plugins/git4idea/tests/git4idea/history/GitHistoryUtilsTest.java
index 05947f9..ac5d701 100644
--- a/plugins/git4idea/tests/git4idea/history/GitHistoryUtilsTest.java
+++ b/plugins/git4idea/tests/git4idea/history/GitHistoryUtilsTest.java
@@ -355,7 +355,7 @@
   @Test
   public void testHistory() throws Exception {
     List<VcsFileRevision> revisions = GitHistoryUtils.history(myProject, toFilePath(bfile));
-    assertEquals(revisions.size(), myRevisions.size());
+    assertEquals("Incorrect number of commits in history", myRevisions.size(), revisions.size());
     for (int i = 0; i < revisions.size(); i++) {
       assertEqualRevisions((GitFileRevision) revisions.get(i), myRevisions.get(i));
     }
