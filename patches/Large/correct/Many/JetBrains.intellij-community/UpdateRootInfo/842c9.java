diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/update/UpdateRootInfo.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/update/UpdateRootInfo.java
index d6888bd..b2a318b 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/update/UpdateRootInfo.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/update/UpdateRootInfo.java
@@ -32,7 +32,7 @@
     myRevision = SVNRevision.HEAD;
 
     SVNInfo info = vcs.getInfo(file);
-    myUrl = info != null && info.getURL() != null ? info.getDepth().toString() : "";
+    myUrl = info != null && info.getURL() != null ? info.getURL().toString() : "";
   }
 
   public SVNURL getUrl() {
