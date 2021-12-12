diff --git a/bundles/binding/org.openhab.binding.novelanheatpump/src/main/java/org/openhab/binding/novelanheatpump/internal/HeatPumpBinding.java b/bundles/binding/org.openhab.binding.novelanheatpump/src/main/java/org/openhab/binding/novelanheatpump/internal/HeatPumpBinding.java
index be4a92b..a3b7657 100644
--- a/bundles/binding/org.openhab.binding.novelanheatpump/src/main/java/org/openhab/binding/novelanheatpump/internal/HeatPumpBinding.java
+++ b/bundles/binding/org.openhab.binding.novelanheatpump/src/main/java/org/openhab/binding/novelanheatpump/internal/HeatPumpBinding.java
@@ -193,7 +193,7 @@
             handleEventType(new StringType(formatHours(heatpumpValues[63])), HeatpumpCommandType.TYPE_HOURS_HETPUMP);
             handleEventType(new StringType(formatHours(heatpumpValues[64])), HeatpumpCommandType.TYPE_HOURS_HEATING);
             handleEventType(new StringType(formatHours(heatpumpValues[65])), HeatpumpCommandType.TYPE_HOURS_WARMWATER);
-            handleEventType(new StringType(formatHours(heatpumpValues[65])), HeatpumpCommandType.TYPE_HOURS_COOLING);
+            handleEventType(new StringType(formatHours(heatpumpValues[66])), HeatpumpCommandType.TYPE_HOURS_COOLING);
             handleEventType(new DecimalType((double) heatpumpValues[151] / 10),
                     HeatpumpCommandType.TYPE_THERMALENERGY_HEATING);
             handleEventType(new DecimalType((double) heatpumpValues[152] / 10),
