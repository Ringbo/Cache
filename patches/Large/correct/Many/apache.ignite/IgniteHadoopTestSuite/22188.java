diff --git a/modules/hadoop/src/test/java/org/apache/ignite/testsuites/IgniteHadoopTestSuite.java b/modules/hadoop/src/test/java/org/apache/ignite/testsuites/IgniteHadoopTestSuite.java
index ebc0c23..9b1d7a2 100644
--- a/modules/hadoop/src/test/java/org/apache/ignite/testsuites/IgniteHadoopTestSuite.java
+++ b/modules/hadoop/src/test/java/org/apache/ignite/testsuites/IgniteHadoopTestSuite.java
@@ -264,7 +264,7 @@
             X.println(appName + " distribution is invalid and it will be deleted.");
 
             if (!U.delete(home))
-                throw new IOException("Failed to delete directory: " + install.getAbsolutePath());
+                throw new IOException("Failed to delete directory: " + home.getAbsolutePath());
         }
 
         for (String url : urls) {
@@ -328,7 +328,7 @@
             catch (Exception e) {
                 e.printStackTrace();
 
-                U.delete(install);
+                U.delete(home);
             }
         }
 
