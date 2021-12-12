diff --git a/core/src/test/java/cucumber/runtime/LinePredicateTest.java b/core/src/test/java/cucumber/runtime/LinePredicateTest.java
index c63ffd4..414cc53 100644
--- a/core/src/test/java/cucumber/runtime/LinePredicateTest.java
+++ b/core/src/test/java/cucumber/runtime/LinePredicateTest.java
@@ -22,11 +22,14 @@
     private static final List<PickleTag> NO_TAGS = Collections.<PickleTag>emptyList();
 
     @Test
-    public void does_not_match_pickles_from_files_not_in_the_predicate_map() {
+    public void matches_pickles_from_files_not_in_the_predicate_map() {
+        // the argument "path/file.feature another_path/file.feature:8"
+        // results in only line predicates only for another_path/file.feature,
+        // but all pickles from path/file.feature shall also be executed.
         PickleEvent pickleEvent = createPickleEventWithLocations("path/file.feature", asList(pickleLocation(4)));
-        LinePredicate predicate = new LinePredicate(singletonMap("another_path/file.feature", asList(4L)));
+        LinePredicate predicate = new LinePredicate(singletonMap("another_path/file.feature", asList(8L)));
 
-        assertFalse(predicate.apply(pickleEvent));
+        assertTrue(predicate.apply(pickleEvent));
     }
 
     @Test
