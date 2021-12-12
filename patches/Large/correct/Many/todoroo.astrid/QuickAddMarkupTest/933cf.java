diff --git a/tests/src/com/todoroo/astrid/service/QuickAddMarkupTest.java b/tests/src/com/todoroo/astrid/service/QuickAddMarkupTest.java
index efa1bb8..a7296d6 100644
--- a/tests/src/com/todoroo/astrid/service/QuickAddMarkupTest.java
+++ b/tests/src/com/todoroo/astrid/service/QuickAddMarkupTest.java
@@ -33,11 +33,11 @@
     public void testContexts() {
         whenTitleIs("eat @home");
         assertTitleBecomes("eat");
-        assertTagsAre("@home");
+        assertTagsAre("home");
 
         whenTitleIs("buy oatmeal @store @morning");
         assertTitleBecomes("buy oatmeal");
-        assertTagsAre("@store", "@morning");
+        assertTagsAre("store", "morning");
 
         whenTitleIs("look @ me");
         assertTitleBecomes("look @ me");
@@ -47,7 +47,7 @@
     public void testImportances() {
         whenTitleIs("eat !1");
         assertTitleBecomes("eat");
-        assertImportanceIs(Task.IMPORTANCE_NONE);
+        assertImportanceIs(Task.IMPORTANCE_SHOULD_DO);
 
         whenTitleIs("super cool!");
         assertTitleBecomes("super cool!");
@@ -61,13 +61,13 @@
         whenTitleIs("eat #food !2");
         assertTitleBecomes("eat");
         assertTagsAre("food");
-        assertImportanceIs(Task.IMPORTANCE_SHOULD_DO);
+        assertImportanceIs(Task.IMPORTANCE_MUST_DO);
     }
 
     // --- helpers
 
     private Task task;
-    private ArrayList<String> tags = new ArrayList<String>();
+    private final ArrayList<String> tags = new ArrayList<String>();
 
     private void assertTagsAre(String... expectedTags) {
         List<String> expected = Arrays.asList(expectedTags);
