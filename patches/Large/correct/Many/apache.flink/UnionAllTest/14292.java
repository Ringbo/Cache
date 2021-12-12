diff --git a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/UnionAllTest.java b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/UnionAllTest.java
index 050bb02..c410e65 100755
--- a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/UnionAllTest.java
+++ b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/UnionAllTest.java
@@ -24,6 +24,6 @@
 		final Sink output = new Sink("allUsers.json").withInputs(union);
 		expectedPlan.setSinks(output);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 }
