diff --git a/truffle/src/com.oracle.truffle.api.instrumentation.test/src/com/oracle/truffle/api/instrumentation/test/InstrumentationTest.java b/truffle/src/com.oracle.truffle.api.instrumentation.test/src/com/oracle/truffle/api/instrumentation/test/InstrumentationTest.java
index 511221d..ba048ed 100644
--- a/truffle/src/com.oracle.truffle.api.instrumentation.test/src/com/oracle/truffle/api/instrumentation/test/InstrumentationTest.java
+++ b/truffle/src/com.oracle.truffle.api.instrumentation.test/src/com/oracle/truffle/api/instrumentation/test/InstrumentationTest.java
@@ -180,10 +180,10 @@
      */
     @Test
     public void testDefaultId() {
-        PolyglotRuntime.Instrument descriptor1 = engine.getRuntime().getInstruments().get(MetadataInstrument2.class.getName());
+        PolyglotRuntime.Instrument descriptor1 = engine.getRuntime().getInstruments().get(MetadataInstrument2.class.getSimpleName());
         Assert.assertEquals("", descriptor1.getName());
         Assert.assertEquals("", descriptor1.getVersion());
-        Assert.assertEquals(MetadataInstrument2.class.getName(), descriptor1.getId());
+        Assert.assertEquals(MetadataInstrument2.class.getSimpleName(), descriptor1.getId());
         Assert.assertFalse(descriptor1.isEnabled());
     }
 
