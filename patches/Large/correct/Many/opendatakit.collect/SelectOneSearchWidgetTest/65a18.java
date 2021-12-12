diff --git a/collect_app/src/test/java/org/odk/collect/android/widgets/SelectOneSearchWidgetTest.java b/collect_app/src/test/java/org/odk/collect/android/widgets/SelectOneSearchWidgetTest.java
index 3eaa1ca..a340d90 100644
--- a/collect_app/src/test/java/org/odk/collect/android/widgets/SelectOneSearchWidgetTest.java
+++ b/collect_app/src/test/java/org/odk/collect/android/widgets/SelectOneSearchWidgetTest.java
@@ -13,6 +13,6 @@
     @NonNull
     @Override
     public SelectOneSearchWidget createWidget() {
-        return new SelectOneSearchWidget(RuntimeEnvironment.application, formEntryPrompt);
+        return new SelectOneSearchWidget(RuntimeEnvironment.application, formEntryPrompt, false);
     }
 }
