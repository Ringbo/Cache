diff --git a/app/src/withGPlay/java/org/horaapps/leafpic/activities/DonateActivity.java b/app/src/withGPlay/java/org/horaapps/leafpic/activities/DonateActivity.java
index 20aa19f..9aa57a4 100644
--- a/app/src/withGPlay/java/org/horaapps/leafpic/activities/DonateActivity.java
+++ b/app/src/withGPlay/java/org/horaapps/leafpic/activities/DonateActivity.java
@@ -93,7 +93,7 @@
     }
 
     public static void startActivity(@NonNull Context context) {
-        context.startActivity(new Intent(context, SettingsActivity.class));
+        context.startActivity(new Intent(context, DonateActivity.class));
     }
 
     private void initUi(){
