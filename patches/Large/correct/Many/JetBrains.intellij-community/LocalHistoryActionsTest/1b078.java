diff --git a/platform/platform-tests/testSrc/com/intellij/history/integration/ui/LocalHistoryActionsTest.java b/platform/platform-tests/testSrc/com/intellij/history/integration/ui/LocalHistoryActionsTest.java
index 1e70df9..03943d8 100644
--- a/platform/platform-tests/testSrc/com/intellij/history/integration/ui/LocalHistoryActionsTest.java
+++ b/platform/platform-tests/testSrc/com/intellij/history/integration/ui/LocalHistoryActionsTest.java
@@ -112,9 +112,9 @@
     assertStatus(a, null, false);
   }
 
-  public void testShowSelectionHistoryActionIsDisabledForEmptySelection() {
+  public void testShowSelectionHistoryActionIsEnabledForEmptySelection() {
     ShowSelectionHistoryAction a = new ShowSelectionHistoryAction();
-    assertStatus(a, f, false);
+    assertStatus(a, f, true);
   }
 
   private void assertStatus(AnAction a, VirtualFile f, boolean isEnabled) {
