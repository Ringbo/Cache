diff --git a/core/tests/coretests/src/android/widget/espresso/CustomViewActions.java b/core/tests/coretests/src/android/widget/espresso/CustomViewActions.java
index 714d8e1..daf9e78 100644
--- a/core/tests/coretests/src/android/widget/espresso/CustomViewActions.java
+++ b/core/tests/coretests/src/android/widget/espresso/CustomViewActions.java
@@ -50,7 +50,7 @@
         return actionWithAssertions(
                 new GeneralClickAction(
                         Tap.LONG,
-                        new RelativeCoordinatesProvider(hRef, vRef, hDelta, vDelta),
+                        new RelativeCoordinatesProvider(hRef, hDelta, vRef, vDelta),
                         Press.FINGER));
     }
 
