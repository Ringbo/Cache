diff --git a/zeppelin-server/src/test/java/com/nflabs/zeppelin/rest/ZeppelinRestApiTest.java b/zeppelin-server/src/test/java/com/nflabs/zeppelin/rest/ZeppelinRestApiTest.java
index 2ff0ab0..cb9a850 100644
--- a/zeppelin-server/src/test/java/com/nflabs/zeppelin/rest/ZeppelinRestApiTest.java
+++ b/zeppelin-server/src/test/java/com/nflabs/zeppelin/rest/ZeppelinRestApiTest.java
@@ -62,7 +62,7 @@
     assertThat(get, isAllowed());
     Map<String, Object> resp = gson.fromJson(get.getResponseBodyAsString(), new TypeToken<Map<String, Object>>(){}.getType());
     Map<String, Object> body = (Map<String, Object>) resp.get("body");
-    assertEquals(4, body.size());
+    assertEquals(5, body.size());
     get.releaseConnection();
   }
 
