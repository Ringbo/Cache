diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index f1a3ff5..0fbb84b 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -1670,6 +1670,8 @@
      *        {@link TextView#AUTO_SIZE_TEXT_TYPE_NONE} or
      *        {@link TextView#AUTO_SIZE_TEXT_TYPE_UNIFORM}
      *
+     * @throws IllegalArgumentException if <code>autoSizeTextType</code> is none of the types above.
+     *
      * @attr ref android.R.styleable#TextView_autoSizeTextType
      *
      * @see #getAutoSizeTextType()
@@ -1731,11 +1733,8 @@
      * @see #getAutoSizeStepGranularity()
      * @see #getAutoSizeTextAvailableSizes()
      */
-    public void setAutoSizeTextTypeUniformWithConfiguration(
-            int autoSizeMinTextSize,
-            int autoSizeMaxTextSize,
-            int autoSizeStepGranularity,
-            int unit) throws IllegalArgumentException {
+    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize,
+            int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
         if (supportsAutoSizeText()) {
             final DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
             final int autoSizeMinTextSizeInPx = (int) TypedValue.applyDimension(
@@ -1772,8 +1771,7 @@
      * @see #getAutoSizeMaxTextSize()
      * @see #getAutoSizeTextAvailableSizes()
      */
-    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] presetSizes, int unit)
-            throws IllegalArgumentException {
+    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] presetSizes, int unit) {
         if (supportsAutoSizeText()) {
             final int presetSizesLength = presetSizes.length;
             if (presetSizesLength > 0) {
@@ -1897,10 +1895,8 @@
      *
      * @throws IllegalArgumentException if any of the params are invalid
      */
-    private void validateAndSetAutoSizeTextTypeUniformConfiguration(
-            int autoSizeMinTextSizeInPx,
-            int autoSizeMaxTextSizeInPx,
-            int autoSizeStepGranularityInPx) throws IllegalArgumentException {
+    private void validateAndSetAutoSizeTextTypeUniformConfiguration(int autoSizeMinTextSizeInPx,
+            int autoSizeMaxTextSizeInPx, int autoSizeStepGranularityInPx) {
         // First validate.
         if (autoSizeMinTextSizeInPx <= 0) {
             throw new IllegalArgumentException("Minimum auto-size text size ("
