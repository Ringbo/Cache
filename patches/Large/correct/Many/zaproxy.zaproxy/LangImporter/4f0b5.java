diff --git a/src/org/zaproxy/zap/extension/lang/LangImporter.java b/src/org/zaproxy/zap/extension/lang/LangImporter.java
index cde7eb4..353ad11 100644
--- a/src/org/zaproxy/zap/extension/lang/LangImporter.java
+++ b/src/org/zaproxy/zap/extension/lang/LangImporter.java
@@ -104,13 +104,13 @@
 			
 		} catch (IOException e) {
 			message = MSG_FILE_NOT_FOUND;
-			logger.error(e.getMessage());
+			logger.error(e.getMessage(), e);
 		} finally {
 			if (zipFile != null) {
 				try {
 					zipFile.close();
 				} catch (IOException e) {
-					logger.error(e.getMessage());
+					logger.error(e.getMessage(), e);
 				}
 			}
 		}
