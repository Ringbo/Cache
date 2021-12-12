diff --git a/app/src/main/java/com/morihacky/android/rxjava/MainFragment.java b/app/src/main/java/com/morihacky/android/rxjava/MainFragment.java
index b366e1c..00e9469 100644
--- a/app/src/main/java/com/morihacky/android/rxjava/MainFragment.java
+++ b/app/src/main/java/com/morihacky/android/rxjava/MainFragment.java
@@ -52,7 +52,7 @@
                      .beginTransaction()
                      .addToBackStack(this.toString())
                      .replace(R.id.activity_main,
-                              new BehaviorSubjectSearchEmitterFragment(),
+                              new SubjectSearchEmitterFragment(),
                               this.toString())
                      .commit();
     }
