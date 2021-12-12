diff --git a/osmdroid-android-it/src/main/java/org/osmdroid/test/ExtraSamplesTest.java b/osmdroid-android-it/src/main/java/org/osmdroid/test/ExtraSamplesTest.java
index b5a56cf..7c655cb 100644
--- a/osmdroid-android-it/src/main/java/org/osmdroid/test/ExtraSamplesTest.java
+++ b/osmdroid-android-it/src/main/java/org/osmdroid/test/ExtraSamplesTest.java
@@ -38,7 +38,7 @@
         SampleFactory sampleFactory = SampleFactory.getInstance();
         for (int i = 0; i < sampleFactory.count(); i++) {
             try {
-                fm.beginTransaction().hide(samples).add(android.R.id.content, sampleFactory.getSample(i), "SampleFragment")
+                fm.beginTransaction().remove(samples).add(android.R.id.content, sampleFactory.getSample(i), "SampleFragment")
                         .addToBackStack(null).commit();
                 //this sleep is here to give the fragment enough time to start up and do something
                 try {
