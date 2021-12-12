diff --git a/app/src/main/java/com/morihacky/android/rxjava/fragments/PseudoCacheConcatFragment.java b/app/src/main/java/com/morihacky/android/rxjava/fragments/PseudoCacheConcatFragment.java
index b895e0c..98972ed 100644
--- a/app/src/main/java/com/morihacky/android/rxjava/fragments/PseudoCacheConcatFragment.java
+++ b/app/src/main/java/com/morihacky/android/rxjava/fragments/PseudoCacheConcatFragment.java
@@ -57,7 +57,7 @@
         _resultList.setAdapter(_adapter);
         _initializeCache();
 
-        Observable.concat(_getCachedData(), _getFreshData())
+        Observable.concatEager(_getCachedData(), _getFreshData())
               .subscribeOn(Schedulers.io())
               .observeOn(AndroidSchedulers.mainThread())
               .subscribe(new Subscriber<Contributor>() {
