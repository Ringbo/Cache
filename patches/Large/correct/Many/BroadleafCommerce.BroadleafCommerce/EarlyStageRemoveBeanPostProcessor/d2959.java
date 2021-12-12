diff --git a/common/src/main/java/org/broadleafcommerce/common/extensibility/context/merge/EarlyStageRemoveBeanPostProcessor.java b/common/src/main/java/org/broadleafcommerce/common/extensibility/context/merge/EarlyStageRemoveBeanPostProcessor.java
index 5c0f3e0..15e5f4f 100644
--- a/common/src/main/java/org/broadleafcommerce/common/extensibility/context/merge/EarlyStageRemoveBeanPostProcessor.java
+++ b/common/src/main/java/org/broadleafcommerce/common/extensibility/context/merge/EarlyStageRemoveBeanPostProcessor.java
@@ -29,7 +29,7 @@
  * @see org.broadleafcommerce.common.extensibility.context.merge.AbstractRemoveBeanPostProcessor
  * @author Jeff Fischer
  */
-public class EarlyStageRemoveBeanPostProcessor extends AbstractMergeBeanPostProcessor implements PriorityOrdered {
+public class EarlyStageRemoveBeanPostProcessor extends AbstractRemoveBeanPostProcessor implements PriorityOrdered {
 
     protected int order = Integer.MIN_VALUE;
 
