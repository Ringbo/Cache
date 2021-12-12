diff --git a/portal-kernel/src/com/liferay/portal/kernel/servlet/ServletResponseUtil.java b/portal-kernel/src/com/liferay/portal/kernel/servlet/ServletResponseUtil.java
index 41e39ac..f06296f 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/servlet/ServletResponseUtil.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/servlet/ServletResponseUtil.java
@@ -562,7 +562,7 @@
 				}
 				catch (IOException ioe) {
 					if (_log.isWarnEnabled()) {
-						_log.error(ioe, ioe);
+						_log.warn(ioe, ioe);
 					}
 				}
 			}
