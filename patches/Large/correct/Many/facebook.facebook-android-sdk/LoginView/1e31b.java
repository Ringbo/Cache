diff --git a/facebook/src/com/facebook/LoginView.java b/facebook/src/com/facebook/LoginView.java
index 930f1ff..c240408 100644
--- a/facebook/src/com/facebook/LoginView.java
+++ b/facebook/src/com/facebook/LoginView.java
@@ -245,13 +245,13 @@
                            .setCancelable(true)
                            .setPositiveButton(logout, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
-                                   openSession.close();
+                                   openSession.closeAndClearTokenInformation();
                                }
                            })
                            .setNegativeButton(cancel, null);
                     builder.create().show();
                 } else {
-                    openSession.close();
+                    openSession.closeAndClearTokenInformation();
                 }
             } else {
                 if (context instanceof Activity) {
