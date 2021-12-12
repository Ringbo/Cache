diff --git a/sql/src/test/java/io/crate/operation/reference/sys/check/node/SysNodeChecksTest.java b/sql/src/test/java/io/crate/operation/reference/sys/check/node/SysNodeChecksTest.java
index 59754d2..50b48c9 100644
--- a/sql/src/test/java/io/crate/operation/reference/sys/check/node/SysNodeChecksTest.java
+++ b/sql/src/test/java/io/crate/operation/reference/sys/check/node/SysNodeChecksTest.java
@@ -158,7 +158,7 @@
 
         RecoveryAfterTimeSysCheck recoveryAfterNodesCheck = new RecoveryAfterTimeSysCheck(clusterService, settings);
 
-        assertThat(recoveryAfterNodesCheck.validate(), is(true));
+        assertThat(recoveryAfterNodesCheck.validate(), is(false));
     }
 
     @Test
