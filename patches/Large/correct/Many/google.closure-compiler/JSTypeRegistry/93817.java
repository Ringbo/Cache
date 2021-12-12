diff --git a/src/com/google/javascript/rhino/jstype/JSTypeRegistry.java b/src/com/google/javascript/rhino/jstype/JSTypeRegistry.java
index 9a31143..67c1b8c 100644
--- a/src/com/google/javascript/rhino/jstype/JSTypeRegistry.java
+++ b/src/com/google/javascript/rhino/jstype/JSTypeRegistry.java
@@ -385,7 +385,7 @@
     NoObjectType noObjectType = new NoObjectType(this);
     registerNativeType(JSTypeNative.NO_OBJECT_TYPE, noObjectType);
 
-    NoObjectType noResolvedType = new NoResolvedType(this);
+    NoResolvedType noResolvedType = new NoResolvedType(this);
     registerNativeType(JSTypeNative.NO_RESOLVED_TYPE, noResolvedType);
 
     // Array
