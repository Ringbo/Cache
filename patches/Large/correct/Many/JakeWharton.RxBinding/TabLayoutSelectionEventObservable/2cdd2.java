diff --git a/rxbinding-design/src/main/java/com/jakewharton/rxbinding2/support/design/widget/TabLayoutSelectionEventObservable.java b/rxbinding-design/src/main/java/com/jakewharton/rxbinding2/support/design/widget/TabLayoutSelectionEventObservable.java
index ccf044c..e04daad 100644
--- a/rxbinding-design/src/main/java/com/jakewharton/rxbinding2/support/design/widget/TabLayoutSelectionEventObservable.java
+++ b/rxbinding-design/src/main/java/com/jakewharton/rxbinding2/support/design/widget/TabLayoutSelectionEventObservable.java
@@ -9,7 +9,7 @@
 import static com.jakewharton.rxbinding2.internal.Preconditions.checkMainThread;
 
 final class TabLayoutSelectionEventObservable extends Observable<TabLayoutSelectionEvent> {
-  private final TabLayout view;
+  final TabLayout view;
 
   TabLayoutSelectionEventObservable(TabLayout view) {
     this.view = view;
