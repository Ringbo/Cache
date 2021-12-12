diff --git a/liquibase-core/src/main/java/liquibase/parser/NamespaceDetailsFactory.java b/liquibase-core/src/main/java/liquibase/parser/NamespaceDetailsFactory.java
index 2fcd3be..fd11133 100644
--- a/liquibase-core/src/main/java/liquibase/parser/NamespaceDetailsFactory.java
+++ b/liquibase-core/src/main/java/liquibase/parser/NamespaceDetailsFactory.java
@@ -13,11 +13,11 @@
 
     private List<NamespaceDetails> namespaceDetails = new ArrayList<NamespaceDetails>();
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = null;
     }
 
-    public static NamespaceDetailsFactory getInstance() {
+    public static synchronized NamespaceDetailsFactory getInstance() {
         if (instance == null) {
             instance = new NamespaceDetailsFactory();
         }
