diff --git a/rxbinding-appcompat-v7/src/androidTest/java/com/jakewharton/rxbinding2/support/v7/widget/RxToolbarTest.java b/rxbinding-appcompat-v7/src/androidTest/java/com/jakewharton/rxbinding2/support/v7/widget/RxToolbarTest.java
index cbeb05e..145aa3e 100644
--- a/rxbinding-appcompat-v7/src/androidTest/java/com/jakewharton/rxbinding2/support/v7/widget/RxToolbarTest.java
+++ b/rxbinding-appcompat-v7/src/androidTest/java/com/jakewharton/rxbinding2/support/v7/widget/RxToolbarTest.java
@@ -59,10 +59,10 @@
     o.assertNoMoreEvents(); // No initial value.
 
     onView(withContentDescription(NAVIGATION_CONTENT_DESCRIPTION)).perform(click());
-    assertThat(o.takeNext()).isNull();
+    assertThat(o.takeNext()).isNotNull();
 
     onView(withContentDescription(NAVIGATION_CONTENT_DESCRIPTION)).perform(click());
-    assertThat(o.takeNext()).isNull();
+    assertThat(o.takeNext()).isNotNull();
 
     o.dispose();
 
