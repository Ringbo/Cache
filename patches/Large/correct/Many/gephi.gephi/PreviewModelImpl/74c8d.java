diff --git a/PreviewAPI/src/org/gephi/preview/PreviewModelImpl.java b/PreviewAPI/src/org/gephi/preview/PreviewModelImpl.java
index bff33e9..1438466 100644
--- a/PreviewAPI/src/org/gephi/preview/PreviewModelImpl.java
+++ b/PreviewAPI/src/org/gephi/preview/PreviewModelImpl.java
@@ -286,16 +286,16 @@
      */
     private void completeManagedRenderersListIfNecessary() {
         if (managedRenderers != null) {
-            Set<Renderer> existing = new HashSet<Renderer>();
+            Set<String> existing = new HashSet<String>();
             for (ManagedRenderer mr : managedRenderers) {
-                existing.add(mr.getRenderer());
+                existing.add(mr.getRenderer().getClass().getName());
             }
 
             List<ManagedRenderer> completeManagedRenderersList = new ArrayList<ManagedRenderer>();
             completeManagedRenderersList.addAll(Arrays.asList(managedRenderers));
 
             for (Renderer renderer : previewController.getRegisteredRenderers()) {
-                if (!existing.contains(renderer)) {
+                if (!existing.contains(renderer.getClass().getName())) {
                     completeManagedRenderersList.add(new ManagedRenderer(renderer, false));
                 }
             }
@@ -336,7 +336,7 @@
         //Validate no null ManagedRenderers
         for (int i = 0; i < managedRenderers.length; i++) {
             if (managedRenderers[i] == null) {
-                throw new IllegalArgumentException("managedRenderers should not contains null values");
+                throw new IllegalArgumentException("managedRenderers should not contain null values");
             }
         }
 
