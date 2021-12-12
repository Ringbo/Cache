diff --git a/test/org/pentaho/di/blackbox/BlackBoxTests.java b/test/org/pentaho/di/blackbox/BlackBoxTests.java
index c8083de..b4dcb4b 100644
--- a/test/org/pentaho/di/blackbox/BlackBoxTests.java
+++ b/test/org/pentaho/di/blackbox/BlackBoxTests.java
@@ -198,7 +198,7 @@
         		actualFile = actualFile.replaceFirst(".expected_"+i+".", ".actual_"+i+"."); // multiple files case
         		actualFile = actualFile.replaceFirst(".expected.", ".actual."); // single file case
         		File actual = new File( actualFile );
-        		if( !result.getResult() ) {
+        		if( result.getResult() ) {
         			fileCompare( expected, actual, log );
         		}
         	}
