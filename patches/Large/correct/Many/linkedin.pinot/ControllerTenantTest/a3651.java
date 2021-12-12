diff --git a/pinot-controller/src/test/java/com/linkedin/pinot/controller/helix/ControllerTenantTest.java b/pinot-controller/src/test/java/com/linkedin/pinot/controller/helix/ControllerTenantTest.java
index 109dc09..d070c5b 100644
--- a/pinot-controller/src/test/java/com/linkedin/pinot/controller/helix/ControllerTenantTest.java
+++ b/pinot-controller/src/test/java/com/linkedin/pinot/controller/helix/ControllerTenantTest.java
@@ -285,7 +285,7 @@
     System.out.println("**************");
     System.out.println(res);
     JSONObject resJsonObject = new JSONObject(res);
-    Assert.assertEquals(resJsonObject.getJSONArray("SERVER_TENANTS").length(), 8);
+    Assert.assertEquals(resJsonObject.getJSONArray("SERVER_TENANTS").length(), 4);
     for (int i = 0; i < 4; i++) {
       String serverTag = "serverTag_" + i;
       res = sendGetRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forServerTenantGet(serverTag));
