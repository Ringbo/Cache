diff --git a/drools-compiler/src/test/java/org/drools/compiler/kproject/KieProjectDefaultClasspathTest.java b/drools-compiler/src/test/java/org/drools/compiler/kproject/KieProjectDefaultClasspathTest.java
index 8ecf708..e68da03 100644
--- a/drools-compiler/src/test/java/org/drools/compiler/kproject/KieProjectDefaultClasspathTest.java
+++ b/drools-compiler/src/test/java/org/drools/compiler/kproject/KieProjectDefaultClasspathTest.java
@@ -61,7 +61,7 @@
             };
             ks.registerListener(listener);
 
-            KieContainer kContainer = ks.getKieClasspathContainer();
+            KieContainer kContainer = ks.newKieClasspathContainer();
 
             assertEquals(4, kieModulesCounter.get());
 
