diff --git a/modules/core/src/test/java/org/gridgain/grid/marshaller/GridMarshallerAbstractTest.java b/modules/core/src/test/java/org/gridgain/grid/marshaller/GridMarshallerAbstractTest.java
index c39745d..f185ab9 100644
--- a/modules/core/src/test/java/org/gridgain/grid/marshaller/GridMarshallerAbstractTest.java
+++ b/modules/core/src/test/java/org/gridgain/grid/marshaller/GridMarshallerAbstractTest.java
@@ -777,7 +777,7 @@
         assert outBean.getObjectField() != null;
 
         assert inBean.getObjectField().getClass().equals(GridCacheDataStructuresProxy.class);
-        assert outBean.getObjectField().getClass().equals(GridCacheDataStructuresImpl.class);
+        assert outBean.getObjectField().getClass().equals(GridCacheDataStructuresProxy.class);
 
         assert inBean != outBean;
         assert inBean.equals(outBean);
@@ -805,7 +805,7 @@
         assert outBean.getObjectField() != null;
 
         assert inBean.getObjectField().getClass().equals(GridCacheAffinityProxy.class);
-        assert outBean.getObjectField().getClass().equals(GridCacheAffinityImpl.class);
+        assert outBean.getObjectField().getClass().equals(GridCacheAffinityProxy.class);
 
         assert inBean != outBean;
         assert inBean.equals(outBean);
