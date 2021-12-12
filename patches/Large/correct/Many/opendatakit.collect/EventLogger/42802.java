diff --git a/collect_app/src/main/java/org/odk/collect/android/utilities/EventLogger.java b/collect_app/src/main/java/org/odk/collect/android/utilities/EventLogger.java
index d8eb0a6..7d20f8d 100644
--- a/collect_app/src/main/java/org/odk/collect/android/utilities/EventLogger.java
+++ b/collect_app/src/main/java/org/odk/collect/android/utilities/EventLogger.java
@@ -239,7 +239,7 @@
         if (!locations.isEmpty()) {
             List<Location> locationsTemporaryList = new ArrayList<>(locations);
 
-            for (int i = locations.size() - 1; i > 0; i--) {
+            for (int i = locations.size() - 1; i >= 0; i--) {
                 if (System.currentTimeMillis() - locations.get(i).getTime() > audit.getLocationAge()) {
                     locationsTemporaryList.remove(i);
                 } else {
