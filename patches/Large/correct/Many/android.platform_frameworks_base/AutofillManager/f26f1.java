diff --git a/core/java/android/view/autofill/AutofillManager.java b/core/java/android/view/autofill/AutofillManager.java
index c109297..b55734d 100644
--- a/core/java/android/view/autofill/AutofillManager.java
+++ b/core/java/android/view/autofill/AutofillManager.java
@@ -1413,7 +1413,7 @@
      */
     public boolean isAutofillUiShowing() {
         final AutofillClient client = mContext.getAutofillClient();
-        return client != null & client.autofillClientIsFillUiShowing();
+        return client != null && client.autofillClientIsFillUiShowing();
     }
 
     /** @hide */
