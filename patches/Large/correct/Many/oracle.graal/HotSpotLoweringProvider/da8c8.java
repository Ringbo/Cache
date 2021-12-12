diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotLoweringProvider.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotLoweringProvider.java
index a429dbf..e1c978a 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotLoweringProvider.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotLoweringProvider.java
@@ -757,7 +757,7 @@
         ValueNode arrayLength = readArrayLength(n.graph(), array, tool.getConstantReflection());
         if (arrayLength == null) {
             Stamp stamp = StampFactory.positiveInt();
-            ReadNode readArrayLength = g.add(new ReadNode(array, ConstantLocationNode.create(FINAL_LOCATION, Kind.Int, runtime.getConfig().arrayLengthOffset, g), stamp, BarrierType.NONE, false));
+            ReadNode readArrayLength = g.add(new ReadNode(array, ConstantLocationNode.create(ARRAY_LENGTH_LOCATION, Kind.Int, runtime.getConfig().arrayLengthOffset, g), stamp, BarrierType.NONE, false));
             g.addBeforeFixed(n, readArrayLength);
             readArrayLength.setGuard(createNullCheck(array, readArrayLength, tool));
             arrayLength = readArrayLength;
