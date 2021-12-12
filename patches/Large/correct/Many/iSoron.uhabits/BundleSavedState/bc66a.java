diff --git a/app/src/main/java/org/isoron/uhabits/activities/common/views/BundleSavedState.java b/app/src/main/java/org/isoron/uhabits/activities/common/views/BundleSavedState.java
index fe33993..b5011b0 100644
--- a/app/src/main/java/org/isoron/uhabits/activities/common/views/BundleSavedState.java
+++ b/app/src/main/java/org/isoron/uhabits/activities/common/views/BundleSavedState.java
@@ -29,7 +29,7 @@
             @Override
             public BundleSavedState createFromParcel(Parcel source)
             {
-                return new BundleSavedState(source);
+                return new BundleSavedState(source, getClass().getClassLoader());
             }
 
             @Override
@@ -47,9 +47,9 @@
         this.bundle = bundle;
     }
 
-    public BundleSavedState(Parcel source)
+    public BundleSavedState(Parcel source, ClassLoader loader)
     {
-        super(source);
+        super(source, loader);
         this.bundle = source.readBundle(getClass().getClassLoader());
     }
 
