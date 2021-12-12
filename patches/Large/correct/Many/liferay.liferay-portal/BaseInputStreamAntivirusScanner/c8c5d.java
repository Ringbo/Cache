diff --git a/portal-kernel/src/com/liferay/document/library/kernel/antivirus/BaseInputStreamAntivirusScanner.java b/portal-kernel/src/com/liferay/document/library/kernel/antivirus/BaseInputStreamAntivirusScanner.java
index 69388b7..653bc58 100644
--- a/portal-kernel/src/com/liferay/document/library/kernel/antivirus/BaseInputStreamAntivirusScanner.java
+++ b/portal-kernel/src/com/liferay/document/library/kernel/antivirus/BaseInputStreamAntivirusScanner.java
@@ -45,7 +45,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 	}
