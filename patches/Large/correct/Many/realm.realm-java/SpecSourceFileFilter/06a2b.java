diff --git a/src/main/java/com/tightdb/generator/SpecSourceFileFilter.java b/src/main/java/com/tightdb/generator/SpecSourceFileFilter.java
index f93d382..7bf2a0f 100644
--- a/src/main/java/com/tightdb/generator/SpecSourceFileFilter.java
+++ b/src/main/java/com/tightdb/generator/SpecSourceFileFilter.java
@@ -28,7 +28,7 @@
 			try {
 				source = FileUtils.readFileToString(file);
 			} catch (IOException e) {
-				logger.error("Couldn't read file: " + file);
+				logger.warn("Couldn't read file: " + file);
 				return false;
 			}
 
