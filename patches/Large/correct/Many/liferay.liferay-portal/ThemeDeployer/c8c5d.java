diff --git a/portal-impl/src/com/liferay/portal/tools/deploy/ThemeDeployer.java b/portal-impl/src/com/liferay/portal/tools/deploy/ThemeDeployer.java
index 0f627d8..ec490d7 100644
--- a/portal-impl/src/com/liferay/portal/tools/deploy/ThemeDeployer.java
+++ b/portal-impl/src/com/liferay/portal/tools/deploy/ThemeDeployer.java
@@ -57,7 +57,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 	}
