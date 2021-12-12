diff --git a/requery-android/example/src/main/java/io/requery/android/example/app/PeopleActivity.java b/requery-android/example/src/main/java/io/requery/android/example/app/PeopleActivity.java
index 71e28f0..1868fe5 100644
--- a/requery-android/example/src/main/java/io/requery/android/example/app/PeopleActivity.java
+++ b/requery-android/example/src/main/java/io/requery/android/example/app/PeopleActivity.java
@@ -128,7 +128,7 @@
         private final Random random = new Random();
         private final int[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA };
 
-        protected PersonAdapter() {
+        PersonAdapter() {
             super(PersonEntity.$TYPE);
         }
 
