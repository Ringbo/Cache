diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/FulfillmentOptionImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/FulfillmentOptionImpl.java
index 914a82e..0c2288a 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/FulfillmentOptionImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/FulfillmentOptionImpl.java
@@ -45,7 +45,7 @@
 @Table(name = "BLC_FULFILLMENT_OPTION")
 @Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "blStandardElements")
 @AdminPresentationClass(friendlyName = "Base Fulfillment Option")
-public abstract class FulfillmentOptionImpl implements FulfillmentOption {
+public class FulfillmentOptionImpl implements FulfillmentOption {
 
     private static final long serialVersionUID = 1L;
 
