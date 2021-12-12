diff --git a/jps/src/org/jetbrains/ether/ProjectWrapper.java b/jps/src/org/jetbrains/ether/ProjectWrapper.java
index 6906669..f63110d 100644
--- a/jps/src/org/jetbrains/ether/ProjectWrapper.java
+++ b/jps/src/org/jetbrains/ether/ProjectWrapper.java
@@ -749,7 +749,7 @@
         final File prjFile = new File(prjDir);
         final boolean dirBased = !(prjFile.isFile() && prjDir.endsWith(".ipr"));
 
-        myRoot = dirBased ? getCanonicalPath(prjDir) : getCanonicalPath(prjFile.getPath());
+        myRoot = dirBased ? getCanonicalPath(prjDir) : getCanonicalPath(prjFile.getParent());
 
         final String loadPath = dirBased ? getAbsolutePath(myIDEADir) : prjDir;
 
