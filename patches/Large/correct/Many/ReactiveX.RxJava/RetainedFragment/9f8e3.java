diff --git a/rxjava-contrib/rxjava-android-samples/samples/src/main/java/com/netflix/rxjava/android/samples/RetainedFragment.java b/rxjava-contrib/rxjava-android-samples/samples/src/main/java/com/netflix/rxjava/android/samples/RetainedFragment.java
index a3a0c73..0db00e3 100644
--- a/rxjava-contrib/rxjava-android-samples/samples/src/main/java/com/netflix/rxjava/android/samples/RetainedFragment.java
+++ b/rxjava-contrib/rxjava-android-samples/samples/src/main/java/com/netflix/rxjava/android/samples/RetainedFragment.java
@@ -36,7 +36,7 @@
     public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
 
-        strings = SampleObservables.numberStrings2().cache();
+        strings = SampleObservables.numberStrings().cache();
     }
 
     @Override
