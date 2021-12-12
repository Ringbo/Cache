diff --git a/src/jvm/clojure/lang/Module.java b/src/jvm/clojure/lang/Module.java
index c99f9c2..0c28aab 100644
--- a/src/jvm/clojure/lang/Module.java
+++ b/src/jvm/clojure/lang/Module.java
@@ -47,7 +47,7 @@
 }
 
 public static TRef intern(String moduleName, String name) throws Exception{
-	Module module = findModule(name);
+	Module module = findModule(moduleName);
 	if(module == null)
 		throw new Exception(String.format("Module %s not found", moduleName));
 	return module.intern(name);
