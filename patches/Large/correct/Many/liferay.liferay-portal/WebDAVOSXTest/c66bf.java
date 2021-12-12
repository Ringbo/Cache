diff --git a/portal-impl/test/com/liferay/portal/webdav/WebDAVOSXTest.java b/portal-impl/test/com/liferay/portal/webdav/WebDAVOSXTest.java
index d607fb3..43a5d18 100644
--- a/portal-impl/test/com/liferay/portal/webdav/WebDAVOSXTest.java
+++ b/portal-impl/test/com/liferay/portal/webdav/WebDAVOSXTest.java
@@ -271,7 +271,7 @@
 					HttpServletResponse.SC_CREATED,
 					serviceCopyOrMove(Method.MOVE, orig, dest, getLock(orig)));
 
-				unlock(orig);
+				moveLock(orig, dest);
 			}
 		}
 
