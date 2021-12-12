diff --git a/ninja-core-test/src/main/java/ninja/utils/NinjaTestBrowser.java b/ninja-core-test/src/main/java/ninja/utils/NinjaTestBrowser.java
index b4d8318..501b930 100644
--- a/ninja-core-test/src/main/java/ninja/utils/NinjaTestBrowser.java
+++ b/ninja-core-test/src/main/java/ninja/utils/NinjaTestBrowser.java
@@ -286,9 +286,8 @@
                     CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
 
             HttpPost post = new HttpPost(url);
-    
-            ByteArrayEntity entity = new ByteArrayEntity(new Gson().toJson(object).getBytes());
-
+            StringEntity entity = new StringEntity(
+                    new ObjectMapper().writeValueAsString(object), "utf-8");
             entity.setContentType("application/json; charset=utf-8");
             post.setEntity(entity);
             post.releaseConnection();
