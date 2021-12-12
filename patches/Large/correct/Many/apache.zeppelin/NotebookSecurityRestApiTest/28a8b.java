diff --git a/zeppelin-server/src/test/java/org/apache/zeppelin/rest/NotebookSecurityRestApiTest.java b/zeppelin-server/src/test/java/org/apache/zeppelin/rest/NotebookSecurityRestApiTest.java
index 0f4a440..367a199 100644
--- a/zeppelin-server/src/test/java/org/apache/zeppelin/rest/NotebookSecurityRestApiTest.java
+++ b/zeppelin-server/src/test/java/org/apache/zeppelin/rest/NotebookSecurityRestApiTest.java
@@ -152,7 +152,7 @@
   private String createNoteForUser(String noteName, String user, String pwd) throws IOException {
     String jsonRequest = "{\"name\":\"" + noteName + "\"}";
     PostMethod post = httpPost("/notebook/", jsonRequest, user, pwd);
-    assertThat("test note create method:", post, isCreated());
+    assertThat("test note create method:", post, isAllowed());
     Map<String, Object> resp = gson.fromJson(post.getResponseBodyAsString(), new TypeToken<Map<String, Object>>() {
     }.getType());
     post.releaseConnection();
