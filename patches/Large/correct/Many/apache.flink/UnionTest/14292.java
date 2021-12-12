diff --git a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/UnionTest.java b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/UnionTest.java
index d02a292..025db61 100755
--- a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/UnionTest.java
+++ b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/UnionTest.java
@@ -25,6 +25,6 @@
 		final Sink output = new Sink("allUsers.json").withInputs(union);
 		expectedPlan.setSinks(output);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 }
