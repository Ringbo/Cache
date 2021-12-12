diff --git a/weld/src/main/java/org/jboss/as/weld/services/bootstrap/WeldEjbInjectionServices.java b/weld/src/main/java/org/jboss/as/weld/services/bootstrap/WeldEjbInjectionServices.java
index 7440427..cc76aa6 100644
--- a/weld/src/main/java/org/jboss/as/weld/services/bootstrap/WeldEjbInjectionServices.java
+++ b/weld/src/main/java/org/jboss/as/weld/services/bootstrap/WeldEjbInjectionServices.java
@@ -128,7 +128,7 @@
             Class<?> injectionPointRawType = Reflections.getRawType(injectionPoint.getType());
             //we just compare names, as for remote views the actual classes may be loaded from different class loaders
             Class<?> c = clazz;
-            boolean found = true;
+            boolean found = false;
             while (c != null && c != Object.class) {
                 if (injectionPointRawType.getName().equals(c.getName())) {
                     found = true;
