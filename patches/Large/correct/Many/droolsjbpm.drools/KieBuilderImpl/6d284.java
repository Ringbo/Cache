diff --git a/drools-compiler/src/main/java/org/drools/compiler/kie/builder/impl/KieBuilderImpl.java b/drools-compiler/src/main/java/org/drools/compiler/kie/builder/impl/KieBuilderImpl.java
index 88c8134..8ff1bce 100644
--- a/drools-compiler/src/main/java/org/drools/compiler/kie/builder/impl/KieBuilderImpl.java
+++ b/drools-compiler/src/main/java/org/drools/compiler/kie/builder/impl/KieBuilderImpl.java
@@ -300,7 +300,7 @@
         return getKieModule(false);
     }
 
-    KieModule getKieModuleIgnoringErrors() {
+    public KieModule getKieModuleIgnoringErrors() {
         return getKieModule(true);
     }
 
