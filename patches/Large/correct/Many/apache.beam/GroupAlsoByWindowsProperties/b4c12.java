diff --git a/runners/core-java/src/test/java/org/apache/beam/sdk/util/GroupAlsoByWindowsProperties.java b/runners/core-java/src/test/java/org/apache/beam/sdk/util/GroupAlsoByWindowsProperties.java
index f653f49..fe2a495 100644
--- a/runners/core-java/src/test/java/org/apache/beam/sdk/util/GroupAlsoByWindowsProperties.java
+++ b/runners/core-java/src/test/java/org/apache/beam/sdk/util/GroupAlsoByWindowsProperties.java
@@ -165,11 +165,13 @@
     TimestampedValue<KV<String, Iterable<String>>> item1 =
         Iterables.getOnlyElement(result.peekOutputElementsInWindow(window(0, 20)));
     assertThat(item1.getValue().getValue(), containsInAnyOrder("v1", "v2"));
+    // Timestamp adjusted by WindowFn to exceed the end of the prior sliding window
     assertThat(item1.getTimestamp(), equalTo(new Instant(10)));
 
     TimestampedValue<KV<String, Iterable<String>>> item2 =
         Iterables.getOnlyElement(result.peekOutputElementsInWindow(window(10, 30)));
     assertThat(item2.getValue().getValue(), contains("v2"));
+    // Timestamp adjusted by WindowFn to exceed the end of the prior sliding window
     assertThat(item2.getTimestamp(), equalTo(new Instant(20)));
   }
 
@@ -218,13 +220,15 @@
         Iterables.getOnlyElement(result.peekOutputElementsInWindow(window(0, 20)));
     assertThat(item1.getValue().getKey(), equalTo("k"));
     assertThat(item1.getValue().getValue(), equalTo(combineFn.apply(ImmutableList.of(1L, 2L, 4L))));
-    assertThat(item1.getTimestamp(), equalTo(new Instant(5L)));
+    // Timestamp adjusted by WindowFn to exceed the end of the prior sliding window
+    assertThat(item1.getTimestamp(), equalTo(new Instant(10L)));
 
     TimestampedValue<KV<String, Long>> item2 =
         Iterables.getOnlyElement(result.peekOutputElementsInWindow(window(10, 30)));
     assertThat(item2.getValue().getKey(), equalTo("k"));
     assertThat(item2.getValue().getValue(), equalTo(combineFn.apply(ImmutableList.of(2L, 4L))));
-    assertThat(item2.getTimestamp(), equalTo(new Instant(15L)));
+    // Timestamp adjusted by WindowFn to exceed the end of the prior sliding window
+    assertThat(item2.getTimestamp(), equalTo(new Instant(20L)));
   }
 
   /**
