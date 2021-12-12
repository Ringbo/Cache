diff --git a/app/src/main/java/com/SecUpwN/AIMSICD/activities/OpenCellIdActivity.java b/app/src/main/java/com/SecUpwN/AIMSICD/activities/OpenCellIdActivity.java
index 88462c3..37bd4be 100644
--- a/app/src/main/java/com/SecUpwN/AIMSICD/activities/OpenCellIdActivity.java
+++ b/app/src/main/java/com/SecUpwN/AIMSICD/activities/OpenCellIdActivity.java
@@ -58,7 +58,7 @@
                                 @Override
                                 public void run() {
                                     pd.dismiss();
-                                    Helpers.msgShort(OpenCellIdActivity.this,
+                                    Helpers.msgLong(OpenCellIdActivity.this,
                                             getString(R.string.ocid_api_error)
                                                     + e.getClass().getName() + " - " + e.getMessage());
                                 }
