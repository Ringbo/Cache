diff --git a/portal-impl/src/com/liferay/portal/util/PortalImpl.java b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
index a9f737a..e3bcf49 100644
--- a/portal-impl/src/com/liferay/portal/util/PortalImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
@@ -5392,7 +5392,7 @@
 				}
 				else {
 					timestamp = PortalWebResourcesUtil.getPathLastModified(
-						uri, theme.getTimestamp());
+						path, theme.getTimestamp());
 				}
 			}
 
