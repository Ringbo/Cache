diff --git a/plugins/git4idea/tests/git4idea/history/GitLogParserTest.java b/plugins/git4idea/tests/git4idea/history/GitLogParserTest.java
index f1f3c5e..a7fff12 100644
--- a/plugins/git4idea/tests/git4idea/history/GitLogParserTest.java
+++ b/plugins/git4idea/tests/git4idea/history/GitLogParserTest.java
@@ -188,7 +188,7 @@
     String s = myRecord.prepareOutputLine(NONE);
     List<GitLogRecord> records = myParser.parse(s);
     assertEquals("Incorrect amount of actual records: " + StringUtil.join(records, "\n"), 1, records.size());
-    assertEquals(records.get(0).getSubject(), expectedSubject);
+    assertEquals("Commit subject is incorrect", expectedSubject, records.get(0).getSubject());
   }
 
   private void doTestOneRecord(NameStatus option) throws VcsException {
