diff --git a/modules/core/src/test/java/org/apache/ignite/internal/GridProjectionForCachesSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/GridProjectionForCachesSelfTest.java
index 86295ba..0a961d4 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/GridProjectionForCachesSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/GridProjectionForCachesSelfTest.java
@@ -127,7 +127,7 @@
         assertFalse(prj.nodes().contains(grid(1).localNode()));
         assertTrue(prj.nodes().contains(grid(2).localNode()));
         assertTrue(prj.nodes().contains(grid(3).localNode()));
-        assertTrue(prj.nodes().contains(grid(4).localNode()));
+        assertFalse(prj.nodes().contains(grid(4).localNode()));
     }
 
     /**
