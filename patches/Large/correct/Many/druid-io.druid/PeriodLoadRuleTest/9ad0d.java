diff --git a/server/src/test/java/io/druid/server/coordinator/rules/PeriodLoadRuleTest.java b/server/src/test/java/io/druid/server/coordinator/rules/PeriodLoadRuleTest.java
index 63d3384..afd2551 100644
--- a/server/src/test/java/io/druid/server/coordinator/rules/PeriodLoadRuleTest.java
+++ b/server/src/test/java/io/druid/server/coordinator/rules/PeriodLoadRuleTest.java
@@ -49,7 +49,7 @@
 
     Assert.assertTrue(rule.appliesTo(builder.interval(new Interval("2012-01-01/2012-12-31")).build(), now));
     Assert.assertTrue(rule.appliesTo(builder.interval(new Interval("1000-01-01/2012-12-31")).build(), now));
-    Assert.assertFalse(rule.appliesTo(builder.interval(new Interval("0500-01-01/2100-12-31")).build(), now));
+    Assert.assertTrue(rule.appliesTo(builder.interval(new Interval("0500-01-01/2100-12-31")).build(), now));
   }
 
   @Test
@@ -64,7 +64,7 @@
     );
 
     Assert.assertTrue(rule.appliesTo(builder.interval(new Interval(now.minusWeeks(1), now)).build(), now));
-    Assert.assertFalse(
+    Assert.assertTrue(
         rule.appliesTo(
             builder.interval(new Interval(now.minusDays(1), now.plusDays(1)))
                    .build(),
