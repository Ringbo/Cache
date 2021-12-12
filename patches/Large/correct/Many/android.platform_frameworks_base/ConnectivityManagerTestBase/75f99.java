diff --git a/core/tests/ConnectivityManagerTest/src/com/android/connectivitymanagertest/ConnectivityManagerTestBase.java b/core/tests/ConnectivityManagerTest/src/com/android/connectivitymanagertest/ConnectivityManagerTestBase.java
index a35a8ee..0f9d8e9 100644
--- a/core/tests/ConnectivityManagerTest/src/com/android/connectivitymanagertest/ConnectivityManagerTestBase.java
+++ b/core/tests/ConnectivityManagerTest/src/com/android/connectivitymanagertest/ConnectivityManagerTestBase.java
@@ -520,7 +520,7 @@
      * @param length required length of the string
      * @return
      */
-    protected boolean isHex(String input, int length) {
+    protected static boolean isHex(String input, int length) {
         Pattern p = Pattern.compile(String.format("[0-9A-Fa-f]{%d}", length));
         return p.matcher(input).matches();
     }
