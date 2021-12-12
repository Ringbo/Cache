diff --git a/portal-kernel/src/com/liferay/portal/kernel/portlet/PortletResponseUtil.java b/portal-kernel/src/com/liferay/portal/kernel/portlet/PortletResponseUtil.java
index 5ef4cb4..5869789 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/portlet/PortletResponseUtil.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/portlet/PortletResponseUtil.java
@@ -225,7 +225,7 @@
 				}
 				catch (IOException ioe) {
 					if (_log.isWarnEnabled()) {
-						_log.error(ioe, ioe);
+						_log.warn(ioe, ioe);
 					}
 				}
 			}
