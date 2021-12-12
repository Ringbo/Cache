diff --git a/platform/core-impl/src/com/intellij/psi/AbstractFileViewProvider.java b/platform/core-impl/src/com/intellij/psi/AbstractFileViewProvider.java
index 3ae98f9..4685e31 100644
--- a/platform/core-impl/src/com/intellij/psi/AbstractFileViewProvider.java
+++ b/platform/core-impl/src/com/intellij/psi/AbstractFileViewProvider.java
@@ -310,7 +310,7 @@
   }
 
   @Override
-  public final long getModificationStamp() {
+  public long getModificationStamp() {
     return getContent().getModificationStamp();
   }
 
