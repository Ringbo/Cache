diff --git a/core/deserialization/src/org/jetbrains/kotlin/serialization/ProtoBuf.java b/core/deserialization/src/org/jetbrains/kotlin/serialization/ProtoBuf.java
index 7255e23..14dd31e 100644
--- a/core/deserialization/src/org/jetbrains/kotlin/serialization/ProtoBuf.java
+++ b/core/deserialization/src/org/jetbrains/kotlin/serialization/ProtoBuf.java
@@ -17012,7 +17012,7 @@
             ExtendableMessageOrBuilder<TypeAlias> {
 
     /**
-     * <code>optional int32 flags = 1 [default = 0];</code>
+     * <code>optional int32 flags = 1 [default = 6];</code>
      *
      * <pre>
      *hasAnnotations
@@ -17021,7 +17021,7 @@
      */
     boolean hasFlags();
     /**
-     * <code>optional int32 flags = 1 [default = 0];</code>
+     * <code>optional int32 flags = 1 [default = 6];</code>
      *
      * <pre>
      *hasAnnotations
@@ -17259,7 +17259,7 @@
     public static final int FLAGS_FIELD_NUMBER = 1;
     private int flags_;
     /**
-     * <code>optional int32 flags = 1 [default = 0];</code>
+     * <code>optional int32 flags = 1 [default = 6];</code>
      *
      * <pre>
      *hasAnnotations
@@ -17270,7 +17270,7 @@
       return ((bitField0_ & 0x00000001) == 0x00000001);
     }
     /**
-     * <code>optional int32 flags = 1 [default = 0];</code>
+     * <code>optional int32 flags = 1 [default = 6];</code>
      *
      * <pre>
      *hasAnnotations
@@ -17427,7 +17427,7 @@
     }
 
     private void initFields() {
-      flags_ = 0;
+      flags_ = 6;
       name_ = 0;
       typeParameter_ = java.util.Collections.emptyList();
       underlyingType_ = org.jetbrains.kotlin.serialization.ProtoBuf.Type.getDefaultInstance();
@@ -17644,7 +17644,7 @@
 
       public Builder clear() {
         super.clear();
-        flags_ = 0;
+        flags_ = 6;
         bitField0_ = (bitField0_ & ~0x00000001);
         name_ = 0;
         bitField0_ = (bitField0_ & ~0x00000002);
@@ -17822,9 +17822,9 @@
       }
       private int bitField0_;
 
-      private int flags_ ;
+      private int flags_ = 6;
       /**
-       * <code>optional int32 flags = 1 [default = 0];</code>
+       * <code>optional int32 flags = 1 [default = 6];</code>
        *
        * <pre>
        *hasAnnotations
@@ -17835,7 +17835,7 @@
         return ((bitField0_ & 0x00000001) == 0x00000001);
       }
       /**
-       * <code>optional int32 flags = 1 [default = 0];</code>
+       * <code>optional int32 flags = 1 [default = 6];</code>
        *
        * <pre>
        *hasAnnotations
@@ -17846,7 +17846,7 @@
         return flags_;
       }
       /**
-       * <code>optional int32 flags = 1 [default = 0];</code>
+       * <code>optional int32 flags = 1 [default = 6];</code>
        *
        * <pre>
        *hasAnnotations
@@ -17860,7 +17860,7 @@
         return this;
       }
       /**
-       * <code>optional int32 flags = 1 [default = 0];</code>
+       * <code>optional int32 flags = 1 [default = 6];</code>
        *
        * <pre>
        *hasAnnotations
@@ -17869,7 +17869,7 @@
        */
       public Builder clearFlags() {
         bitField0_ = (bitField0_ & ~0x00000001);
-        flags_ = 0;
+        flags_ = 6;
         
         return this;
       }
