diff --git a/src/test/java/com/alibaba/druid/bvt/pool/basic/PoolableCallableStatementTest.java b/src/test/java/com/alibaba/druid/bvt/pool/basic/PoolableCallableStatementTest.java
index 206b355..d004cc5 100644
--- a/src/test/java/com/alibaba/druid/bvt/pool/basic/PoolableCallableStatementTest.java
+++ b/src/test/java/com/alibaba/druid/bvt/pool/basic/PoolableCallableStatementTest.java
@@ -40,12 +40,12 @@
             }
         };
 
-        Assert.assertEquals(0, raw.getParameters().size());
+        Assert.assertEquals(0, raw.getOutParameters().size());
         stmt.registerOutParameter(1, Types.INTEGER);
-        Assert.assertEquals(1, raw.getParameters().size());
+        Assert.assertEquals(1, raw.getOutParameters().size());
 
         stmt.registerOutParameter(2, Types.DECIMAL, 10);
-        Assert.assertEquals(2, raw.getParameters().size());
+        Assert.assertEquals(2, raw.getOutParameters().size());
     }
 
     public void test_basic() throws Exception {
