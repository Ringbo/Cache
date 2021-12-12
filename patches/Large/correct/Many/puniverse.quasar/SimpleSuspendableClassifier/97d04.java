diff --git a/quasar-core/src/main/java/co/paralleluniverse/fibers/instrument/SimpleSuspendableClassifier.java b/quasar-core/src/main/java/co/paralleluniverse/fibers/instrument/SimpleSuspendableClassifier.java
index ce56a91..391a78f 100644
--- a/quasar-core/src/main/java/co/paralleluniverse/fibers/instrument/SimpleSuspendableClassifier.java
+++ b/quasar-core/src/main/java/co/paralleluniverse/fibers/instrument/SimpleSuspendableClassifier.java
@@ -46,7 +46,7 @@
     }
 
     SimpleSuspendableClassifier(String suspendablesFileName) {
-        readSuspendablesFile(suspendablesFileName, suspendables, suspendables);
+        readSuspendablesFile(suspendablesFileName, suspendables, suspendableClasses);
     }
 
     Set<String> getSuspendables() {
