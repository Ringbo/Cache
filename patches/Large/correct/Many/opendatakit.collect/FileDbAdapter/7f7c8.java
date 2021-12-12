diff --git a/src/org/odk/collect/android/database/FileDbAdapter.java b/src/org/odk/collect/android/database/FileDbAdapter.java
index 2f18c78..e496ccd 100644
--- a/src/org/odk/collect/android/database/FileDbAdapter.java
+++ b/src/org/odk/collect/android/database/FileDbAdapter.java
@@ -542,7 +542,7 @@
                     }
                     // find xml file in folder and delete folder
                     fis = fo.list(ff);
-                    if (fis != null) {
+                    if (fis != null && fis.length > 0) {
                         c = fetchFilesByPath(instancePath + "/" + fo.list(ff)[0], null);
                         
                             File dir = new File(instancePath);
