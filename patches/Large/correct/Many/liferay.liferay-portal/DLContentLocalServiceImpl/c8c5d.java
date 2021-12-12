diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLContentLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLContentLocalServiceImpl.java
index 48f45e1..466a218 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLContentLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLContentLocalServiceImpl.java
@@ -93,7 +93,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 
