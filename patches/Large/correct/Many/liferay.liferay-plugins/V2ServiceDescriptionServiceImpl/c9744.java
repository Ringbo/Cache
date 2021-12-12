diff --git a/portlets/wsrp-portlet/docroot/WEB-INF/src/com/liferay/wsrp/bind/V2ServiceDescriptionServiceImpl.java b/portlets/wsrp-portlet/docroot/WEB-INF/src/com/liferay/wsrp/bind/V2ServiceDescriptionServiceImpl.java
index 03ed30a..0fc0087 100644
--- a/portlets/wsrp-portlet/docroot/WEB-INF/src/com/liferay/wsrp/bind/V2ServiceDescriptionServiceImpl.java
+++ b/portlets/wsrp-portlet/docroot/WEB-INF/src/com/liferay/wsrp/bind/V2ServiceDescriptionServiceImpl.java
@@ -87,7 +87,7 @@
 		}
 		catch (NoSuchProducerException nspe) {
 			if (_log.isWarnEnabled()) {
-				_log.warn(e.getMessage());
+				_log.warn(nspe.getMessage());
 			}
 
 			return null;
