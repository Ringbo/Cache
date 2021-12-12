diff --git a/AIMSICD/src/main/java/com/secupwn/aimsicd/ui/activities/MainActivity.java b/AIMSICD/src/main/java/com/secupwn/aimsicd/ui/activities/MainActivity.java
index a003d8b..99e45de 100644
--- a/AIMSICD/src/main/java/com/secupwn/aimsicd/ui/activities/MainActivity.java
+++ b/AIMSICD/src/main/java/com/secupwn/aimsicd/ui/activities/MainActivity.java
@@ -309,7 +309,7 @@
             TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
             String networkOperator = tm.getNetworkOperator();
 
-            if (networkOperator != null) {
+            if (networkOperator != null && !networkOperator.isEmpty()) {
                 int mcc = Integer.parseInt(networkOperator.substring(0, 3));
                 cell.setMcc(mcc);
                 int mnc = Integer.parseInt(networkOperator.substring(3));
