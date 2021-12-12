diff --git a/pinot-common/src/main/java/com/linkedin/pinot/common/response/BrokerResponse.java b/pinot-common/src/main/java/com/linkedin/pinot/common/response/BrokerResponse.java
index 8f0829b..17ff129 100644
--- a/pinot-common/src/main/java/com/linkedin/pinot/common/response/BrokerResponse.java
+++ b/pinot-common/src/main/java/com/linkedin/pinot/common/response/BrokerResponse.java
@@ -248,7 +248,7 @@
     retJsonObject.put("exceptions", new JSONArray(_exceptions));
     JSONObject traceInfo = new JSONObject();
     for (String key : _traceInfo.keySet()) {
-      traceInfo.put(key, traceInfo.get(key));
+      traceInfo.put(key, _traceInfo.get(key));
     }
     retJsonObject.put("traceInfo", traceInfo);
     return retJsonObject;
