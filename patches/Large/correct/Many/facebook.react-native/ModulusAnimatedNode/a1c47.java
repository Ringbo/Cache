diff --git a/ReactAndroid/src/main/java/com/facebook/react/animated/ModulusAnimatedNode.java b/ReactAndroid/src/main/java/com/facebook/react/animated/ModulusAnimatedNode.java
index 11fa7fc..2bce6b8 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/animated/ModulusAnimatedNode.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/animated/ModulusAnimatedNode.java
@@ -17,14 +17,14 @@
 
   private final NativeAnimatedNodesManager mNativeAnimatedNodesManager;
   private final int mInputNode;
-  private final int mModulus;
+  private final double mModulus;
 
   public ModulusAnimatedNode(
       ReadableMap config,
       NativeAnimatedNodesManager nativeAnimatedNodesManager) {
     mNativeAnimatedNodesManager = nativeAnimatedNodesManager;
     mInputNode = config.getInt("input");
-    mModulus = config.getInt("modulus");
+    mModulus = config.getDouble("modulus");
   }
 
   @Override
