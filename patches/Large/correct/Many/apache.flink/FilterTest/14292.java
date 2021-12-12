diff --git a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/FilterTest.java b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/FilterTest.java
index 8166ee6..208fe2e 100755
--- a/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/FilterTest.java
+++ b/meteor/meteor-meteor/src/test/java/eu/stratosphere/meteor/base/FilterTest.java
@@ -53,7 +53,7 @@
 
 		// System.out.println(Sop);
 
-		assertEquals(expectedPlan, actualPlan);
+		assertPlanEquals(expectedPlan, actualPlan);
 	}
 
 }
