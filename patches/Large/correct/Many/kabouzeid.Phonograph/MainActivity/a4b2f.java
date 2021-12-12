diff --git a/app/src/main/java/com/kabouzeid/gramophone/ui/activities/MainActivity.java b/app/src/main/java/com/kabouzeid/gramophone/ui/activities/MainActivity.java
index 0b14aea..7ac793f 100644
--- a/app/src/main/java/com/kabouzeid/gramophone/ui/activities/MainActivity.java
+++ b/app/src/main/java/com/kabouzeid/gramophone/ui/activities/MainActivity.java
@@ -239,7 +239,7 @@
                             public void run() {
                                 showDonationDialog();
                             }
-                        }, 200);
+                        }, 300);
                         break;
                     case R.id.nav_settings:
                         new Handler().postDelayed(new Runnable() {
@@ -255,7 +255,7 @@
                             public void run() {
                                 new AboutDialog().show(getSupportFragmentManager(), "ABOUT_DIALOG");
                             }
-                        }, 200);
+                        }, 300);
                         break;
                 }
                 return true;
@@ -670,8 +670,7 @@
 
     @Override
     public void onBillingError(int errorCode, Throwable error) {
-        Toast.makeText(this, "Billing error: code = " + errorCode +
-                (error != null ? ", error: " + error.getMessage() : ""), Toast.LENGTH_SHORT).show();
+        Log.e(TAG, "Billing error: code = " + errorCode, error);
     }
 
     @Override
