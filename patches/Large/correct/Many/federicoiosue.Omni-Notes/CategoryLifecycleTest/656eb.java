diff --git a/omniNotes/src/androidTest/java/it/feio/android/omninotes/CategoryLifecycleTest.java b/omniNotes/src/androidTest/java/it/feio/android/omninotes/CategoryLifecycleTest.java
index a8f97fe..a05159f 100644
--- a/omniNotes/src/androidTest/java/it/feio/android/omninotes/CategoryLifecycleTest.java
+++ b/omniNotes/src/androidTest/java/it/feio/android/omninotes/CategoryLifecycleTest.java
@@ -120,8 +120,7 @@
 
         ViewInteraction drawerToggle = onView(
                 allOf(withContentDescription("drawer open"),
-                        withParent(withId(R.id.toolbar)),
-                        isDisplayed()));
+                        withParent(withId(R.id.toolbar))));
         drawerToggle.perform(click());
 
         ViewInteraction categoryView = onView(allOf(withId(R.id.title), withText(categoryName)));
