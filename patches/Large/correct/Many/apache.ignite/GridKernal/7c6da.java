diff --git a/modules/core/java/org/gridgain/grid/kernal/GridKernal.java b/modules/core/java/org/gridgain/grid/kernal/GridKernal.java
index c165722..489c6c4 100644
--- a/modules/core/java/org/gridgain/grid/kernal/GridKernal.java
+++ b/modules/core/java/org/gridgain/grid/kernal/GridKernal.java
@@ -96,7 +96,7 @@
  */
 public class GridKernal extends GridProjectionAdapter implements GridEx, GridKernalMBean {
     /** Enterprise release flag. */
-    private static final boolean ENT;
+    private static final boolean ent;
 
     /** Compound GridGain version. */
     private static final String COMPOUND_VERSION;
@@ -114,9 +114,9 @@
             ent0 = false;
         }
 
-        ENT = ent0;
+        ent = ent0;
 
-        COMPOUND_VERSION = EDITION + (ENT ? "ent" : "os") + VER;
+        COMPOUND_VERSION = EDITION + (ent ? "ent" : "os") + VER;
     }
 
     /** Ant-augmented compatible versions. */
@@ -618,7 +618,7 @@
 
         // Spin out SPIs & managers.
         try {
-            GridKernalContextImpl ctx = new GridKernalContextImpl(this, cfg, gw, ENT);
+            GridKernalContextImpl ctx = new GridKernalContextImpl(this, cfg, gw, ent);
 
             nodeLoc = new GridNodeLocalMapImpl(ctx);
 
