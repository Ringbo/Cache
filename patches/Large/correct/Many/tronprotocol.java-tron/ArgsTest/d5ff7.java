diff --git a/src/test/java/org/tron/core/config/args/ArgsTest.java b/src/test/java/org/tron/core/config/args/ArgsTest.java
index 3199948..2e5779f 100644
--- a/src/test/java/org/tron/core/config/args/ArgsTest.java
+++ b/src/test/java/org/tron/core/config/args/ArgsTest.java
@@ -75,6 +75,6 @@
     Assert.assertEquals(Long.MAX_VALUE, args.getMaxConnectionAgeInMillis());
     Assert.assertEquals(GrpcUtil.DEFAULT_MAX_MESSAGE_SIZE, args.getMaxMessageSize());
     Assert.assertEquals(GrpcUtil.DEFAULT_MAX_HEADER_LIST_SIZE, args.getMaxHeaderListSize());
-    Assert.assertEquals(0L, args.getAllowCreationOfContracts());
+    Assert.assertEquals(1L, args.getAllowCreationOfContracts());
   }
 }
