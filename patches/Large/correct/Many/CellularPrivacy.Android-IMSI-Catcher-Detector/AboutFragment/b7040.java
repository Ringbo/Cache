diff --git a/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/fragments/AboutFragment.java b/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/fragments/AboutFragment.java
index 6fd0920..e2b1d4d 100644
--- a/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/fragments/AboutFragment.java
+++ b/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/fragments/AboutFragment.java
@@ -31,10 +31,10 @@
     private Button btncredits;
 
     @InjectView(R.id.aimsicd_version)
-    TextView versionNumber;
+    private TextView versionNumber;
 
     @InjectView(R.id.buildozer_buildnumber)
-    TextView BuildozerView;
+    private TextView BuildozerView;
 
     @Override
     public void onViewCreated(View v, Bundle savedInstanceState) {
