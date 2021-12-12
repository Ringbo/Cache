diff --git a/src/org/geometerplus/fbreader/library/Library.java b/src/org/geometerplus/fbreader/library/Library.java
index 7e339a8..0c8fb17 100644
--- a/src/org/geometerplus/fbreader/library/Library.java
+++ b/src/org/geometerplus/fbreader/library/Library.java
@@ -109,7 +109,7 @@
 				continue;
 			}
 			final ZLPhysicalFile physicalFile = bookFile.getPhysicalFile();
-			if (!physicalFile.exists()) {
+			if (physicalFile == null || !physicalFile.exists()) {
 				continue;
 			}
 			boolean reloadMetaInfo = false; 
