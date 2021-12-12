diff --git a/core/src/test/java/io/grpc/internal/AbstractManagedChannelImplBuilderTest.java b/core/src/test/java/io/grpc/internal/AbstractManagedChannelImplBuilderTest.java
index 343b548..45d03be 100644
--- a/core/src/test/java/io/grpc/internal/AbstractManagedChannelImplBuilderTest.java
+++ b/core/src/test/java/io/grpc/internal/AbstractManagedChannelImplBuilderTest.java
@@ -151,7 +151,7 @@
 
   @Test
   public void defaultLoadBalancingPolicy_default() {
-    assertEquals(builder.defaultLbPolicy, "pick_first");
+    assertEquals("pick_first", builder.defaultLbPolicy);
   }
 
   @Test
