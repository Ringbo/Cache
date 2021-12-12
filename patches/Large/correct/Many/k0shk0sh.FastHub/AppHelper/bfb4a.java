diff --git a/app/src/main/java/com/fastaccess/helper/AppHelper.java b/app/src/main/java/com/fastaccess/helper/AppHelper.java
index 466b662..4a5d815 100644
--- a/app/src/main/java/com/fastaccess/helper/AppHelper.java
+++ b/app/src/main/java/com/fastaccess/helper/AppHelper.java
@@ -133,12 +133,12 @@
     public static String getDeviceName() {
         String brand = Build.BRAND;
         String model = Build.MODEL;
-        if (model.startsWith(manufacturer)) {
+        if (model.startsWith(brand)) {
             return InputHelper.capitalizeFirstLetter(model);
         } else if (isEmulator()){
             return "Android Emulator";
         }
-        return InputHelper.capitalizeFirstLetter(manufacturer) + " " + model;
+        return InputHelper.capitalizeFirstLetter(brand) + " " + model;
     }
 
     private static boolean isEmulator() {
