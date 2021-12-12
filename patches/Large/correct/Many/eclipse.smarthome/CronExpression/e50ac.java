diff --git a/bundles/core/org.eclipse.smarthome.core/src/main/java/org/eclipse/smarthome/core/scheduler/CronExpression.java b/bundles/core/org.eclipse.smarthome.core/src/main/java/org/eclipse/smarthome/core/scheduler/CronExpression.java
index 9d522e3..87a0e87 100644
--- a/bundles/core/org.eclipse.smarthome.core/src/main/java/org/eclipse/smarthome/core/scheduler/CronExpression.java
+++ b/bundles/core/org.eclipse.smarthome.core/src/main/java/org/eclipse/smarthome/core/scheduler/CronExpression.java
@@ -169,7 +169,7 @@
      * @throws ParseException if the string expression cannot be parsed into a valid <code>CronExpression</code>.
      */
     public CronExpression(final String expression, final Date startTime, final TimeZone zone) throws ParseException {
-        super(expression, " \t", startTime, zone, 0, 1);
+        super(expression, " \t", startTime, zone, 0, 2);
     }
 
     @Override
