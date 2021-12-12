diff --git a/zeppelin-server/src/test/java/org/apache/zeppelin/rest/ZeppelinRestApiTest.java b/zeppelin-server/src/test/java/org/apache/zeppelin/rest/ZeppelinRestApiTest.java
index 9fa6c51..e7b95e4 100644
--- a/zeppelin-server/src/test/java/org/apache/zeppelin/rest/ZeppelinRestApiTest.java
+++ b/zeppelin-server/src/test/java/org/apache/zeppelin/rest/ZeppelinRestApiTest.java
@@ -137,7 +137,7 @@
         "]}";
     PostMethod post = httpPost("/notebook/", jsonRequest);
     LOG.info("testNoteCreate \n" + post.getResponseBodyAsString());
-    assertThat("test note create method:", post, isCreated());
+    assertThat("test note create method:", post, isAllowed());
 
     Map<String, Object> resp = gson.fromJson(post.getResponseBodyAsString(), new TypeToken<Map<String, Object>>() {
     }.getType());
@@ -172,7 +172,7 @@
     String jsonRequest = "{\"name\":\"" + noteName + "\"}";
     PostMethod post = httpPost("/notebook/", jsonRequest);
     LOG.info("testNoteCreate \n" + post.getResponseBodyAsString());
-    assertThat("test note create method:", post, isCreated());
+    assertThat("test note create method:", post, isAllowed());
 
     Map<String, Object> resp = gson.fromJson(post.getResponseBodyAsString(), new TypeToken<Map<String, Object>>() {
     }.getType());
@@ -262,7 +262,7 @@
     String oldJson = getNoteContent(sourceNoteId);
     // call note post
     PostMethod importPost = httpPost("/notebook/import/", oldJson);
-    assertThat(importPost, isCreated());
+    assertThat(importPost, isAllowed());
     resp =
         gson.fromJson(importPost.getResponseBodyAsString(),
             new TypeToken<Map<String, Object>>() {}.getType());
@@ -326,7 +326,7 @@
     String jsonRequest = "{\"name\":\"" + noteName + "\"}";
     PostMethod post = httpPost("/notebook/" + sourceNoteId, jsonRequest);
     LOG.info("testNoteClone \n" + post.getResponseBodyAsString());
-    assertThat("test note clone method:", post, isCreated());
+    assertThat("test note clone method:", post, isAllowed());
 
     Map<String, Object> resp = gson.fromJson(post.getResponseBodyAsString(), new TypeToken<Map<String, Object>>() {
     }.getType());
@@ -590,7 +590,7 @@
     String jsonRequest = "{\"title\": \"title1\", \"text\": \"text1\"}";
     PostMethod post = httpPost("/notebook/" + note.getId() + "/paragraph", jsonRequest);
     LOG.info("testInsertParagraph response\n" + post.getResponseBodyAsString());
-    assertThat("Test insert method:", post, isCreated());
+    assertThat("Test insert method:", post, isAllowed());
     post.releaseConnection();
 
     Map<String, Object> resp = gson.fromJson(post.getResponseBodyAsString(), new TypeToken<Map<String, Object>>() {
@@ -613,7 +613,7 @@
     String jsonRequest2 = "{\"index\": 0, \"title\": \"title2\", \"text\": \"text2\"}";
     PostMethod post2 = httpPost("/notebook/" + note.getId() + "/paragraph", jsonRequest2);
     LOG.info("testInsertParagraph response2\n" + post2.getResponseBodyAsString());
-    assertThat("Test insert method:", post2, isCreated());
+    assertThat("Test insert method:", post2, isAllowed());
     post2.releaseConnection();
 
     Paragraph paragraphAtIdx0 = note.getParagraphs().get(0);
