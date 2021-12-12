diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/GridProjectionAdapter.java b/modules/core/src/main/java/org/gridgain/grid/kernal/GridProjectionAdapter.java
index 3673959..a08c14b 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/GridProjectionAdapter.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/GridProjectionAdapter.java
@@ -223,7 +223,7 @@
         if (svcs == null) {
             assert ctx != null;
 
-            svcs = new GridServicesImpl(ctx, this, subjId);
+            svcs = new GridServicesImpl(ctx, this);
         }
 
         return svcs;
