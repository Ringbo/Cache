diff --git a/python/testSrc/com/jetbrains/python/PySuppressInspectionsTest.java b/python/testSrc/com/jetbrains/python/PySuppressInspectionsTest.java
index c2cd759..c2ffb75 100644
--- a/python/testSrc/com/jetbrains/python/PySuppressInspectionsTest.java
+++ b/python/testSrc/com/jetbrains/python/PySuppressInspectionsTest.java
@@ -42,7 +42,7 @@
     myFixture.configureByFile("inspections/suppress/suppressForStatement.py");
     myFixture.enableInspections(PyUnresolvedReferencesInspection.class);
     final List<IntentionAction> intentions = myFixture.filterAvailableIntentions("Suppress for statement");
-    assertEquals(2, intentions.size());
+    assertEquals(3, intentions.size());  // Rename reference, Ignore unresolved reference, Mark all unresolved attributes
     final IntentionAction suppressAction = intentions.get(0);
     myFixture.launchAction(suppressAction);
     myFixture.checkResultByFile("inspections/suppress/suppressForStatement.after.py");
