diff --git a/portal-service/src/com/liferay/portal/kernel/audit/AuditMessage.java b/portal-service/src/com/liferay/portal/kernel/audit/AuditMessage.java
index 08a1adc..e51a0f0a 100644
--- a/portal-service/src/com/liferay/portal/kernel/audit/AuditMessage.java
+++ b/portal-service/src/com/liferay/portal/kernel/audit/AuditMessage.java
@@ -264,7 +264,7 @@
 		jsonObj.put(_CLASS_PK, _classPK);
 		jsonObj.put(_CLASS_NAME, _className);
 		jsonObj.put(_CLIENT_IP, _clientIP);
-		jsonObj.put(_clientHost, _clientHost);
+		jsonObj.put(_CLIENT_HOST, _clientHost);
 		jsonObj.put(_MESSAGE, _message);
 		jsonObj.put(_SERVER_PORT, _serverPort);
 		jsonObj.put(_SERVER_NAME, _serverName);
