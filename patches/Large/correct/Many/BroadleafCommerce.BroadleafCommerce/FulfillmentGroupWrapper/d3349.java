diff --git a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/FulfillmentGroupWrapper.java b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/FulfillmentGroupWrapper.java
index 2611c98..de86813 100644
--- a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/FulfillmentGroupWrapper.java
+++ b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/FulfillmentGroupWrapper.java
@@ -90,7 +90,7 @@
             List<FulfillmentGroupItemWrapper> fulfillmentGroupItemWrappers = new ArrayList<FulfillmentGroupItemWrapper>();
             for (FulfillmentGroupItem fgi : fgs) {
                 FulfillmentGroupItemWrapper fulfillmentGroupItemWrapper = (FulfillmentGroupItemWrapper) context.getBean(FulfillmentGroupItemWrapper.class.getName());
-                fulfillmentGroupItemWrapper.wrapDetails(fgi, request);
+                fulfillmentGroupItemWrapper.wrapSummary(fgi, request);
                 fulfillmentGroupItemWrappers.add(fulfillmentGroupItemWrapper);
             }
             this.fulfillmentGroupItems = fulfillmentGroupItemWrappers;
