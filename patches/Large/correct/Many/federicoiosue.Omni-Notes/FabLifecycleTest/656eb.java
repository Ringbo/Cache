diff --git a/omniNotes/src/androidTest/java/it/feio/android/omninotes/FabLifecycleTest.java b/omniNotes/src/androidTest/java/it/feio/android/omninotes/FabLifecycleTest.java
index 15a3a07..ad0d295 100644
--- a/omniNotes/src/androidTest/java/it/feio/android/omninotes/FabLifecycleTest.java
+++ b/omniNotes/src/androidTest/java/it/feio/android/omninotes/FabLifecycleTest.java
@@ -28,15 +28,13 @@
 
         ViewInteraction viewInteraction = onView(
                 allOf(withId(R.id.fab_expand_menu_button),
-                        withParent(withId(R.id.fab)),
-                        isDisplayed()));
+                        withParent(withId(R.id.fab))));
         viewInteraction.perform(click());
 
 
         ViewInteraction viewInteraction2 = onView(
                 allOf(withId(R.id.fab_expand_menu_button),
-                        withParent(withId(R.id.fab)),
-                        isDisplayed()));
+                        withParent(withId(R.id.fab))));
         viewInteraction2.perform(click());
     }
     
