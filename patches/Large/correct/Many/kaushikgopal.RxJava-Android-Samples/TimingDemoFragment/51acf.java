diff --git a/app/src/main/java/com/morihacky/android/rxjava/fragments/TimingDemoFragment.java b/app/src/main/java/com/morihacky/android/rxjava/fragments/TimingDemoFragment.java
index cd0ae18..35a52aa 100644
--- a/app/src/main/java/com/morihacky/android/rxjava/fragments/TimingDemoFragment.java
+++ b/app/src/main/java/com/morihacky/android/rxjava/fragments/TimingDemoFragment.java
@@ -118,7 +118,7 @@
         _log(String.format("C3 [%s] --- BTN click", _getCurrentTimestamp()));
 
         _subscription2 = Observable//
-              .timer(0, 1, TimeUnit.SECONDS)//
+              .interval(0, 1, TimeUnit.SECONDS)//
               .subscribe(new Observer<Long>() {
                   @Override
                   public void onCompleted() {
