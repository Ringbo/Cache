diff --git a/core/java/android/service/autofill/FillEventHistory.java b/core/java/android/service/autofill/FillEventHistory.java
index df62446..6e5bacf 100644
--- a/core/java/android/service/autofill/FillEventHistory.java
+++ b/core/java/android/service/autofill/FillEventHistory.java
@@ -424,7 +424,7 @@
          * @return map map whose key is the id of the manually-entered field, and value is the
          * ids of the datasets that have that value but were not selected by the user.
          */
-        @Nullable public Map<AutofillId, Set<String>> getManuallyEnteredField() {
+        @NonNull public Map<AutofillId, Set<String>> getManuallyEnteredField() {
             if (mManuallyFilledFieldIds == null || mManuallyFilledDatasetIds == null) {
                 return Collections.emptyMap();
             }
