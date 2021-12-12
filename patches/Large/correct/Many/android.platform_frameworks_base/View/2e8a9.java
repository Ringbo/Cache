diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index f5e259e..6ec6b9a 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -1864,7 +1864,6 @@
 
     /**
      * Default horizontal layout direction.
-     * @hide
      */
     private static final int LAYOUT_DIRECTION_DEFAULT = LAYOUT_DIRECTION_INHERIT;
 
@@ -1914,7 +1913,7 @@
     /**
      * Default text direction is inherited
      */
-    public static int TEXT_DIRECTION_DEFAULT = TEXT_DIRECTION_INHERIT;
+    private static final int TEXT_DIRECTION_DEFAULT = TEXT_DIRECTION_INHERIT;
 
     /**
      * Bit shift to get the horizontal layout direction. (bits after LAYOUT_DIRECTION_RESOLVED)
@@ -2024,7 +2023,7 @@
     /**
      * Default text alignment is inherited
      */
-    public static int TEXT_ALIGNMENT_DEFAULT = TEXT_ALIGNMENT_GRAVITY;
+    private static final int TEXT_ALIGNMENT_DEFAULT = TEXT_ALIGNMENT_GRAVITY;
 
     /**
       * Bit shift to get the horizontal layout direction. (bits after DRAG_HOVERED)
@@ -3224,7 +3223,7 @@
         mContext = context;
         mResources = context != null ? context.getResources() : null;
         mViewFlags = SOUND_EFFECTS_ENABLED | HAPTIC_FEEDBACK_ENABLED;
-        // Set layout and text direction defaults
+        // Set some flags defaults
         mPrivateFlags2 =
                 (LAYOUT_DIRECTION_DEFAULT << PFLAG2_LAYOUT_DIRECTION_MASK_SHIFT) |
                 (TEXT_DIRECTION_DEFAULT << PFLAG2_TEXT_DIRECTION_MASK_SHIFT) |
