diff --git a/bundles/binding/org.openhab.binding.homematic.test/src/test/java/org/openhab/binding/homematic/internal/converter/lookup/StateConverterLookupByCustomConverterTest.java b/bundles/binding/org.openhab.binding.homematic.test/src/test/java/org/openhab/binding/homematic/internal/converter/lookup/StateConverterLookupByCustomConverterTest.java
index ee3f13c..9384616 100644
--- a/bundles/binding/org.openhab.binding.homematic.test/src/test/java/org/openhab/binding/homematic/internal/converter/lookup/StateConverterLookupByCustomConverterTest.java
+++ b/bundles/binding/org.openhab.binding.homematic.test/src/test/java/org/openhab/binding/homematic/internal/converter/lookup/StateConverterLookupByCustomConverterTest.java
@@ -16,7 +16,7 @@
     @Test
     public void testGetStateToBindingValueConverter() {
         NumberItem item = new NumberItem(NUMBER_ITEM_NAME);
-        converterLookup.addCustomConverter(item, IntegerDecimalConverter.class);
+        converterLookup.addCustomConverter(NUMBER_ITEM_NAME, IntegerDecimalConverter.class);
         StateConverterMap converter = converterLookup.getStateToBindingValueConverter(item, null);
         assertEquals(IntegerDecimalConverter.class, converter.get("bla").getClass());
     }
@@ -24,7 +24,7 @@
     @Test
     public void testGetBindingValueToStateConverter() {
         NumberItem item = new NumberItem(NUMBER_ITEM_NAME);
-        converterLookup.addCustomConverter(item, IntegerDecimalConverter.class);
+        converterLookup.addCustomConverter(NUMBER_ITEM_NAME, IntegerDecimalConverter.class);
         StateConverter<?, ?> converter = converterLookup.getBindingValueToStateConverter(item, null);
         assertEquals(IntegerDecimalConverter.class, converter.getClass());
     }
