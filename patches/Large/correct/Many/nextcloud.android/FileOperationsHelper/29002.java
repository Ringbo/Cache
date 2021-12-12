diff --git a/src/com/owncloud/android/files/FileOperationsHelper.java b/src/com/owncloud/android/files/FileOperationsHelper.java
index 38ebae8..c6d3e7b 100755
--- a/src/com/owncloud/android/files/FileOperationsHelper.java
+++ b/src/com/owncloud/android/files/FileOperationsHelper.java
@@ -110,7 +110,7 @@
                 }
             }
 
-            if (br != null) {
+            if (fr != null) {
                 try {
                     fr.close();
                 } catch (IOException e) {
