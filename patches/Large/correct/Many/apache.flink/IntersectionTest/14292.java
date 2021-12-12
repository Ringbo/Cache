diff --git a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/IntersectionTest.java b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/IntersectionTest.java
index 5d15b28..6ee1075 100755
--- a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/IntersectionTest.java
+++ b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/IntersectionTest.java
@@ -24,7 +24,7 @@
 		final Sink output = new Sink("newUsers.json").withInputs(intersection);
 		expectedPlan.setSinks(output);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 }
