diff --git a/portal-impl/src/com/liferay/portal/tools/deploy/WebDeployer.java b/portal-impl/src/com/liferay/portal/tools/deploy/WebDeployer.java
index 30ce11e..b140f41 100644
--- a/portal-impl/src/com/liferay/portal/tools/deploy/WebDeployer.java
+++ b/portal-impl/src/com/liferay/portal/tools/deploy/WebDeployer.java
@@ -53,7 +53,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 	}
