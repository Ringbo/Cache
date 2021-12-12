diff --git a/src/test/java/com/insightfullogic/java8/answers/chapter3/StringExercisesTest.java b/src/test/java/com/insightfullogic/java8/answers/chapter3/StringExercisesTest.java
index dc04148..4a39746 100644
--- a/src/test/java/com/insightfullogic/java8/answers/chapter3/StringExercisesTest.java
+++ b/src/test/java/com/insightfullogic/java8/answers/chapter3/StringExercisesTest.java
@@ -35,7 +35,7 @@
     @Test
     public void findsMostLowercaseString() {
         Optional<String> result = StringExercises.mostLowercaseString(Arrays.asList("a", "abc", "ABCde"));
-        assertEquals(result, Optional.of("abc"));
+        assertEquals(Optional.of("abc"), result);
     }
 
 }
