diff --git a/lib/src/main/java/com/tbruyelle/rxpermissions/RxPermissions.java b/lib/src/main/java/com/tbruyelle/rxpermissions/RxPermissions.java
index ffa07f4..d977003 100644
--- a/lib/src/main/java/com/tbruyelle/rxpermissions/RxPermissions.java
+++ b/lib/src/main/java/com/tbruyelle/rxpermissions/RxPermissions.java
@@ -136,7 +136,7 @@
      * The method will find the pending requests and emit the response to the
      * matching observables.
      */
-    public void onRequestPermissionsResult(int requestCode,
+    void onRequestPermissionsResult(int requestCode,
                                            String permissions[], int[] grantResults) {
         for (int i = 0; i < permissions.length; i++) {
             // Find the corresponding subject
