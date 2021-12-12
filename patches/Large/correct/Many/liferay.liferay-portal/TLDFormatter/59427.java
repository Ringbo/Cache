diff --git a/portal-impl/src/com/liferay/portal/tools/TLDFormatter.java b/portal-impl/src/com/liferay/portal/tools/TLDFormatter.java
index 2f53048..2da94c2 100644
--- a/portal-impl/src/com/liferay/portal/tools/TLDFormatter.java
+++ b/portal-impl/src/com/liferay/portal/tools/TLDFormatter.java
@@ -60,7 +60,7 @@
 			return;
 		}
 
-		List<File> list = new ArrayList<File>();
+		List<String> list = new ArrayList<String>();
 
 		DirectoryScanner ds = new DirectoryScanner();
 
