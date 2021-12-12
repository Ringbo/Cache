diff --git a/weixin-java-cp/src/main/java/me/chanjar/weixin/cp/util/json/WxCpMessageGsonAdapter.java b/weixin-java-cp/src/main/java/me/chanjar/weixin/cp/util/json/WxCpMessageGsonAdapter.java
index 4b2e1f4..9c262a3 100644
--- a/weixin-java-cp/src/main/java/me/chanjar/weixin/cp/util/json/WxCpMessageGsonAdapter.java
+++ b/weixin-java-cp/src/main/java/me/chanjar/weixin/cp/util/json/WxCpMessageGsonAdapter.java
@@ -34,7 +34,7 @@
       messageJson.addProperty("toparty", message.getToParty());
     }
     if (StringUtils.isNotBlank(message.getToTag())) {
-      messageJson.addProperty("totag", message.getToUser());
+      messageJson.addProperty("totag", message.getToTag());
     }
     if (WxConsts.CUSTOM_MSG_TEXT.equals(message.getMsgType())) {
       JsonObject text = new JsonObject();
