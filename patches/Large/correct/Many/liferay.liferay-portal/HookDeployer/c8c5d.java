diff --git a/portal-impl/src/com/liferay/portal/tools/deploy/HookDeployer.java b/portal-impl/src/com/liferay/portal/tools/deploy/HookDeployer.java
index 81eccca..2b90700 100644
--- a/portal-impl/src/com/liferay/portal/tools/deploy/HookDeployer.java
+++ b/portal-impl/src/com/liferay/portal/tools/deploy/HookDeployer.java
@@ -53,7 +53,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 	}
