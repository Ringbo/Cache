diff --git a/collect_app/src/test/java/org/odk/collect/android/widgets/SpinnerWidgetTest.java b/collect_app/src/test/java/org/odk/collect/android/widgets/SpinnerWidgetTest.java
index 54c94b0..c0d89aa 100644
--- a/collect_app/src/test/java/org/odk/collect/android/widgets/SpinnerWidgetTest.java
+++ b/collect_app/src/test/java/org/odk/collect/android/widgets/SpinnerWidgetTest.java
@@ -13,6 +13,6 @@
     @NonNull
     @Override
     public SpinnerWidget createWidget() {
-        return new SpinnerWidget(RuntimeEnvironment.application, formEntryPrompt);
+        return new SpinnerWidget(RuntimeEnvironment.application, formEntryPrompt, false);
     }
 }
