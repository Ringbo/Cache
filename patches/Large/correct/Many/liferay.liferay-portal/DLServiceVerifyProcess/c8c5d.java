diff --git a/modules/apps/collaboration/document-library/document-library-service/src/main/java/com/liferay/document/library/internal/verify/DLServiceVerifyProcess.java b/modules/apps/collaboration/document-library/document-library-service/src/main/java/com/liferay/document/library/internal/verify/DLServiceVerifyProcess.java
index d1c353f..1301939 100644
--- a/modules/apps/collaboration/document-library/document-library-service/src/main/java/com/liferay/document/library/internal/verify/DLServiceVerifyProcess.java
+++ b/modules/apps/collaboration/document-library/document-library-service/src/main/java/com/liferay/document/library/internal/verify/DLServiceVerifyProcess.java
@@ -502,7 +502,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 
