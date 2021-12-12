diff --git a/src/core/org/apache/jmeter/util/JMeterUtils.java b/src/core/org/apache/jmeter/util/JMeterUtils.java
index dfc657b..585b19b 100644
--- a/src/core/org/apache/jmeter/util/JMeterUtils.java
+++ b/src/core/org/apache/jmeter/util/JMeterUtils.java
@@ -1372,7 +1372,7 @@
      * @return the factor by which we should scale elements for HiDPI mode
      */
     public static double getHiDPIScaleFactor() {
-        return Double.valueOf(JMeterUtils.getPropDefault("jmeter.hidpi.scale.factor", "1.0"));  // $NON-NLS-1$  $NON-NLS-2$
+        return Double.parseDouble(JMeterUtils.getPropDefault("jmeter.hidpi.scale.factor", "1.0"));  // $NON-NLS-1$  $NON-NLS-2$
     }
 
     /**
