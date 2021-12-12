diff --git a/build-common/test/org/jetbrains/kotlin/serialization/DebugProtoBuf.java b/build-common/test/org/jetbrains/kotlin/serialization/DebugProtoBuf.java
index 5390fc8..4d84337 100644
--- a/build-common/test/org/jetbrains/kotlin/serialization/DebugProtoBuf.java
+++ b/build-common/test/org/jetbrains/kotlin/serialization/DebugProtoBuf.java
@@ -22172,7 +22172,7 @@
           ExtendableMessageOrBuilder<TypeAlias> {
 
     /**
-     * <code>optional int32 flags = 1 [default = 0];</code>
+     * <code>optional int32 flags = 1 [default = 6];</code>
      *
      * <pre>
      *hasAnnotations
@@ -22181,7 +22181,7 @@
      */
     boolean hasFlags();
     /**
-     * <code>optional int32 flags = 1 [default = 0];</code>
+     * <code>optional int32 flags = 1 [default = 6];</code>
      *
      * <pre>
      *hasAnnotations
@@ -22455,7 +22455,7 @@
     public static final int FLAGS_FIELD_NUMBER = 1;
     private int flags_;
     /**
-     * <code>optional int32 flags = 1 [default = 0];</code>
+     * <code>optional int32 flags = 1 [default = 6];</code>
      *
      * <pre>
      *hasAnnotations
@@ -22466,7 +22466,7 @@
       return ((bitField0_ & 0x00000001) == 0x00000001);
     }
     /**
-     * <code>optional int32 flags = 1 [default = 0];</code>
+     * <code>optional int32 flags = 1 [default = 6];</code>
      *
      * <pre>
      *hasAnnotations
@@ -22635,7 +22635,7 @@
     }
 
     private void initFields() {
-      flags_ = 0;
+      flags_ = 6;
       name_ = 0;
       typeParameter_ = java.util.Collections.emptyList();
       underlyingType_ = org.jetbrains.kotlin.serialization.DebugProtoBuf.Type.getDefaultInstance();
@@ -22881,7 +22881,7 @@
 
       public Builder clear() {
         super.clear();
-        flags_ = 0;
+        flags_ = 6;
         bitField0_ = (bitField0_ & ~0x00000001);
         name_ = 0;
         bitField0_ = (bitField0_ & ~0x00000002);
@@ -23137,9 +23137,9 @@
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
@@ -23150,7 +23150,7 @@
         return ((bitField0_ & 0x00000001) == 0x00000001);
       }
       /**
-       * <code>optional int32 flags = 1 [default = 0];</code>
+       * <code>optional int32 flags = 1 [default = 6];</code>
        *
        * <pre>
        *hasAnnotations
@@ -23161,7 +23161,7 @@
         return flags_;
       }
       /**
-       * <code>optional int32 flags = 1 [default = 0];</code>
+       * <code>optional int32 flags = 1 [default = 6];</code>
        *
        * <pre>
        *hasAnnotations
@@ -23175,7 +23175,7 @@
         return this;
       }
       /**
-       * <code>optional int32 flags = 1 [default = 0];</code>
+       * <code>optional int32 flags = 1 [default = 6];</code>
        *
        * <pre>
        *hasAnnotations
@@ -23184,7 +23184,7 @@
        */
       public Builder clearFlags() {
         bitField0_ = (bitField0_ & ~0x00000001);
-        flags_ = 0;
+        flags_ = 6;
         onChanged();
         return this;
       }
@@ -24642,7 +24642,7 @@
       "ararg_element_type\030\004 \001(\0132(.org.jetbrains" +
       ".kotlin.serialization.Type\022\036\n\026vararg_ele",
       "ment_type_id\030\006 \001(\005*\005\010d\020\310\001\"\201\003\n\tTypeAlias\022" +
-      "\020\n\005flags\030\001 \001(\005:\0010\022\022\n\004name\030\002 \002(\005B\004\210\265\030\001\022I\n" +
+      "\020\n\005flags\030\001 \001(\005:\0016\022\022\n\004name\030\002 \002(\005B\004\210\265\030\001\022I\n" +
       "\016type_parameter\030\003 \003(\01321.org.jetbrains.ko" +
       "tlin.serialization.TypeParameter\022A\n\017unde" +
       "rlying_type\030\004 \001(\0132(.org.jetbrains.kotlin" +
