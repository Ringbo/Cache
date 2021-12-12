diff --git a/shared/sync-engine-shared/src/com/liferay/sync/engine/documentlibrary/event/BaseEvent.java b/shared/sync-engine-shared/src/com/liferay/sync/engine/documentlibrary/event/BaseEvent.java
index 69d519d..f36ca20 100644
--- a/shared/sync-engine-shared/src/com/liferay/sync/engine/documentlibrary/event/BaseEvent.java
+++ b/shared/sync-engine-shared/src/com/liferay/sync/engine/documentlibrary/event/BaseEvent.java
@@ -60,7 +60,7 @@
 
 		Session session = SessionManager.getSession(_syncAccountId);
 
-		return session.executePost(urlPath, _parameters, responseHandler);
+		return session.executePost(urlPath, parameters, responseHandler);
 	}
 
 	@Override
