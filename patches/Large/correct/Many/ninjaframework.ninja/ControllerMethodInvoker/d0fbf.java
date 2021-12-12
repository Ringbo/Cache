diff --git a/ninja-core/src/main/java/ninja/params/ControllerMethodInvoker.java b/ninja-core/src/main/java/ninja/params/ControllerMethodInvoker.java
index c1fdfa7..d2779d1 100644
--- a/ninja-core/src/main/java/ninja/params/ControllerMethodInvoker.java
+++ b/ninja-core/src/main/java/ninja/params/ControllerMethodInvoker.java
@@ -65,7 +65,7 @@
                         injector);
             } catch (RoutingException e) {
                 throw new RoutingException("Error building argument extractor for parameter " + i +
-                        " in method " + method.getClass().getName() + "." + method.getName() + "()", e);
+                        " in method " + method.getDeclaringClass().getName() + "." + method.getName() + "()", e);
             }
         }
 
@@ -75,7 +75,7 @@
             if (argumentExtractors[i] == null) {
                 if (bodyAsFound) {
                     throw new RoutingException("Only one parameter may be deserialised as the body " +
-                            method.getClass().getName() + "." + method.getName() + "()");
+                            method.getDeclaringClass().getName() + "." + method.getName() + "()");
                 } else {
                     argumentExtractors[i] = new ArgumentExtractors.BodyAsExtractor(paramTypes[i]);
                     bodyAsFound = true;
