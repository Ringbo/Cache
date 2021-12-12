diff --git a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/ReplaceTest.java b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/ReplaceTest.java
index 2c73a4d..541cf6f 100755
--- a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/ReplaceTest.java
+++ b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/ReplaceTest.java
@@ -32,7 +32,7 @@
 		final Sink normalizedPersons = new Sink("normalizedPersons.json").withInputs(replace);
 		expectedPlan.setSinks(normalizedPersons);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 	@Test
@@ -54,7 +54,7 @@
 		final Sink normalizedPersons = new Sink("normalizedPersons.json").withInputs(replace);
 		expectedPlan.setSinks(normalizedPersons);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 	@Test
@@ -79,6 +79,6 @@
 		final Sink normalizedPersons = new Sink("normalizedPersons.json").withInputs(replace);
 		expectedPlan.setSinks(normalizedPersons);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 }
