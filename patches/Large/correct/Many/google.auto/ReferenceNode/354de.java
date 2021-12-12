diff --git a/value/src/main/java/com/google/auto/value/processor/escapevelocity/ReferenceNode.java b/value/src/main/java/com/google/auto/value/processor/escapevelocity/ReferenceNode.java
index 987adec..e32234a 100644
--- a/value/src/main/java/com/google/auto/value/processor/escapevelocity/ReferenceNode.java
+++ b/value/src/main/java/com/google/auto/value/processor/escapevelocity/ReferenceNode.java
@@ -413,7 +413,7 @@
       String pkg = packageNameOf(c);
       Object module = CLASS_GET_MODULE_METHOD.invoke(c);
       return (Boolean) MODULE_IS_EXPORTED_METHOD.invoke(module, pkg);
-    } catch (ReflectiveOperationException e) {
+    } catch (Exception e) {
       return false;
     }
   }
@@ -428,7 +428,7 @@
       classGetModuleMethod = Class.class.getMethod("getModule");
       Class<?> moduleClass = classGetModuleMethod.getReturnType();
       moduleIsExportedMethod = moduleClass.getMethod("isExported", String.class);
-    } catch (ReflectiveOperationException e) {
+    } catch (Exception e) {
       classGetModuleMethod = null;
       moduleIsExportedMethod = null;
     }
