diff --git a/collect_app/src/main/java/org/odk/collect/android/tasks/InstanceUploader.java b/collect_app/src/main/java/org/odk/collect/android/tasks/InstanceUploader.java
index b314fb4..0f5a259 100644
--- a/collect_app/src/main/java/org/odk/collect/android/tasks/InstanceUploader.java
+++ b/collect_app/src/main/java/org/odk/collect/android/tasks/InstanceUploader.java
@@ -89,7 +89,7 @@
                             results =
                                     new InstancesDao().getInstancesCursor(selection.toString(),
                                             selectionArgs);
-                            if (results.getCount() > 0) {
+                            if (results != null && results.getCount() > 0) {
                                 List<Long> toDelete = new ArrayList<>();
                                 results.moveToPosition(-1);
 
