diff --git a/drools-scorecards/src/test/java/org/drools/scorecards/DrlFromPMMLTest.java b/drools-scorecards/src/test/java/org/drools/scorecards/DrlFromPMMLTest.java
index a923c2e..a28476f 100644
--- a/drools-scorecards/src/test/java/org/drools/scorecards/DrlFromPMMLTest.java
+++ b/drools-scorecards/src/test/java/org/drools/scorecards/DrlFromPMMLTest.java
@@ -51,7 +51,7 @@
 
     @Test
     public void testRuleCount() throws Exception {
-        assertEquals( 55, StringUtil.countMatches( drl, "rule \"" ) );
+        assertEquals( 56, StringUtil.countMatches( drl, "rule \"" ) );
     }
 
     @Test
