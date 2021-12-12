diff --git a/app/src/main/java/com/morihacky/android/rxjava/MainActivity.java b/app/src/main/java/com/morihacky/android/rxjava/MainActivity.java
index e483f15..3f8c423 100644
--- a/app/src/main/java/com/morihacky/android/rxjava/MainActivity.java
+++ b/app/src/main/java/com/morihacky/android/rxjava/MainActivity.java
@@ -20,7 +20,7 @@
         getSupportFragmentManager().beginTransaction()
                                    .addToBackStack(this.toString())
 //                                   .replace(R.id.activity_main, new MainFragment(), this.toString())
-                                   .replace(R.id.activity_main, new BehaviorSubjectSearchEmitterFragment(), this.toString())
+                                   .replace(R.id.activity_main, new SubjectSearchEmitterFragment(), this.toString())
                                    .commit();
     }
 }
