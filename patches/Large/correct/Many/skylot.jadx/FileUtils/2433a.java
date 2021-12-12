diff --git a/jadx-core/src/main/java/jadx/core/utils/files/FileUtils.java b/jadx-core/src/main/java/jadx/core/utils/files/FileUtils.java
index d117bc8..fa523eb 100644
--- a/jadx-core/src/main/java/jadx/core/utils/files/FileUtils.java
+++ b/jadx-core/src/main/java/jadx/core/utils/files/FileUtils.java
@@ -57,7 +57,7 @@
 	public static void makeDirs(@Nullable File dir) {
 		if (dir != null) {
 			synchronized (MKDIR_SYNC) {
-				if (!dir.exists() && !dir.mkdirs()) {
+				if (!dir.mkdirs() && !dir.isDirectory()) {
 					throw new JadxRuntimeException("Can't create directory " + dir);
 				}
 			}
