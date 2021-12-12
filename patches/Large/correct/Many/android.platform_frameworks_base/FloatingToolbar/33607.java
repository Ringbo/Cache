diff --git a/core/java/com/android/internal/widget/FloatingToolbar.java b/core/java/com/android/internal/widget/FloatingToolbar.java
index 63c2e96..f70c554 100644
--- a/core/java/com/android/internal/widget/FloatingToolbar.java
+++ b/core/java/com/android/internal/widget/FloatingToolbar.java
@@ -452,7 +452,7 @@
             mLineHeight = context.getResources()
                     .getDimensionPixelSize(R.dimen.floating_toolbar_height);
             mIconTextSpacing = context.getResources()
-                    .getDimensionPixelSize(R.dimen.floating_toolbar_menu_button_side_padding);
+                    .getDimensionPixelSize(R.dimen.floating_toolbar_icon_text_spacing);
 
             // Interpolators
             mLogAccelerateInterpolator = new LogAccelerateInterpolator();
@@ -481,7 +481,7 @@
             mOverflowButton = createOverflowButton();
             mOverflowButtonSize = measure(mOverflowButton);
             mMainPanel = createMainPanel();
-            mOverflowPanelViewHelper = new OverflowPanelViewHelper(mContext);
+            mOverflowPanelViewHelper = new OverflowPanelViewHelper(mContext, mIconTextSpacing);
             mOverflowPanel = createOverflowPanel();
 
             // Animation. Need views.
@@ -1573,10 +1573,9 @@
 
             private final Context mContext;
 
-            public OverflowPanelViewHelper(Context context) {
+            public OverflowPanelViewHelper(Context context, int iconTextSpacing) {
                 mContext = Preconditions.checkNotNull(context);
-                mIconTextSpacing = context.getResources()
-                        .getDimensionPixelSize(R.dimen.floating_toolbar_menu_button_side_padding);
+                mIconTextSpacing = iconTextSpacing;
                 mSidePadding = context.getResources()
                         .getDimensionPixelSize(R.dimen.floating_toolbar_overflow_side_padding);
                 mCalculator = createMenuButton(null);
