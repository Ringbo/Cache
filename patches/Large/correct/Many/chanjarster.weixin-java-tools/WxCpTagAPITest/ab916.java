diff --git a/weixin-java-cp/src/test/java/me/chanjar/weixin/cp/api/WxCpTagAPITest.java b/weixin-java-cp/src/test/java/me/chanjar/weixin/cp/api/WxCpTagAPITest.java
index 0bb7dba..b101eeb 100644
--- a/weixin-java-cp/src/test/java/me/chanjar/weixin/cp/api/WxCpTagAPITest.java
+++ b/weixin-java-cp/src/test/java/me/chanjar/weixin/cp/api/WxCpTagAPITest.java
@@ -42,7 +42,7 @@
   public void testTagAddUsers() throws Exception {
     List<String> userIds = new ArrayList<String>();
     userIds.add(((ApiTestModule.WxXmlCpInMemoryConfigStorage)configStorage).getUserId());
-    wxService.tagAddUsers(tagId, userIds);
+    wxService.tagAddUsers(tagId, userIds, null);
   }
 
   @Test(dependsOnMethods = "testTagAddUsers")
