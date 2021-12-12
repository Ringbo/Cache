diff --git a/portal-impl/src/com/liferay/portal/tools/deploy/LayoutTemplateDeployer.java b/portal-impl/src/com/liferay/portal/tools/deploy/LayoutTemplateDeployer.java
index 6f37e52..3962855 100644
--- a/portal-impl/src/com/liferay/portal/tools/deploy/LayoutTemplateDeployer.java
+++ b/portal-impl/src/com/liferay/portal/tools/deploy/LayoutTemplateDeployer.java
@@ -52,7 +52,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 	}
