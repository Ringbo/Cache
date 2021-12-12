diff --git a/src/proxy/net/sf/cglib/EnhancerGenerator.java b/src/proxy/net/sf/cglib/EnhancerGenerator.java
index fdf2a89..2071a75 100644
--- a/src/proxy/net/sf/cglib/EnhancerGenerator.java
+++ b/src/proxy/net/sf/cglib/EnhancerGenerator.java
@@ -197,7 +197,7 @@
                 Object methodKey = MethodWrapper.newInstance(method);
                 Method other = (Method)methodMap.get(methodKey);
                 
-                if( other != null && compare( other, method ) > 0 ){
+                if( other != null && compare( other, method ) >= 0 ){
                     
                     checkReturnTypesEqual(method, other);
                    
