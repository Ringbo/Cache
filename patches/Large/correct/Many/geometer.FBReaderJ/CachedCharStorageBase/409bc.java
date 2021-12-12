diff --git a/src/org/geometerplus/zlibrary/text/model/CachedCharStorageBase.java b/src/org/geometerplus/zlibrary/text/model/CachedCharStorageBase.java
index 9eea9cf..23b8044 100644
--- a/src/org/geometerplus/zlibrary/text/model/CachedCharStorageBase.java
+++ b/src/org/geometerplus/zlibrary/text/model/CachedCharStorageBase.java
@@ -44,7 +44,7 @@
 	}
 
 	public char[] block(int index) {
-		if (index < 0 && index >= myArray.size()) {
+		if (index < 0 || index >= myArray.size()) {
 			return null;
 		}
 		char[] block = myArray.get(index).get();
