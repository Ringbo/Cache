diff --git a/storm-core/src/jvm/backtype/storm/utils/Utils.java b/storm-core/src/jvm/backtype/storm/utils/Utils.java
index b210070..0e70e04 100644
--- a/storm-core/src/jvm/backtype/storm/utils/Utils.java
+++ b/storm-core/src/jvm/backtype/storm/utils/Utils.java
@@ -596,7 +596,7 @@
     }
 
 
-    public static IFn loadClojureFn(String namespace, String name) {
+    public static synchronized IFn loadClojureFn(String namespace, String name) {
         try {
             clojure.lang.Compiler.eval(RT.readString("(require '" + namespace + ")"));
         } catch (Exception e) {
