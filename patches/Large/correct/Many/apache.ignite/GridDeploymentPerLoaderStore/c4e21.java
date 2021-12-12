diff --git a/modules/core/java/org/gridgain/grid/kernal/managers/deployment/GridDeploymentPerLoaderStore.java b/modules/core/java/org/gridgain/grid/kernal/managers/deployment/GridDeploymentPerLoaderStore.java
index deb7c8c..3d22500 100644
--- a/modules/core/java/org/gridgain/grid/kernal/managers/deployment/GridDeploymentPerLoaderStore.java
+++ b/modules/core/java/org/gridgain/grid/kernal/managers/deployment/GridDeploymentPerLoaderStore.java
@@ -282,7 +282,7 @@
                     false);
 
                 dep = new IsolatedDeployment(meta.deploymentMode(), clsLdr, meta.classLoaderId(),
-                    meta.userVersion(), meta.senderNodeId(), meta.className());
+                    meta.userVersion(), snd, meta.className());
 
                 cache.put(meta.classLoaderId(), dep);
 
@@ -386,21 +386,21 @@
      */
     private class IsolatedDeployment extends GridDeployment {
         /** Sender node ID. */
-        private final UUID sndNodeId;
+        private final GridNode sndNode;
 
         /**
          * @param depMode Deployment mode.
          * @param clsLdr Class loader.
          * @param clsLdrId Class loader ID.
          * @param userVer User version.
-         * @param sndNodeId Sender node ID.
+         * @param sndNode Sender node.
          * @param sampleClsName Sample class name.
          */
         IsolatedDeployment(GridDeploymentMode depMode, ClassLoader clsLdr, GridUuid clsLdrId,
-            String userVer, UUID sndNodeId, String sampleClsName) {
+            String userVer, GridNode sndNode, String sampleClsName) {
             super(depMode, clsLdr, clsLdrId, userVer, sampleClsName, false);
 
-            this.sndNodeId = sndNodeId;
+            this.sndNode = sndNode;
         }
 
         /**
@@ -409,7 +409,7 @@
          * @return Property senderNodeId.
          */
         UUID senderNodeId() {
-            return sndNodeId;
+            return sndNode.id();
         }
 
         /** {@inheritDoc} */
@@ -435,7 +435,7 @@
 
                 // Record task event.
                 evt.type(isTask ? EVT_TASK_DEPLOYED : EVT_CLASS_DEPLOYED);
-                evt.node(ctx.discovery().node(sndNodeId));
+                evt.node(sndNode);
                 evt.message(msg);
                 evt.alias(cls.getName());
 
@@ -466,7 +466,7 @@
                     if (evts.isRecordable(!isTask ? EVT_CLASS_UNDEPLOYED : EVT_TASK_UNDEPLOYED)) {
                         GridDeploymentEvent evt = new GridDeploymentEvent();
 
-                        evt.node(ctx.discovery().node(sndNodeId));
+                        evt.node(sndNode);
                         evt.message(msg);
                         evt.type(!isTask ? EVT_CLASS_UNDEPLOYED : EVT_TASK_UNDEPLOYED);
                         evt.alias(depCls.getKey());
