diff --git a/dexter/src/main/java/com/karumi/dexter/listener/threaddecorator/ThreadSpecFactory.java b/dexter/src/main/java/com/karumi/dexter/listener/threaddecorator/ThreadSpecFactory.java
index 6f51f4d..9ddac93 100644
--- a/dexter/src/main/java/com/karumi/dexter/listener/threaddecorator/ThreadSpecFactory.java
+++ b/dexter/src/main/java/com/karumi/dexter/listener/threaddecorator/ThreadSpecFactory.java
@@ -13,6 +13,6 @@
   }
 
   private static boolean runningMainThread() {
-    return Looper.getMainLooper() != Looper.myLooper();
+    return Looper.getMainLooper() == Looper.myLooper();
   }
 }
