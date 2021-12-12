diff --git a/grails-core/src/main/groovy/org/codehaus/groovy/grails/commons/metaclass/LazyMetaPropertyMap.java b/grails-core/src/main/groovy/org/codehaus/groovy/grails/commons/metaclass/LazyMetaPropertyMap.java
index 14d8285..5d6c7ba 100644
--- a/grails-core/src/main/groovy/org/codehaus/groovy/grails/commons/metaclass/LazyMetaPropertyMap.java
+++ b/grails-core/src/main/groovy/org/codehaus/groovy/grails/commons/metaclass/LazyMetaPropertyMap.java
@@ -162,7 +162,7 @@
     public void putAll(Map map) {
         for (Iterator i = map.keySet().iterator(); i.hasNext();) {
             Object key = i.next();
-            put(key, map.get(i));
+            put(key, map.get(key));
         }
     }
 
