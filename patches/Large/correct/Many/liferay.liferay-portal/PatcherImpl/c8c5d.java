diff --git a/portal-impl/src/com/liferay/portal/patcher/PatcherImpl.java b/portal-impl/src/com/liferay/portal/patcher/PatcherImpl.java
index bd3de9c..b71c066 100644
--- a/portal-impl/src/com/liferay/portal/patcher/PatcherImpl.java
+++ b/portal-impl/src/com/liferay/portal/patcher/PatcherImpl.java
@@ -271,7 +271,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 
