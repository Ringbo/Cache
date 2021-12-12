diff --git a/core/java/android/app/Notification.java b/core/java/android/app/Notification.java
index ab0b68d..5b74e23 100644
--- a/core/java/android/app/Notification.java
+++ b/core/java/android/app/Notification.java
@@ -1285,7 +1285,7 @@
                 ArrayList<RemoteInput> dataOnlyInputs = new ArrayList<>();
                 RemoteInput[] previousDataInputs =
                     (RemoteInput[]) mExtras.getParcelableArray(EXTRA_DATA_ONLY_INPUTS);
-                if (previousDataInputs == null) {
+                if (previousDataInputs != null) {
                     for (RemoteInput input : previousDataInputs) {
                         dataOnlyInputs.add(input);
                     }
