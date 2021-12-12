diff --git a/spock-core/src/main/java/org/spockframework/runtime/ExtensionRegistry.java b/spock-core/src/main/java/org/spockframework/runtime/ExtensionRegistry.java
index 3c39182..50b8c34 100644
--- a/spock-core/src/main/java/org/spockframework/runtime/ExtensionRegistry.java
+++ b/spock-core/src/main/java/org/spockframework/runtime/ExtensionRegistry.java
@@ -56,7 +56,7 @@
     if (!IGlobalExtension.class.isAssignableFrom(clazz))
       throw new ExtensionException(
           "Class '%s' is not a valid global extension because it is not derived from '%s'"
-      ).format(clazz.getName(), IGlobalExtension.class.getName());
+      ).withArgs(clazz.getName(), IGlobalExtension.class.getName());
     return clazz;
   }
 
@@ -64,7 +64,7 @@
     try {
       return (IGlobalExtension)clazz.newInstance();
     } catch (Exception e) {
-      throw new ExtensionException("Failed to instantiate extension '%s'", e).format(clazz.getName());
+      throw new ExtensionException("Failed to instantiate extension '%s'", e).withArgs(clazz.getName());
     }
   }
 
@@ -99,10 +99,9 @@
     try {
       return type.newInstance();
     } catch (InstantiationException e) {
-      // TODO: need better exception type
-      throw new RuntimeException(String.format("Cannot instantiate configuration class %s", type));
+      throw new ExtensionException("Cannot instantiate configuration class %s").withArgs(type);
     } catch (IllegalAccessException e) {
-      throw new RuntimeException(String.format("Configuration class '%s' has no public no-arg constructor", type));
+      throw new ExtensionException("Configuration class '%s' has no public no-arg constructor").withArgs(type);
     }
   }
 }
