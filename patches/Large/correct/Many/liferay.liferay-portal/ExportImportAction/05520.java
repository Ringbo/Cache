diff --git a/portal-impl/src/com/liferay/portlet/portletconfiguration/action/ExportImportAction.java b/portal-impl/src/com/liferay/portlet/portletconfiguration/action/ExportImportAction.java
index a7f9f36..8ded18d 100644
--- a/portal-impl/src/com/liferay/portlet/portletconfiguration/action/ExportImportAction.java
+++ b/portal-impl/src/com/liferay/portlet/portletconfiguration/action/ExportImportAction.java
@@ -258,7 +258,7 @@
 				_log.debug(e, e);
 			}
 
-			SessionErrors.add(actionRequest, e.getClass().getName());
+			SessionErrors.add(actionRequest, e.getClass().getName(), e);
 		}
 	}
 
