diff --git a/src/main/java/com/tightdb/generator/AbstractAnnotationProcessor.java b/src/main/java/com/tightdb/generator/AbstractAnnotationProcessor.java
index 83f0bba..e5a196f 100644
--- a/src/main/java/com/tightdb/generator/AbstractAnnotationProcessor.java
+++ b/src/main/java/com/tightdb/generator/AbstractAnnotationProcessor.java
@@ -98,13 +98,13 @@
 			writer = fileRes.openWriter();
 			writer.write(content);
 		} catch (IOException e) {
-			logger.error("Couldn't write to file: " + filename);
+			logger.warn("Couldn't write to file: " + filename);
 		} finally {
 			if (writer != null) {
 				try {
 					writer.close();
 				} catch (IOException e) {
-					logger.error("Couldn't write to file: " + filename);
+					logger.warn("Couldn't write to file: " + filename);
 				}
 			}
 		}
