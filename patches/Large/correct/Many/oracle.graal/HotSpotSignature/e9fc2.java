diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSignature.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSignature.java
index 12f4691..bc3c82b 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSignature.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSignature.java
@@ -151,7 +151,7 @@
 
         ResolvedJavaType type = parameterTypes[index];
         if (!checkValidCache(type, accessingClass)) {
-            type = (ResolvedJavaType) runtime.lookupType(parameters.get(index), (HotSpotResolvedObjectType) accessingClass, true);
+            type = (ResolvedJavaType) runtime.lookupType(parameters.get(index), (HotSpotResolvedObjectType) accessingClass, false);
             parameterTypes[index] = type;
         }
         return type;
@@ -176,7 +176,7 @@
             return getUnresolvedOrPrimitiveType(runtime, returnType);
         }
         if (!checkValidCache(returnTypeCache, accessingClass)) {
-            returnTypeCache = (ResolvedJavaType) runtime.lookupType(returnType, (HotSpotResolvedObjectType) accessingClass, true);
+            returnTypeCache = (ResolvedJavaType) runtime.lookupType(returnType, (HotSpotResolvedObjectType) accessingClass, false);
         }
         return returnTypeCache;
     }
