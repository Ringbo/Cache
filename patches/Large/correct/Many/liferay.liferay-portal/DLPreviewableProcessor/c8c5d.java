diff --git a/portal-kernel/src/com/liferay/document/library/kernel/util/DLPreviewableProcessor.java b/portal-kernel/src/com/liferay/document/library/kernel/util/DLPreviewableProcessor.java
index ac71da8..d6e4f3f 100644
--- a/portal-kernel/src/com/liferay/document/library/kernel/util/DLPreviewableProcessor.java
+++ b/portal-kernel/src/com/liferay/document/library/kernel/util/DLPreviewableProcessor.java
@@ -578,7 +578,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 	}
