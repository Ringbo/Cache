diff --git a/portal-kernel/src/com/liferay/portal/kernel/util/TempFileEntryUtil.java b/portal-kernel/src/com/liferay/portal/kernel/util/TempFileEntryUtil.java
index 2b0a676..1532a20 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/util/TempFileEntryUtil.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/util/TempFileEntryUtil.java
@@ -75,7 +75,7 @@
 			}
 			catch (IOException ioe) {
 				if (_log.isWarnEnabled()) {
-					_log.error(ioe, ioe);
+					_log.warn(ioe, ioe);
 				}
 			}
 		}
