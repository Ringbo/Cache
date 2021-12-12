diff --git a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/DifferenceTest.java b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/DifferenceTest.java
index 85188fb..c913bd7 100755
--- a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/DifferenceTest.java
+++ b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/DifferenceTest.java
@@ -26,7 +26,7 @@
 			withInputs(difference);
 		expectedPlan.setSinks(output);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 }
