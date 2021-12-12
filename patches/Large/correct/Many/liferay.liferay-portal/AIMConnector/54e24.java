diff --git a/portal-impl/src/com/liferay/portal/im/AIMConnector.java b/portal-impl/src/com/liferay/portal/im/AIMConnector.java
index a2265cf..0009c45 100644
--- a/portal-impl/src/com/liferay/portal/im/AIMConnector.java
+++ b/portal-impl/src/com/liferay/portal/im/AIMConnector.java
@@ -67,7 +67,7 @@
 		oscar.setSN(login);
 		oscar.setPassword(password);
 
-		sess.init();
+		ses.init();
 	}
 
 	private void _disconnect() {
