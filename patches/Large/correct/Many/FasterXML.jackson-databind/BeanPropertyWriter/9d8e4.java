diff --git a/src/main/java/com/fasterxml/jackson/databind/ser/BeanPropertyWriter.java b/src/main/java/com/fasterxml/jackson/databind/ser/BeanPropertyWriter.java
index c4ca8b8..b23fe15 100644
--- a/src/main/java/com/fasterxml/jackson/databind/ser/BeanPropertyWriter.java
+++ b/src/main/java/com/fasterxml/jackson/databind/ser/BeanPropertyWriter.java
@@ -98,8 +98,10 @@
      *<p>
      * NOTE: do NOT change name of this field; it is accessed by
      * Afterburner module.
+     * ALSO NOTE: ... and while it really ought to be `SerializableString`,
+     * changing that is also binary-incompatible change. So nope.
      */
-    protected final SerializableString _name;
+    protected final SerializedString _name;
 
     /**
      * Wrapper name to use for this element, if any
@@ -224,7 +226,7 @@
         this(base, base._name);
     }
 
-    protected BeanPropertyWriter(BeanPropertyWriter base, SerializableString name) {
+    protected BeanPropertyWriter(BeanPropertyWriter base, SerializedString name) {
         _name = name;
         _wrapperName = base._wrapperName;
 
