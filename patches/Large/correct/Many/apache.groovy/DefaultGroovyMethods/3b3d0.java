diff --git a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
index dc83fc1..5945c7e 100644
--- a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
+++ b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
@@ -2905,7 +2905,7 @@
     private static Object makeSubClass(Map map, Class clazz) {
         String name = shortName(clazz.getName()) + "_groovyProxy";
         StringBuffer buffer = new StringBuffer();
-        // add class header with constrcutor
+        // add class header with constructor
         buffer.append("class ").append(name).append(" extends ")
                 .append(clazz.getName()).append(" {\n")
                 .append("    private closureMap\n    ")
@@ -2935,7 +2935,8 @@
             Method method = (Method) iterator1.next();
             if (map.containsKey(method.getName())) {
                 selectedMethods.add(method.getName());
-                buffer.append("    ").append(method.getReturnType().getSimpleName())
+                // TODO: getName() was getSimpleName() - move out to jvm5 package?
+                buffer.append("    ").append(method.getReturnType().getName())
                         .append(" ").append(method.getName()).append("(");
                 Class[] parameterTypes = method.getParameterTypes();
                 boolean first = true;
@@ -2946,7 +2947,8 @@
                     } else {
                         first = false;
                     }
-                    buffer.append(parameter.getSimpleName()).append(" ")
+                    // TODO: getName() was getSimpleName() - move out to jvm5 package?
+                    buffer.append(parameter.getName()).append(" ")
                             .append("p").append(parameterTypeIndex);
                 }
                 buffer.append(") { this.@closureMap['").append(method.getName()).append("'] (");
