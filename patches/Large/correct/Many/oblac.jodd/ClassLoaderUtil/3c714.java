diff --git a/jodd-core/src/main/java/jodd/util/ClassLoaderUtil.java b/jodd-core/src/main/java/jodd/util/ClassLoaderUtil.java
index abed310..c55ed8e 100644
--- a/jodd-core/src/main/java/jodd/util/ClassLoaderUtil.java
+++ b/jodd-core/src/main/java/jodd/util/ClassLoaderUtil.java
@@ -206,7 +206,7 @@
 			URL[] urls = JavaBridge.getURLs(classLoader);
 			if (urls != null) {
 				for (URL u : urls) {
-					File f = FileUtil.toFile(u);
+					File f = FileUtil.toContainerFile(u);
 					if ((f != null) && f.exists()) {
 						try {
 							f = f.getCanonicalFile();
