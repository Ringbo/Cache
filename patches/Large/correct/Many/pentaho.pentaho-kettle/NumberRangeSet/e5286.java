diff --git a/src/org/pentaho/di/trans/steps/numberrange/NumberRangeSet.java b/src/org/pentaho/di/trans/steps/numberrange/NumberRangeSet.java
index 563e7bc..f90edd4 100644
--- a/src/org/pentaho/di/trans/steps/numberrange/NumberRangeSet.java
+++ b/src/org/pentaho/di/trans/steps/numberrange/NumberRangeSet.java
@@ -69,7 +69,7 @@
 	 	/**
 	 * Returns separator that is added if a value matches multiple ranges.
 	 */
-	 	protected String getMultiValueSeparator() 
+	 	public static String getMultiValueSeparator() 
 		{
 			return ",";
 		}
