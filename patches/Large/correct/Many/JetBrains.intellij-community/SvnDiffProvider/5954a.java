diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnDiffProvider.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnDiffProvider.java
index c66a382..83ae2eb 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnDiffProvider.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnDiffProvider.java
@@ -44,7 +44,7 @@
       return new SvnRevisionNumber(svnStatus.getCommittedRevision());
     }
     catch (SVNException e) {
-      LOG.error(e);
+      LOG.debug(e);    // most likely the file is unversioned
       return null;
     }
   }
