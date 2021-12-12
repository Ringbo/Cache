diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestPriorityRpc.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestPriorityRpc.java
index 82840c5..8ba27bb 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestPriorityRpc.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestPriorityRpc.java
@@ -85,7 +85,7 @@
     HRegionInfo mockRegionInfo = Mockito.mock(HRegionInfo.class);
     Mockito.when(mockRS.getRegion((RegionSpecifier)Mockito.any())).thenReturn(mockRegion);
     Mockito.when(mockRegion.getRegionInfo()).thenReturn(mockRegionInfo);
-    Mockito.when(mockRegionInfo.isMetaRegion()).thenReturn(true);
+    Mockito.when(mockRegionInfo.isMetaTable()).thenReturn(true);
     qosFunction.setRegionServer(mockRS);
     assertTrue (qosFunction.apply(rpcRequest) == HConstants.HIGH_QOS);
   }
@@ -132,14 +132,14 @@
     Mockito.when(mockRegionScanner.getRegionInfo()).thenReturn(mockRegionInfo);
     Mockito.when(mockRS.getRegion((RegionSpecifier)Mockito.any())).thenReturn(mockRegion);
     Mockito.when(mockRegion.getRegionInfo()).thenReturn(mockRegionInfo);
-    Mockito.when(mockRegionInfo.isMetaRegion()).thenReturn(true);
+    Mockito.when(mockRegionInfo.isMetaTable()).thenReturn(true);
 
     qosFunction.setRegionServer(mockRS);
 
     assertTrue (qosFunction.apply(rpcRequest) == HConstants.HIGH_QOS);
 
     //the same as above but with non-meta region
-    Mockito.when(mockRegionInfo.isMetaRegion()).thenReturn(false);
+    Mockito.when(mockRegionInfo.isMetaTable()).thenReturn(false);
     assertTrue (qosFunction.apply(rpcRequest) == HConstants.NORMAL_QOS);
   }
 
