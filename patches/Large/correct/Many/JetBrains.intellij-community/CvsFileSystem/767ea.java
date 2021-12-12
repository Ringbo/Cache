diff --git a/plugins/cvs2/smartcvs-src/org/netbeans/lib/cvsclient/file/CvsFileSystem.java b/plugins/cvs2/smartcvs-src/org/netbeans/lib/cvsclient/file/CvsFileSystem.java
index ad412a4..b31353b 100644
--- a/plugins/cvs2/smartcvs-src/org/netbeans/lib/cvsclient/file/CvsFileSystem.java
+++ b/plugins/cvs2/smartcvs-src/org/netbeans/lib/cvsclient/file/CvsFileSystem.java
@@ -83,7 +83,7 @@
             }
             return relativeRepositoryPath;
           } else {
-            return repository;
+            return repositoryPath;
           }
         }
 
