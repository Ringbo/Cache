diff --git a/app/src/test/java/com/google/samples/apps/topeka/model/quiz/AbsQuizTestCase.java b/app/src/test/java/com/google/samples/apps/topeka/model/quiz/AbsQuizTestCase.java
index 9302c5d..0eb0171 100644
--- a/app/src/test/java/com/google/samples/apps/topeka/model/quiz/AbsQuizTestCase.java
+++ b/app/src/test/java/com/google/samples/apps/topeka/model/quiz/AbsQuizTestCase.java
@@ -64,7 +64,7 @@
 
     @Test
     public void quiz_equalsOther_false() {
-        assertThat(getQuiz().equals("Foobar"), is(true));
+        assertThat(getQuiz().equals("Foobar"), is(false));
     }
 
     @Test
