diff --git a/rt/core/src/test/java/org/apache/cxf/bus/CXFBusImplTest.java b/rt/core/src/test/java/org/apache/cxf/bus/CXFBusImplTest.java
index 78ce3d6..3421a4f 100644
--- a/rt/core/src/test/java/org/apache/cxf/bus/CXFBusImplTest.java
+++ b/rt/core/src/test/java/org/apache/cxf/bus/CXFBusImplTest.java
@@ -94,9 +94,9 @@
     public void testBusID() {
         CXFBusImpl bus = new CXFBusImpl();
         String id = bus.getId();
-        assertEquals("The bus id should be cxf", id, Bus.DEFAULT_BUS_ID + bus.hashCode());
+        assertEquals("The bus id should be cxf", id, Bus.DEFAULT_BUS_ID + Math.abs(bus.hashCode()));
         bus.setId("test");
-        assertEquals("The bus id should be changed", bus.getId(), "test");
+        assertEquals("The bus id should be changed", "test", bus.getId());
     }
     
     @Test
