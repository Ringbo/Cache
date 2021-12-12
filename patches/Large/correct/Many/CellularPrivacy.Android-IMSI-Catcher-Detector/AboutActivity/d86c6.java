diff --git a/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/activities/AboutActivity.java b/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/activities/AboutActivity.java
index a4b1d30..77e08d3 100644
--- a/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/activities/AboutActivity.java
+++ b/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/activities/AboutActivity.java
@@ -98,7 +98,7 @@
         okTextView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
-                showInfoDialog(Status.NORMAL);
+                showInfoDialog(Status.OK);
             }
         });
 
@@ -171,10 +171,10 @@
                 R.string.idle,
                 R.string.detail_info_idle
         ),
-        NORMAL(
+        OK(
                 R.drawable.sense_ok,
-                R.string.normal,
-                R.string.detail_info_normal
+                R.string.ok,
+                R.string.detail_info_ok
         ),
         MEDIUM(
                 R.drawable.sense_medium,
