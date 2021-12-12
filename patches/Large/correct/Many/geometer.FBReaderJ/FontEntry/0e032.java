diff --git a/src/org/geometerplus/zlibrary/core/fonts/FontEntry.java b/src/org/geometerplus/zlibrary/core/fonts/FontEntry.java
index 0e2157e..06ad6d5 100644
--- a/src/org/geometerplus/zlibrary/core/fonts/FontEntry.java
+++ b/src/org/geometerplus/zlibrary/core/fonts/FontEntry.java
@@ -85,7 +85,7 @@
 			return false;
 		}
 		final FontEntry entry = (FontEntry)other;
-		if (!Family.equals(entry.Family)) {
+		if (!MiscUtil.equals(Family, entry.Family)) {
 			return false;
 		}
 		if (myFileInfos == null) {
@@ -104,6 +104,6 @@
 
 	@Override
 	public int hashCode() {
-		return Family.hashCode();
+		return MiscUtil.hashCode(Family);
 	}
 }
