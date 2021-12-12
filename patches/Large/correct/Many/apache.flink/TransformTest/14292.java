diff --git a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/TransformTest.java b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/TransformTest.java
index 81fd818..ffe18e7 100755
--- a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/TransformTest.java
+++ b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/TransformTest.java
@@ -49,7 +49,7 @@
 		final Sink output = new Sink("output.json").withInputs(projection);
 		expectedPlan.setSinks(output);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 }
