diff --git a/portal-impl/src/com/liferay/portal/util/MimeTypesImpl.java b/portal-impl/src/com/liferay/portal/util/MimeTypesImpl.java
index ddf9a0d..97e29e7 100644
--- a/portal-impl/src/com/liferay/portal/util/MimeTypesImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/MimeTypesImpl.java
@@ -96,7 +96,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 
