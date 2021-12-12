diff --git a/api/src/main/java/org/apache/cxf/feature/StaxTransformFeature.java b/api/src/main/java/org/apache/cxf/feature/StaxTransformFeature.java
index c0a4752..eb1392a 100644
--- a/api/src/main/java/org/apache/cxf/feature/StaxTransformFeature.java
+++ b/api/src/main/java/org/apache/cxf/feature/StaxTransformFeature.java
@@ -65,7 +65,7 @@
     }
 
     public void setSkipOnFault(boolean value) {
-        out.setAttributesToElements(value);
+        out.setSkipOnFault(value);
     }
     
     public void setOutAppendElements(Map<String, String> map) {
