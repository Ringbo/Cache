diff --git a/rxbinding-design/src/main/java/com/jakewharton/rxbinding2/support/design/widget/SnackbarDismissesObservable.java b/rxbinding-design/src/main/java/com/jakewharton/rxbinding2/support/design/widget/SnackbarDismissesObservable.java
index ba5e95c..213eb93 100644
--- a/rxbinding-design/src/main/java/com/jakewharton/rxbinding2/support/design/widget/SnackbarDismissesObservable.java
+++ b/rxbinding-design/src/main/java/com/jakewharton/rxbinding2/support/design/widget/SnackbarDismissesObservable.java
@@ -21,7 +21,7 @@
     }
     Listener listener = new Listener(view, observer);
     observer.onSubscribe(listener);
-    view.setCallback(listener.callback);
+    view.addCallback(listener.callback);
   }
 
   final class Listener extends MainThreadDisposable {
@@ -40,7 +40,7 @@
     }
 
     @Override protected void onDispose() {
-      snackbar.setCallback(null);
+      snackbar.removeCallback(callback);
     }
   }
 }
