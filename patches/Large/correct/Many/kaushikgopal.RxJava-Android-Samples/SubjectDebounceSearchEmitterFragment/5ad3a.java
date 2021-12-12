diff --git a/app/src/main/java/com/morihacky/android/rxjava/SubjectDebounceSearchEmitterFragment.java b/app/src/main/java/com/morihacky/android/rxjava/SubjectDebounceSearchEmitterFragment.java
index 5d3df99..eef363d 100644
--- a/app/src/main/java/com/morihacky/android/rxjava/SubjectDebounceSearchEmitterFragment.java
+++ b/app/src/main/java/com/morihacky/android/rxjava/SubjectDebounceSearchEmitterFragment.java
@@ -90,7 +90,7 @@
 
         _subscription = bindFragment(this,//
               textChangeObservable//
-                    .debounce(400, TimeUnit.MILLISECONDS, Schedulers.io())//
+                    .debounce(400, TimeUnit.MILLISECONDS)// default Scheduler is Computation
                     .observeOn(AndroidSchedulers.mainThread()))//
               .subscribe(_getSearchObserver());
     }
