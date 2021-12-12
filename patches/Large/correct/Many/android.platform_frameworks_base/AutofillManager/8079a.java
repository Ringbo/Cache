diff --git a/core/java/android/view/autofill/AutofillManager.java b/core/java/android/view/autofill/AutofillManager.java
index 8ed0762..9b8fe12 100644
--- a/core/java/android/view/autofill/AutofillManager.java
+++ b/core/java/android/view/autofill/AutofillManager.java
@@ -1143,7 +1143,7 @@
                     }
 
                     if (isVisible) {
-                        mVisibleTrackedIds = addToSet(mInvisibleTrackedIds, id);
+                        mVisibleTrackedIds = addToSet(mVisibleTrackedIds, id);
                     } else {
                         mInvisibleTrackedIds = addToSet(mInvisibleTrackedIds, id);
                     }
