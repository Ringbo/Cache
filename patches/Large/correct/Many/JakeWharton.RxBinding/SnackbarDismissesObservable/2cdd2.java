diff --git a/rxbinding-design/src/main/java/com/jakewharton/rxbinding2/support/design/widget/SnackbarDismissesObservable.java b/rxbinding-design/src/main/java/com/jakewharton/rxbinding2/support/design/widget/SnackbarDismissesObservable.java
index ba5e95c..4190279 100644
--- a/rxbinding-design/src/main/java/com/jakewharton/rxbinding2/support/design/widget/SnackbarDismissesObservable.java
+++ b/rxbinding-design/src/main/java/com/jakewharton/rxbinding2/support/design/widget/SnackbarDismissesObservable.java
@@ -26,7 +26,7 @@
 
   final class Listener extends MainThreadDisposable {
     private final Snackbar snackbar;
-    private final Callback callback;
+    final Callback callback;
 
     Listener(Snackbar snackbar, final Observer<? super Integer> observer) {
       this.snackbar = snackbar;
