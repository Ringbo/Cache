diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/values/PValue.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/values/PValue.java
index 08eeb13..0cee2ca 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/values/PValue.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/values/PValue.java
@@ -28,12 +28,12 @@
   /**
    * Returns the name of this {@link PValue}.
    */
-  public String getName();
+  String getName();
 
   /**
    * Returns the {@link AppliedPTransform} that this {@link PValue} is an output of.
    *
    * <p>For internal use only.
    */
-  public AppliedPTransform<?, ?, ?> getProducingTransformInternal();
+  AppliedPTransform<?, ?, ?> getProducingTransformInternal();
 }
