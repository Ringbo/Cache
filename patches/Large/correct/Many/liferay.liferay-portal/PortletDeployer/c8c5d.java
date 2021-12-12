diff --git a/portal-impl/src/com/liferay/portal/tools/deploy/PortletDeployer.java b/portal-impl/src/com/liferay/portal/tools/deploy/PortletDeployer.java
index 4cf35fc..9ddf977 100644
--- a/portal-impl/src/com/liferay/portal/tools/deploy/PortletDeployer.java
+++ b/portal-impl/src/com/liferay/portal/tools/deploy/PortletDeployer.java
@@ -71,7 +71,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 	}
