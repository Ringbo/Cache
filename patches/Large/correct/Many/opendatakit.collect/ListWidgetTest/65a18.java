diff --git a/collect_app/src/test/java/org/odk/collect/android/widgets/ListWidgetTest.java b/collect_app/src/test/java/org/odk/collect/android/widgets/ListWidgetTest.java
index acca2d4..587bc29 100644
--- a/collect_app/src/test/java/org/odk/collect/android/widgets/ListWidgetTest.java
+++ b/collect_app/src/test/java/org/odk/collect/android/widgets/ListWidgetTest.java
@@ -13,6 +13,6 @@
     @NonNull
     @Override
     public ListWidget createWidget() {
-        return new ListWidget(RuntimeEnvironment.application, formEntryPrompt, false);
+        return new ListWidget(RuntimeEnvironment.application, formEntryPrompt, false, false);
     }
 }
