diff --git a/substratevm/src/com.oracle.svm.graal/src/com/oracle/svm/graal/meta/SubstrateMemoryAccessProviderImpl.java b/substratevm/src/com.oracle.svm.graal/src/com/oracle/svm/graal/meta/SubstrateMemoryAccessProviderImpl.java
index 277f081..1a713de 100644
--- a/substratevm/src/com.oracle.svm.graal/src/com/oracle/svm/graal/meta/SubstrateMemoryAccessProviderImpl.java
+++ b/substratevm/src/com.oracle.svm.graal/src/com/oracle/svm/graal/meta/SubstrateMemoryAccessProviderImpl.java
@@ -1,5 +1,5 @@
 /*
- * Copyright (c) 2014, 2017, Oracle and/or its affiliates. All rights reserved.
+ * Copyright (c) 2014, 2018, Oracle and/or its affiliates. All rights reserved.
  * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
  *
  * This code is free software; you can redistribute it and/or modify it
@@ -57,7 +57,7 @@
     private SubstrateMemoryAccessProviderImpl() {
     }
 
-    public JavaConstant readUnsafeConstant(JavaKind kind, JavaConstant base, long displacement, boolean isVolatile) {
+    static JavaConstant readUnsafeConstant(JavaKind kind, JavaConstant base, long displacement, boolean isVolatile) {
         if (kind == JavaKind.Object) {
             return readObjectConstant(base, displacement, null, isVolatile);
         }
@@ -156,7 +156,7 @@
         return readPrimitiveConstant(kind, baseConstant, displacement, bits, false);
     }
 
-    JavaConstant readPrimitiveConstant(JavaKind kind, Constant baseConstant, long displacement, int bits, boolean isVolatile) {
+    private static JavaConstant readPrimitiveConstant(JavaKind kind, Constant baseConstant, long displacement, int bits, boolean isVolatile) {
         SignedWord offset = WordFactory.signed(displacement);
         long rawValue;
 
