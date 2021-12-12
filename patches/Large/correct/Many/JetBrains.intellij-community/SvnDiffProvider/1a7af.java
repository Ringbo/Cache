diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnDiffProvider.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnDiffProvider.java
index 978a52b..9ec1709 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnDiffProvider.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnDiffProvider.java
@@ -152,7 +152,7 @@
                                             svnInfo.getAuthor(), message);
     }
     catch (VcsException e) {
-      LOG.debug(e);    // most likely the file is unversioned
+      LOG.info(e);    // most likely the file is unversioned
       return null;
     }
   }
