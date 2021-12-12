diff --git a/src/org/zlibrary/core/filesystem/ZLFSManager.java b/src/org/zlibrary/core/filesystem/ZLFSManager.java
index 718047f..64c28bb 100644
--- a/src/org/zlibrary/core/filesystem/ZLFSManager.java
+++ b/src/org/zlibrary/core/filesystem/ZLFSManager.java
@@ -95,7 +95,7 @@
 	}
 	
 	public String getRootDirectoryPath() {
-		return File.listRoots().length == 1 ? File.listRoots()[0].getParent() : "";
+		return File.listRoots().length == 1 ? File.listRoots()[0].getPath() : "";
 	}
 	
 	public String getParentPath(String path) {
