diff --git a/src/core/org/apache/jmeter/testelement/property/NullProperty.java b/src/core/org/apache/jmeter/testelement/property/NullProperty.java
index 706cb14..4034de8 100644
--- a/src/core/org/apache/jmeter/testelement/property/NullProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/NullProperty.java
@@ -81,7 +81,7 @@
     }
 
     @Override
-    public final Object clone() {
+    public final NullProperty clone() {
         return this;
     }
 
