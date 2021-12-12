diff --git a/portal-impl/src/com/liferay/portal/tools/deploy/BaseDeployer.java b/portal-impl/src/com/liferay/portal/tools/deploy/BaseDeployer.java
index 3855fb5..1e647e1 100644
--- a/portal-impl/src/com/liferay/portal/tools/deploy/BaseDeployer.java
+++ b/portal-impl/src/com/liferay/portal/tools/deploy/BaseDeployer.java
@@ -123,7 +123,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 	}
