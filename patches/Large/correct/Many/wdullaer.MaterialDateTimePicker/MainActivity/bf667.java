diff --git a/sample/src/main/java/com/wdullaer/datetimepickerexample/MainActivity.java b/sample/src/main/java/com/wdullaer/datetimepickerexample/MainActivity.java
index f9e0f21..ebac8d4 100644
--- a/sample/src/main/java/com/wdullaer/datetimepickerexample/MainActivity.java
+++ b/sample/src/main/java/com/wdullaer/datetimepickerexample/MainActivity.java
@@ -34,7 +34,7 @@
         Fragment timePickerFragment;
         Fragment datePickerFragment;
 
-        public PickerAdapter(FragmentManager fm) {
+        PickerAdapter(FragmentManager fm) {
             super(fm);
             timePickerFragment = new TimePickerFragment();
             datePickerFragment = new DatePickerFragment();
@@ -56,7 +56,7 @@
             }
         }
 
-        public int getTitle(int position) {
+        int getTitle(int position) {
             switch(position) {
                 case 0:
                     return R.string.tab_title_time;
