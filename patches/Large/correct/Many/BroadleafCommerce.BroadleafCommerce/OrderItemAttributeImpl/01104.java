diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/OrderItemAttributeImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/OrderItemAttributeImpl.java
index ab706f5..61f761d 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/OrderItemAttributeImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/OrderItemAttributeImpl.java
@@ -171,6 +171,6 @@
             return false;
         }
         
-        return value.equals(((OrderAttribute) obj).getValue());
+        return value.equals(((OrderItemAttribute) obj).getValue());
     }
 }
