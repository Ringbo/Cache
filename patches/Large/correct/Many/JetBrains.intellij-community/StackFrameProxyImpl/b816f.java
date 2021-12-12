diff --git a/source/com/intellij/debugger/jdi/StackFrameProxyImpl.java b/source/com/intellij/debugger/jdi/StackFrameProxyImpl.java
index 4918216..7bd6ee1 100644
--- a/source/com/intellij/debugger/jdi/StackFrameProxyImpl.java
+++ b/source/com/intellij/debugger/jdi/StackFrameProxyImpl.java
@@ -41,7 +41,7 @@
     checkValid();
     if (myIsObsolete == null) {
       try {
-        boolean isObsolete = (getVirtualMachine().versionHigher("1.4") && location().method().isObsolete());
+        boolean isObsolete = (getVirtualMachine().canRedefineClasses() && location().method().isObsolete());
         myIsObsolete = isObsolete? Boolean.TRUE : Boolean.FALSE;
       }
       catch (InvalidStackFrameException e) {
