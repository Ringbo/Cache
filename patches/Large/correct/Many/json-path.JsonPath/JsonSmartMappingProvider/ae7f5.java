diff --git a/json-path/src/main/java/com/jayway/jsonpath/spi/mapper/JsonSmartMappingProvider.java b/json-path/src/main/java/com/jayway/jsonpath/spi/mapper/JsonSmartMappingProvider.java
index 68e36e4..635c7bc 100644
--- a/json-path/src/main/java/com/jayway/jsonpath/spi/mapper/JsonSmartMappingProvider.java
+++ b/json-path/src/main/java/com/jayway/jsonpath/spi/mapper/JsonSmartMappingProvider.java
@@ -116,7 +116,7 @@
             if(Integer.class.isAssignableFrom(src.getClass())){
                return (Integer) src;
             } else if (Long.class.isAssignableFrom(src.getClass())) {
-                return ((Integer) src).intValue();
+                return ((Long) src).intValue();
             } else if (Double.class.isAssignableFrom(src.getClass())) {
                 return ((Double) src).intValue();
             } else if (BigDecimal.class.isAssignableFrom(src.getClass())) {
