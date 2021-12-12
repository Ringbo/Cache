diff --git a/litho-it-powermock/src/test/java/com/facebook/litho/LayoutStateCalculateTest.java b/litho-it-powermock/src/test/java/com/facebook/litho/LayoutStateCalculateTest.java
index 82e8939..5fd1a61 100644
--- a/litho-it-powermock/src/test/java/com/facebook/litho/LayoutStateCalculateTest.java
+++ b/litho-it-powermock/src/test/java/com/facebook/litho/LayoutStateCalculateTest.java
@@ -1890,7 +1890,7 @@
     assertEquals(new Rect(0, 0, 300, sizeOutput.height), mountBounds);
     assertTrue(getComponentAt(layoutState, 1) instanceof TestDrawableComponent);
     layoutState.getMountableOutputAt(1).getMountBounds(mountBounds);
-    assertEquals(new Rect(20, 0, 20, 0), mountBounds);
+    assertEquals(new Rect(20, 0, 280, 0), mountBounds);
 
     Mockito.validateMockitoUsage();
   }
@@ -1964,7 +1964,7 @@
     assertEquals(new Rect(25, 5, 275, 11), mountBounds);
     assertTrue(getComponentAt(layoutState, 3) instanceof TestViewComponent);
     layoutState.getMountableOutputAt(3).getMountBounds(mountBounds);
-    assertEquals(new Rect(28, 14, 28, 14), mountBounds);
+    assertEquals(new Rect(28, 14, 272, 14), mountBounds);
 
     Mockito.validateMockitoUsage();
   }
