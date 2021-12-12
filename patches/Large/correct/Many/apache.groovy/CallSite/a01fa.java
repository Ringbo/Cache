diff --git a/src/main/org/codehaus/groovy/runtime/callsite/CallSite.java b/src/main/org/codehaus/groovy/runtime/callsite/CallSite.java
index 8758f5c..60508c6 100644
--- a/src/main/org/codehaus/groovy/runtime/callsite/CallSite.java
+++ b/src/main/org/codehaus/groovy/runtime/callsite/CallSite.java
@@ -338,7 +338,7 @@
                 }
 
                 public Object callGetProperty(Object receiver) {
-                    if (((GroovyObject)receiver).getMetaClass() != metaClass)
+                    if (!(receiver instanceof GroovyObject) || ((GroovyObject)receiver).getMetaClass() != metaClass)
                       return super.callGetProperty(receiver);
 
                     return metaClass.getProperty(receiver, name);
@@ -354,7 +354,7 @@
                     }
 
                     public Object callGetProperty(Object receiver) {
-                        if (((GroovyObject)receiver).getMetaClass() != metaClass)
+                        if (!(receiver instanceof GroovyObject) || ((GroovyObject)receiver).getMetaClass() != metaClass)
                           return super.callGetProperty(receiver);
 
                         if (GroovyCategorySupport.hasCategoryInAnyThread())
@@ -371,7 +371,7 @@
                     }
 
                     public Object callGetProperty(Object receiver) {
-                        if (((GroovyObject)receiver).getMetaClass() != metaClass)
+                        if (!(receiver instanceof GroovyObject) || ((GroovyObject)receiver).getMetaClass() != metaClass)
                           return super.callGetProperty(receiver);
 
                         return metaClass.getProperty(receiver, name);
