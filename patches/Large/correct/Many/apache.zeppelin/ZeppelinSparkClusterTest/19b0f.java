diff --git a/zeppelin-server/src/test/java/org/apache/zeppelin/rest/ZeppelinSparkClusterTest.java b/zeppelin-server/src/test/java/org/apache/zeppelin/rest/ZeppelinSparkClusterTest.java
index ed84caf..ec0e0bd 100644
--- a/zeppelin-server/src/test/java/org/apache/zeppelin/rest/ZeppelinSparkClusterTest.java
+++ b/zeppelin-server/src/test/java/org/apache/zeppelin/rest/ZeppelinSparkClusterTest.java
@@ -519,7 +519,7 @@
     @Test
     public void testPySparkZeppelinContextDynamicForms() throws IOException {
         Note note = ZeppelinServer.notebook.createNote(anonymous);
-        Paragraph p = note.addParagraph(AuthenticationInfo.ANONYMOUS);
+        Paragraph p = note.addNewParagraph(AuthenticationInfo.ANONYMOUS);
         note.setName("note");
         Map config = p.getConfig();
         config.put("enabled", true);
