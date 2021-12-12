diff --git a/portal-kernel/src/com/liferay/portal/kernel/portlet/PortletContainerUtil.java b/portal-kernel/src/com/liferay/portal/kernel/portlet/PortletContainerUtil.java
index 2a1a9a4..3b2a4d7 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/portlet/PortletContainerUtil.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/portlet/PortletContainerUtil.java
@@ -130,7 +130,7 @@
 			}
 		}
 
-		if (Validator.isNull(location)) {
+		if (Validator.isNull(location) || response.isCommitted()) {
 			return;
 		}
 
