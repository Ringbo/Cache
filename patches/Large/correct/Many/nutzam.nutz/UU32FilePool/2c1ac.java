diff --git a/src/org/nutz/filepool/UU32FilePool.java b/src/org/nutz/filepool/UU32FilePool.java
index 8c80fa9..b397358 100644
--- a/src/org/nutz/filepool/UU32FilePool.java
+++ b/src/org/nutz/filepool/UU32FilePool.java
@@ -8,10 +8,10 @@
 
 public class UU32FilePool implements FilePool {
 	
-	File root;
+	protected File root;
 	
 	public UU32FilePool(String path) {
-		this.root = Files.createDirIfNoExists(root);
+		this.root = Files.createDirIfNoExists(path);
 	}
 
 	public File createFile(String suffix) {
