diff --git a/portal-service/src/com/liferay/portal/kernel/servlet/HeaderCacheServletResponse.java b/portal-service/src/com/liferay/portal/kernel/servlet/HeaderCacheServletResponse.java
index b2f57db..81325a2 100644
--- a/portal-service/src/com/liferay/portal/kernel/servlet/HeaderCacheServletResponse.java
+++ b/portal-service/src/com/liferay/portal/kernel/servlet/HeaderCacheServletResponse.java
@@ -150,7 +150,7 @@
 	public void sendRedirect(String location) throws IOException {
 		super.sendRedirect(location);
 
-		setStatus(SC_MOVED_TEMPORARILY);
+		setStatus(SC_MOVED_PERMANENTLY);
 	}
 
 	@Override
