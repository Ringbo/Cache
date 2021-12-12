diff --git a/engine/test-src/org/pentaho/di/core/row/ValueDataUtilTest.java b/engine/test-src/org/pentaho/di/core/row/ValueDataUtilTest.java
index 071613d..60fb360 100644
--- a/engine/test-src/org/pentaho/di/core/row/ValueDataUtilTest.java
+++ b/engine/test-src/org/pentaho/di/core/row/ValueDataUtilTest.java
@@ -172,7 +172,7 @@
     Object daysDiff =
         calculate( "2010-05-12", "2010-01-01", ValueMetaInterface.TYPE_DATE,
             CalculatorMetaFunction.CALC_DATE_WORKING_DIFF );
-    assertEquals( new Long( 93 ), daysDiff );
+    assertEquals( new Long( 94 ), daysDiff );
   }
 
   @Test
@@ -180,7 +180,7 @@
     Object daysDiff =
         calculate( "2010-12-31", "2011-02-10", ValueMetaInterface.TYPE_DATE,
             CalculatorMetaFunction.CALC_DATE_WORKING_DIFF );
-    assertEquals( new Long( -29 ), daysDiff );
+    assertEquals( new Long( -30 ), daysDiff );
   }
 
   @Test
