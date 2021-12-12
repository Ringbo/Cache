diff --git a/services/autofill/java/com/android/server/autofill/ViewState.java b/services/autofill/java/com/android/server/autofill/ViewState.java
index 3aba723..20def0c 100644
--- a/services/autofill/java/com/android/server/autofill/ViewState.java
+++ b/services/autofill/java/com/android/server/autofill/ViewState.java
@@ -156,7 +156,7 @@
         }
         // Then checks if the session has a response waiting authentication; if so, uses it instead.
         final FillResponse currentResponse = mSession.getCurrentResponse();
-        if (currentResponse.getAuthentication() != null) {
+        if (currentResponse != null && currentResponse.getAuthentication() != null) {
             mListener.onFillReady(currentResponse, this.id, mCurrentValue);
         }
     }
