diff --git a/java/java-impl/src/com/intellij/codeInspection/ex/EntryPointsManagerImpl.java b/java/java-impl/src/com/intellij/codeInspection/ex/EntryPointsManagerImpl.java
index 0b0c60e..9797dc6 100644
--- a/java/java-impl/src/com/intellij/codeInspection/ex/EntryPointsManagerImpl.java
+++ b/java/java-impl/src/com/intellij/codeInspection/ex/EntryPointsManagerImpl.java
@@ -241,7 +241,7 @@
       }
     }
 
-    if (isPersistent) {
+    if (!isPersistent) {
       myTemporaryEntryPoints.add(newEntryPoint);
       ((RefElementImpl)newEntryPoint).setEntry(true);
     }
