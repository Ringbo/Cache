diff --git a/core/java/android/accessibilityservice/AccessibilityServiceInfo.java b/core/java/android/accessibilityservice/AccessibilityServiceInfo.java
index 5937dd9..b2c2800 100644
--- a/core/java/android/accessibilityservice/AccessibilityServiceInfo.java
+++ b/core/java/android/accessibilityservice/AccessibilityServiceInfo.java
@@ -693,9 +693,10 @@
      *    <strong>Statically set from
      *    {@link AccessibilityService#SERVICE_META_DATA meta-data}.</strong>
      * </p>
-     * @return The localized summary.
+     * @return The localized summary if available, and {@code null} if a summary
+     * has not been provided.
      */
-    public String loadSummary(PackageManager packageManager) {
+    public CharSequence loadSummary(PackageManager packageManager) {
         if (mSummaryResId == 0) {
             return mNonLocalizedSummary;
         }
