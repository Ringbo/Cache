diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/update/UpdateRootInfo.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/update/UpdateRootInfo.java
index 0e76de3..2f433bc 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/update/UpdateRootInfo.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/update/UpdateRootInfo.java
@@ -50,7 +50,7 @@
 
   public SVNURL getUrl() {
     try {
-      return SVNURL.parseURIDecoded(myUrl);
+      return SVNURL.parseURIEncoded(myUrl);
     }
     catch (SVNException e) {
       return null;
