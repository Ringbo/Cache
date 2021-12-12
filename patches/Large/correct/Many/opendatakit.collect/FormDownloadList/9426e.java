diff --git a/collect_app/src/main/java/org/odk/collect/android/activities/FormDownloadList.java b/collect_app/src/main/java/org/odk/collect/android/activities/FormDownloadList.java
index 8f962f4..7bbf74f 100644
--- a/collect_app/src/main/java/org/odk/collect/android/activities/FormDownloadList.java
+++ b/collect_app/src/main/java/org/odk/collect/android/activities/FormDownloadList.java
@@ -245,7 +245,7 @@
                 }
                 mDownloadFormsTask = null;
             }
-        } else if (getLastNonConfigurationInstance() == null) {
+        } else if (mFormNamesAndURLs.isEmpty() && getLastNonConfigurationInstance() == null) {
             // first time, so get the formlist
             downloadFormList();
         }
