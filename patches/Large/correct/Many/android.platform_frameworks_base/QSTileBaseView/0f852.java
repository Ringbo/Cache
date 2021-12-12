diff --git a/packages/SystemUI/src/com/android/systemui/qs/QSTileBaseView.java b/packages/SystemUI/src/com/android/systemui/qs/QSTileBaseView.java
index f05aa3c..feacaa0 100644
--- a/packages/SystemUI/src/com/android/systemui/qs/QSTileBaseView.java
+++ b/packages/SystemUI/src/com/android/systemui/qs/QSTileBaseView.java
@@ -154,9 +154,9 @@
             event.setClassName(mAccessibilityClass);
             if (Switch.class.getName().equals(mAccessibilityClass)) {
                 String label = getResources()
-                        .getString(mTileState ? R.string.switch_bar_on : R.string.switch_bar_off);
+                        .getString(!mTileState ? R.string.switch_bar_on : R.string.switch_bar_off);
                 event.setContentDescription(label);
-                event.setChecked(mTileState);
+                event.setChecked(!mTileState);
             }
         }
     }
