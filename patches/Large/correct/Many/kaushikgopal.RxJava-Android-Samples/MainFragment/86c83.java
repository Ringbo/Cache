diff --git a/app/src/main/java/com/morihacky/android/rxjava/fragments/MainFragment.java b/app/src/main/java/com/morihacky/android/rxjava/fragments/MainFragment.java
index dd5709e..75f68fa 100644
--- a/app/src/main/java/com/morihacky/android/rxjava/fragments/MainFragment.java
+++ b/app/src/main/java/com/morihacky/android/rxjava/fragments/MainFragment.java
@@ -96,7 +96,8 @@
 
   @OnClick(R.id.btn_demo_rotation_persist)
   void demoRotationPersist() {
-    clickedOn(new RotationPersist2Fragment());
+    clickedOn(new RotationPersist3Fragment());
+    // clickedOn(new RotationPersist2Fragment());
     //clickedOn(new RotationPersist1Fragment());
   }
 
