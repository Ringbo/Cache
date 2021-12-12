diff --git a/graal/com.oracle.graal.api.meta/src/com/oracle/graal/api/meta/Signature.java b/graal/com.oracle.graal.api.meta/src/com/oracle/graal/api/meta/Signature.java
index 221419c..31fad95 100644
--- a/graal/com.oracle.graal.api.meta/src/com/oracle/graal/api/meta/Signature.java
+++ b/graal/com.oracle.graal.api.meta/src/com/oracle/graal/api/meta/Signature.java
@@ -42,7 +42,7 @@
      * triggering any class loading or resolution.
      *
      * @param index the index into the parameters, with {@code 0} indicating the first parameter
-     * @param accessingClass the context of the type lookup. If accessing class is resolved, its class loader
+     * @param accessingClass the context of the type lookup. If accessing class is provided, its class loader
      *        is used to retrieve an existing resolved type. This value can be {@code null} if the caller does
      *        not care for a resolved type.
      * @return the {@code index}'th argument type
@@ -61,12 +61,12 @@
      * {@linkplain ResolvedJavaType resolved} type if possible but without
      * triggering any class loading or resolution.
      *
-     * @param accessingClass the context of the type lookup. If accessing class is resolved, its class loader
+     * @param accessingClass the context of the type lookup. If accessing class is provided, its class loader
      *        is used to retrieve an existing resolved type. This value can be {@code null} if the caller does
      *        not care for a resolved type.
      * @return the compiler interface type representing the return type
      */
-    JavaType returnType(JavaType accessingClass);
+    JavaType returnType(ResolvedJavaType accessingClass);
 
     /**
      * Gets the return kind of this signature.
