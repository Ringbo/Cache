diff --git a/core/src/test/java/cucumber/runtime/LinePredicateTest.java b/core/src/test/java/cucumber/runtime/LinePredicateTest.java
index e67e154..c63ffd4 100644
--- a/core/src/test/java/cucumber/runtime/LinePredicateTest.java
+++ b/core/src/test/java/cucumber/runtime/LinePredicateTest.java
@@ -22,11 +22,11 @@
     private static final List<PickleTag> NO_TAGS = Collections.<PickleTag>emptyList();
 
     @Test
-    public void matches_pickles_from_files_not_in_the_predicate_map() {
+    public void does_not_match_pickles_from_files_not_in_the_predicate_map() {
         PickleEvent pickleEvent = createPickleEventWithLocations("path/file.feature", asList(pickleLocation(4)));
-        LinePredicate predicate = new LinePredicate(singletonMap("another_path/file.feature", asList(8L)));
+        LinePredicate predicate = new LinePredicate(singletonMap("another_path/file.feature", asList(4L)));
 
-        assertTrue(predicate.apply(pickleEvent));
+        assertFalse(predicate.apply(pickleEvent));
     }
 
     @Test
