diff --git a/modules/apps/foundation/petra/petra-doulos/src/main/java/com/liferay/petra/doulos/processor/BaseShellDoulosRequestProcessor.java b/modules/apps/foundation/petra/petra-doulos/src/main/java/com/liferay/petra/doulos/processor/BaseShellDoulosRequestProcessor.java
index 5ff469d..5ab1d0a 100644
--- a/modules/apps/foundation/petra/petra-doulos/src/main/java/com/liferay/petra/doulos/processor/BaseShellDoulosRequestProcessor.java
+++ b/modules/apps/foundation/petra/petra-doulos/src/main/java/com/liferay/petra/doulos/processor/BaseShellDoulosRequestProcessor.java
@@ -92,7 +92,7 @@
 			JSONObject payloadJSONObject, JSONObject responseJSONObject)
 		throws Exception {
 
-		if (isValid(payloadJSONObject)) {
+		if (!isValid(payloadJSONObject)) {
 			if (_log.isInfoEnabled()) {
 				_log.info("Skip invalid payload");
 			}
