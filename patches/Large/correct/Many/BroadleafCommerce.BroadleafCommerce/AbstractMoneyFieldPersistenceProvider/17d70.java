diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/provider/AbstractMoneyFieldPersistenceProvider.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/provider/AbstractMoneyFieldPersistenceProvider.java
index 79f12a7..1d6898f 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/provider/AbstractMoneyFieldPersistenceProvider.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/provider/AbstractMoneyFieldPersistenceProvider.java
@@ -26,7 +26,7 @@
  * 
  * @author Andre Azzolini (apazzolini)
  */
-public abstract class AbstractMoneyFieldPersistenceProvider extends PersistenceProviderAdapter {
+public abstract class AbstractMoneyFieldPersistenceProvider extends FieldPersistenceProviderAdapter {
     
     public String getFormattedDisplayValue(BigDecimal value, Locale locale, Currency currency) {
         NumberFormat format = NumberFormat.getCurrencyInstance(locale);
