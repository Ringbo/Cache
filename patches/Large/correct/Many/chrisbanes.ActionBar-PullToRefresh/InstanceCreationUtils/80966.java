diff --git a/library/src/uk/co/senab/actionbarpulltorefresh/library/InstanceCreationUtils.java b/library/src/uk/co/senab/actionbarpulltorefresh/library/InstanceCreationUtils.java
index 440624d..033a182 100644
--- a/library/src/uk/co/senab/actionbarpulltorefresh/library/InstanceCreationUtils.java
+++ b/library/src/uk/co/senab/actionbarpulltorefresh/library/InstanceCreationUtils.java
@@ -56,7 +56,7 @@
         for (final Map.Entry<Class, Class> entry : entries) {
             if (entry.getKey().isInstance(view)) {
                 return InstanceCreationUtils.newInstance(view.getContext(),
-                        entry.getValue(), VIEW_DELEGATE_CONSTRUCTOR_SIGNATURE, null);
+                        entry.getValue(), VIEW_DELEGATE_CONSTRUCTOR_SIGNATURE);
             }
         }
         return null;
