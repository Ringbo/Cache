diff --git a/rxbinding-appcompat-v7/src/androidTest/java/com/jakewharton/rxbinding2/support/v7/widget/RxPopupMenuTest.java b/rxbinding-appcompat-v7/src/androidTest/java/com/jakewharton/rxbinding2/support/v7/widget/RxPopupMenuTest.java
index aaa3e1d..77af629 100644
--- a/rxbinding-appcompat-v7/src/androidTest/java/com/jakewharton/rxbinding2/support/v7/widget/RxPopupMenuTest.java
+++ b/rxbinding-appcompat-v7/src/androidTest/java/com/jakewharton/rxbinding2/support/v7/widget/RxPopupMenuTest.java
@@ -24,7 +24,7 @@
 
   private final Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
 
-  private PopupMenu view;
+  PopupMenu view;
 
   @Before public void setUp() {
     view = activityRule.getActivity().popupMenu;
