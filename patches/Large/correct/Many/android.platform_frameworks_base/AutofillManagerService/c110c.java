diff --git a/services/autofill/java/com/android/server/autofill/AutofillManagerService.java b/services/autofill/java/com/android/server/autofill/AutofillManagerService.java
index f3e610e..9081746 100644
--- a/services/autofill/java/com/android/server/autofill/AutofillManagerService.java
+++ b/services/autofill/java/com/android/server/autofill/AutofillManagerService.java
@@ -213,7 +213,7 @@
                             if (!doit) {
                                 return true;
                             }
-                            handleActiveAutofillServiceRemoved(getChangingUserId());
+                            removeCachedServiceLocked(getChangingUserId());
                         }
                     }
                 }
