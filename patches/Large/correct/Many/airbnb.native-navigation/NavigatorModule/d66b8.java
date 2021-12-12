diff --git a/lib/android/src/main/java/com/airbnb/android/react/navigation/NavigatorModule.java b/lib/android/src/main/java/com/airbnb/android/react/navigation/NavigatorModule.java
index 7bcd6a7..7738fd7 100644
--- a/lib/android/src/main/java/com/airbnb/android/react/navigation/NavigatorModule.java
+++ b/lib/android/src/main/java/com/airbnb/android/react/navigation/NavigatorModule.java
@@ -159,7 +159,7 @@
           return;
         }
         ensureCoordinatorComponent(activity);
-        ((ScreenCoordinatorComponent) activity).getScreenCoordinator().dismiss();
+        ((ScreenCoordinatorComponent) activity).getScreenCoordinator().dismiss(Activity.RESULT_OK, payloadToMap(payload));
       }
     });
   }
