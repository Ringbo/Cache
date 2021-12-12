diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/EjbIIOPDeploymentUnitProcessor.java b/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/EjbIIOPDeploymentUnitProcessor.java
index 885db0a..8bb9a3b 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/EjbIIOPDeploymentUnitProcessor.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/EjbIIOPDeploymentUnitProcessor.java
@@ -193,11 +193,11 @@
             beanMethodMap.put(op.getIDLName(), new SkeletonStrategy(method));
             final OperationAnalysis setop = remoteAttrs[i].getMutatorAnalysis();
             if (setop != null) {
-                logger.debug("    " + op.getJavaName() + "\n                " + op.getIDLName());
+                logger.debug("    " + setop.getJavaName() + "\n                " + setop.getIDLName());
                 //translate to the deployment reflection index method
                 //TODO: this needs to be fixed so it just returns the correct method
                 final Method realSetmethod = translateMethod(deploymentReflectionIndex, setop);
-                beanMethodMap.put(op.getIDLName(), new SkeletonStrategy(realSetmethod));
+                beanMethodMap.put(setop.getIDLName(), new SkeletonStrategy(realSetmethod));
             }
         }
 
