diff --git a/zeppelin-server/src/test/java/org/apache/zeppelin/rest/NotebookRestApiTest.java b/zeppelin-server/src/test/java/org/apache/zeppelin/rest/NotebookRestApiTest.java
index b187bfe..d69339c 100644
--- a/zeppelin-server/src/test/java/org/apache/zeppelin/rest/NotebookRestApiTest.java
+++ b/zeppelin-server/src/test/java/org/apache/zeppelin/rest/NotebookRestApiTest.java
@@ -126,7 +126,7 @@
     Note note1 = ZeppelinServer.notebook.createNote(anonymous);
     PostMethod post = httpPost("/notebook/" + note1.getId(), "");
     LOG.info("testCloneNote response\n" + post.getResponseBodyAsString());
-    assertThat(post, isCreated());
+    assertThat(post, isAllowed());
     Map<String, Object> resp = gson.fromJson(post.getResponseBodyAsString(), new TypeToken<Map<String, Object>>() {
     }.getType());
     String clonedNoteId = (String) resp.get("body");
