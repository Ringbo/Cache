diff --git a/tests/java/itrx/chapter2/creating/FunctionalUnfoldsTest.java b/tests/java/itrx/chapter2/creating/FunctionalUnfoldsTest.java
index ab87732..ee498ed 100644
--- a/tests/java/itrx/chapter2/creating/FunctionalUnfoldsTest.java
+++ b/tests/java/itrx/chapter2/creating/FunctionalUnfoldsTest.java
@@ -128,7 +128,7 @@
 		
 		scheduler.advanceTimeBy(6, TimeUnit.SECONDS);
 		
-		tester.assertReceivedOnNext(Arrays.asList(0L,1L,2L));
+		tester.assertReceivedOnNext(Arrays.asList(0L,1L,2L,3L,4L));
 		tester.assertNoErrors();
 		assertEquals(tester.getOnCompletedEvents().size(), 0); // Hasn't terminated
 		
