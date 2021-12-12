diff --git a/services/autofill/java/com/android/server/autofill/Session.java b/services/autofill/java/com/android/server/autofill/Session.java
index 67b5282..0b1381e 100644
--- a/services/autofill/java/com/android/server/autofill/Session.java
+++ b/services/autofill/java/com/android/server/autofill/Session.java
@@ -586,7 +586,7 @@
                 }
                 viewState = new ViewState(this, id, value, this, ViewState.STATE_INITIAL);
                 mViewStates.put(id, viewState);
-            } else if ((flags & FLAG_VIEW_ENTERED) != 0) {
+            } else if (mStructure != null && (flags & FLAG_VIEW_ENTERED) != 0) {
                 viewState = startPartitionLocked(id, value);
             } else {
                 if (VERBOSE) Slog.v(TAG, "Ignored " + getFlagAsString(flags) + " for " + id);
