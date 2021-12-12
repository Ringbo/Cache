diff --git a/src/com/owncloud/android/services/OperationsService.java b/src/com/owncloud/android/services/OperationsService.java
index c6651f5..656d81d 100644
--- a/src/com/owncloud/android/services/OperationsService.java
+++ b/src/com/owncloud/android/services/OperationsService.java
@@ -499,7 +499,7 @@
                     boolean found = false;
                     while (it.hasNext()) {
                         String keySyncOperation = it.next();
-                        found = keySyncOperation.contains(targetKey);
+                        found = keySyncOperation.startsWith(targetKey);
                         if (found) {
                             keyItems.add(keySyncOperation);
                         }
