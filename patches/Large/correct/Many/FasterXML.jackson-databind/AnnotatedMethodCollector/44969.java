diff --git a/src/main/java/com/fasterxml/jackson/databind/introspect/AnnotatedMethodCollector.java b/src/main/java/com/fasterxml/jackson/databind/introspect/AnnotatedMethodCollector.java
index 20b777c..32bbe6c 100644
--- a/src/main/java/com/fasterxml/jackson/databind/introspect/AnnotatedMethodCollector.java
+++ b/src/main/java/com/fasterxml/jackson/databind/introspect/AnnotatedMethodCollector.java
@@ -131,6 +131,9 @@
                     //   may also result in faster method calls (interface calls are slightly
                     //   costlier than regular method calls)
                     b.method = m;
+                    // 23-Aug-2017, tatu: [databind#1705] Also need to change the type resolution context if so
+                    //    (note: mix-over case above shouldn't need it)
+//                    b.typeContext = tc;
                 }
             }
         }
@@ -176,7 +179,7 @@
     }
 
     private final static class MethodBuilder {
-        public final TypeResolutionContext typeContext;
+        public TypeResolutionContext typeContext;
 
         // Method left empty for "floating" mix-in, filled in as need be
         public Method method;
