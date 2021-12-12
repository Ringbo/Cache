diff --git a/src/main/java/com/fasterxml/jackson/databind/type/SimpleType.java b/src/main/java/com/fasterxml/jackson/databind/type/SimpleType.java
index bd2ad00..1c741ec 100644
--- a/src/main/java/com/fasterxml/jackson/databind/type/SimpleType.java
+++ b/src/main/java/com/fasterxml/jackson/databind/type/SimpleType.java
@@ -123,7 +123,16 @@
             return this;
         }
         // Should we check that there is a sub-class relationship?
-        return new SimpleType(subclass, _bindings, _superClass, _superInterfaces,
+        // 15-Jan-2016, tatu: Almost yes, but there are some complications with
+        //    placeholder values, so no.
+        /*
+        if (!_class.isAssignableFrom(subclass)) {
+            throw new IllegalArgumentException("Class "+subclass.getName()+" not sub-type of "
+                    +_class.getName());
+        }
+        */
+        // 15-Jan-2015, tatu: Not correct; should really re-resolve...
+        return new SimpleType(subclass, _bindings, this, _superInterfaces,
                 _valueHandler, _typeHandler, _asStatic);
     }
     
