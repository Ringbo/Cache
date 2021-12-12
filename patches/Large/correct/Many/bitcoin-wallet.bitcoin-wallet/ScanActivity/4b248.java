diff --git a/wallet/src/de/schildbach/wallet/ui/scan/ScanActivity.java b/wallet/src/de/schildbach/wallet/ui/scan/ScanActivity.java
index 033faac..a1b436a 100644
--- a/wallet/src/de/schildbach/wallet/ui/scan/ScanActivity.java
+++ b/wallet/src/de/schildbach/wallet/ui/scan/ScanActivity.java
@@ -88,7 +88,7 @@
     public static final String INTENT_EXTRA_RESULT = "result";
 
     public static void startForResult(final Activity activity, @Nullable final View clickView, final int requestCode) {
-        if (clickView != null) {
+        if (clickView != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
             final int[] clickViewLocation = new int[2];
             clickView.getLocationOnScreen(clickViewLocation);
             final Intent intent = new Intent(activity, ScanActivity.class);
