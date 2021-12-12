diff --git a/app/src/main/java/com/kickstarter/libs/ViewModel.java b/app/src/main/java/com/kickstarter/libs/ViewModel.java
index 4f00fd7..a82b6ba 100644
--- a/app/src/main/java/com/kickstarter/libs/ViewModel.java
+++ b/app/src/main/java/com/kickstarter/libs/ViewModel.java
@@ -134,7 +134,7 @@
    */
   public @NonNull <T> Observable.Transformer<T, T> bindToLifecycle() {
     return source -> source.takeUntil(
-      view.flatMap(v -> v.lifecycle().map(e -> Pair.create(v, e)))
+      view.switchMap(v -> v.lifecycle().map(e -> Pair.create(v, e)))
         .filter(ve -> isFinished(ve.first, ve.second))
     );
   }
