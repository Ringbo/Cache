diff --git a/src/org/geometerplus/fbreader/filetype/FileTypeMobipocket.java b/src/org/geometerplus/fbreader/filetype/FileTypeMobipocket.java
index cd70210..7aa7d3d 100644
--- a/src/org/geometerplus/fbreader/filetype/FileTypeMobipocket.java
+++ b/src/org/geometerplus/fbreader/filetype/FileTypeMobipocket.java
@@ -29,7 +29,7 @@
 
 	@Override
 	public boolean acceptsFile(ZLFile file) {
-		return "mobi".equals(file.getExtension()) || super.acceptsFile(file);
+		return "mobi".equalsIgnoreCase(file.getExtension()) || super.acceptsFile(file);
 	}
 
 	@Override
