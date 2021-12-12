diff --git a/src/org/geometerplus/fbreader/filetype/FileTypePalm.java b/src/org/geometerplus/fbreader/filetype/FileTypePalm.java
index a29b0da..82abbd8 100644
--- a/src/org/geometerplus/fbreader/filetype/FileTypePalm.java
+++ b/src/org/geometerplus/fbreader/filetype/FileTypePalm.java
@@ -25,7 +25,7 @@
 import org.geometerplus.zlibrary.core.options.ZLStringOption;
 
 abstract class FileTypePalm extends FileType {
-	private static String fileType(final ZLFile file) {
+	private static String palmFileType(final ZLFile file) {
 		// TODO: use database instead of option (?)
 		final ZLStringOption palmTypeOption = new ZLStringOption(file.getPath(), "PalmType", "");
 		String palmType = palmTypeOption.getValue();
@@ -51,7 +51,7 @@
 
 	FileTypePalm(String id, String palmId) {
 		super(id);
-		myPalmId = id;
+		myPalmId = palmId;
 	}
 
 	@Override
@@ -59,7 +59,7 @@
 		final String extension = file.getExtension();
 		return
 			("pdb".equalsIgnoreCase(extension) || "prc".equalsIgnoreCase(extension)) &&
-			myPalmId.equals(fileType(file));
+			myPalmId.equals(palmFileType(file));
 	}
 
 	@Override
