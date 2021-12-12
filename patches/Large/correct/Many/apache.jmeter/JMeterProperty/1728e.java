diff --git a/src/core/org/apache/jmeter/testelement/property/JMeterProperty.java b/src/core/org/apache/jmeter/testelement/property/JMeterProperty.java
index 8393731..08549af 100644
--- a/src/core/org/apache/jmeter/testelement/property/JMeterProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/JMeterProperty.java
@@ -90,5 +90,5 @@
 
     public void setObjectValue(Object value);
 
-    public Object clone();
+    public JMeterProperty clone();
 }
