diff --git a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/GroupingTest.java b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/GroupingTest.java
index 9a10a4e..5a77c4d 100755
--- a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/GroupingTest.java
+++ b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/GroupingTest.java
@@ -49,7 +49,7 @@
 		final Sink output = new Sink("output.json").withInputs(selection);
 		expectedPlan.setSinks(output);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 	@Test
@@ -76,7 +76,7 @@
 		final Sink output = new Sink("output.json").withInputs(selection);
 		expectedPlan.setSinks(output);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 	@Test
@@ -103,7 +103,7 @@
 		final Sink output = new Sink("output.json").withInputs(selection);
 		expectedPlan.setSinks(output);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 	@Test
@@ -138,7 +138,7 @@
 		final Sink output = new Sink("output.json").withInputs(selection);
 		expectedPlan.setSinks(output);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 	@Test
@@ -173,7 +173,7 @@
 		final Sink output = new Sink("output.json").withInputs(selection);
 		expectedPlan.setSinks(output);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 }
