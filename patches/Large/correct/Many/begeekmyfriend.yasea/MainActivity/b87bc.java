diff --git a/app/src/main/java/net/ossrs/yasea/MainActivity.java b/app/src/main/java/net/ossrs/yasea/MainActivity.java
index 61f2f23..1f5f842 100644
--- a/app/src/main/java/net/ossrs/yasea/MainActivity.java
+++ b/app/src/main/java/net/ossrs/yasea/MainActivity.java
@@ -262,10 +262,10 @@
             public void onClick(View v) {
                 if (mEncoder != null) {
                     if (btnSwitchEncoder.getText().toString().contentEquals("soft enc")) {
-                        mEncoder.swithToHardEncoder();
+                        mEncoder.swithToSoftEncoder();
                         btnSwitchEncoder.setText("hard enc");
                     } else if (btnSwitchEncoder.getText().toString().contentEquals("hard enc")) {
-                        mEncoder.swithToSoftEncoder();
+                        mEncoder.swithToHardEncoder();
                         btnSwitchEncoder.setText("soft enc");
                     }
                 }
