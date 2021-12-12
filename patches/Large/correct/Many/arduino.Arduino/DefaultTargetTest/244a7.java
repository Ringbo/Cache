diff --git a/app/test/processing/app/DefaultTargetTest.java b/app/test/processing/app/DefaultTargetTest.java
index f019e9f..d6281bf 100644
--- a/app/test/processing/app/DefaultTargetTest.java
+++ b/app/test/processing/app/DefaultTargetTest.java
@@ -29,7 +29,7 @@
     // should not raise an exception
     new Base(new String[0]);
 
-    TargetBoard targetBoard = Base.getTargetBoard();
+    TargetBoard targetBoard = BaseNoGui.getTargetBoard();
     assertNotEquals("unreal_board", targetBoard.getId());
   }
 }
