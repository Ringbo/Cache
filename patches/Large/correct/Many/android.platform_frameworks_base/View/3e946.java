diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index f61b652..ccae02c 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -13982,7 +13982,7 @@
                 // setFlags invocation.
                 shouldNotifyFocusableAvailable = true;
             } else {
-                if (hasFocus()) clearFocus();
+                if (isFocused()) clearFocus();
             }
         }
 
