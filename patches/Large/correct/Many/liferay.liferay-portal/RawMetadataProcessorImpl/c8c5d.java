diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/util/RawMetadataProcessorImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/util/RawMetadataProcessorImpl.java
index 2ab0d04..5fc591e 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/util/RawMetadataProcessorImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/util/RawMetadataProcessorImpl.java
@@ -158,7 +158,7 @@
 			}
 			catch (IOException ioe) {
 				if (_log.isWarnEnabled()) {
-					_log.error(ioe, ioe);
+					_log.warn(ioe, ioe);
 				}
 			}
 		}
