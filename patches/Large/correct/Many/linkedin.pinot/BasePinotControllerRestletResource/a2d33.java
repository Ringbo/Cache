diff --git a/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/restlet/resources/BasePinotControllerRestletResource.java b/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/restlet/resources/BasePinotControllerRestletResource.java
index beae632..1e4b8c1 100644
--- a/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/restlet/resources/BasePinotControllerRestletResource.java
+++ b/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/restlet/resources/BasePinotControllerRestletResource.java
@@ -133,7 +133,7 @@
 
   protected static JSONObject getErrorMsgInJson(String errorMsg) {
     JSONObject errorMsgJson = new JSONObject();
-    errorMsgJson.put("ERROR", errorMsgJson);
+    errorMsgJson.put("ERROR", errorMsg);
     return errorMsgJson;
   }
 }
