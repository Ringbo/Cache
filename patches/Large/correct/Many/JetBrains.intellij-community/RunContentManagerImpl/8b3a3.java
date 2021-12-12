diff --git a/platform/lang-impl/src/com/intellij/execution/ui/RunContentManagerImpl.java b/platform/lang-impl/src/com/intellij/execution/ui/RunContentManagerImpl.java
index c25ffbe..879ee3e 100644
--- a/platform/lang-impl/src/com/intellij/execution/ui/RunContentManagerImpl.java
+++ b/platform/lang-impl/src/com/intellij/execution/ui/RunContentManagerImpl.java
@@ -311,7 +311,13 @@
         if (wasInActiveWindow) {
           window.activate(null, true, false);
         } else {
-          window.show(null);
+          // let's activate tool window, but don't move focus
+          //
+          // window.show() isn't valid here, because it will not
+          // mark the window as "last activated" windows and thus
+          // some action like navigation up/down in stactrace wont
+          // work correctly
+          window.activate(null, false, false);
         }
       }
     });
