diff --git a/portal-impl/src/com/liferay/portal/tools/deploy/ExtDeployer.java b/portal-impl/src/com/liferay/portal/tools/deploy/ExtDeployer.java
index 1787461..2258f33 100644
--- a/portal-impl/src/com/liferay/portal/tools/deploy/ExtDeployer.java
+++ b/portal-impl/src/com/liferay/portal/tools/deploy/ExtDeployer.java
@@ -53,7 +53,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 	}
