diff --git a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/JoinTest.java b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/JoinTest.java
index 1da230a..bf4a2f2 100755
--- a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/JoinTest.java
+++ b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/JoinTest.java
@@ -37,7 +37,7 @@
 		final Sink result = new Sink("result.json").withInputs(join);
 		expectedPlan.setSinks(result);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 	@Test
@@ -63,7 +63,7 @@
 		final Sink result = new Sink("result.json").withInputs(join);
 		expectedPlan.setSinks(result);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 	@Test
@@ -91,6 +91,6 @@
 		final Sink result = new Sink("result.json").withInputs(join);
 		expectedPlan.setSinks(result);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 }
